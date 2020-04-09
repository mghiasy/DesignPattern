package bank.service;

import java.lang.reflect.Proxy;
import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.proxies.LoggingProxy;
import bank.proxies.TimingProxy;
import bank.service.adapter.AccountAdapter;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	private AccountAdapter accountAdapter= new AccountAdapter();

	public AccountService(){

		IAccountDAO newAccDAO=new AccountDAO();

		//typically we use factory class instead of creating the class here

		//this proxy is supposed to be in front of Account so in constructor we create the accountDAO
		//returns the class loader for the class which called this method. If this class is loaded by the bootstrap class loader, then it will return null.
		ClassLoader classLoader = AccountDAO.class.getClassLoader();
		//Logging proxy cannot be used for the object that is null
		IAccountDAO theLoggerAccountDAO = (IAccountDAO) Proxy.newProxyInstance(classLoader,new Class[]{IAccountDAO.class},new LoggingProxy(newAccDAO));
		accountDAO = (IAccountDAO) Proxy.newProxyInstance(classLoader,new Class[]{IAccountDAO.class},new TimingProxy(theLoggerAccountDAO));
		//to add timing proxy we need to add it logging proxy
		//Spring, Hibernate,... have implemented proxy , u can only use them with annotations
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		//when we call accountDAO.saveAccount it calls the timer, the timer will call the logger, logger prints tha data, then it goes to accountDAO
		//then it goes back to logger, then to the timer, timer get the finish time and prints how long it took
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}
//use Adapter
//public AccountDTO getAccount(long accountNumber) {
//	//Account account = accountDAO.loadAccount(accountNumber);
//	//AccountDTO accountDTO =accountAdapter.getAccountDTObById(accountNumber) ;
//	return accountDTO;
//}
	public Collection<Account> getAllAccounts() {
		//So any where we have accountDAO is using loggingProxy
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
