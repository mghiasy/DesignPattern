package bank.service;

import java.lang.reflect.Proxy;
import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.domain.LoggingProxy;
import bank.domain.TimingProxy;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO = new AccountDAO();
	private  AccountAdapter accountAdapter= new AccountAdapter();
	ClassLoader classLoader = AccountDAO.class.getClassLoader();
	IAccountDAO loggingProxy = (IAccountDAO) Proxy.newProxyInstance(classLoader,new Class[]{IAccountDAO.class},new LoggingProxy(accountDAO));
	IAccountDAO timingProxy = (IAccountDAO) Proxy.newProxyInstance(classLoader,new Class[]{IAccountDAO.class},new TimingProxy(loggingProxy));

	public AccountService(){
		accountDAO=new AccountDAO();
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		//accountDAO.saveAccount(account);
		//use proxy
		timingProxy.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		//accountDAO.updateAccount(account);
		//use proxy
		timingProxy.updateAccount(account);
	}

//	public Account getAccount(long accountNumber) {
//		Account account = accountDAO.loadAccount(accountNumber);
//		return account;
//	}
//use Adapter
public AccountDTO getAccount(long accountNumber) {
	//Account account = accountDAO.loadAccount(accountNumber);
	AccountDTO accountDTO =accountAdapter.getAccountDTObById(accountNumber) ;
	return accountDTO;
}
	public Collection<Account> getAllAccounts() {
		//return accountDAO.getAccounts();
		//use proxy
		return timingProxy.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
	//	accountDAO.updateAccount(account);
		//use proxy
		timingProxy.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
//		accountDAO.updateAccount(fromAccount);
//		accountDAO.updateAccount(toAccount);
		//use proxy
		timingProxy.updateAccount(fromAccount);
		timingProxy.updateAccount(toAccount);
	}
}
