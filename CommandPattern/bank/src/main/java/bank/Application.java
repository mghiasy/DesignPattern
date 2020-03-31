package bank;

import java.util.Collection;

import bank.domain.*;
import bank.service.AccountService;
import bank.service.IAccountService;



public class Application {
	public static void main(String[] args) {
		IAccountService accountService = new AccountService();
		HistoryCommand historyCommand = new HistoryCommand();
		// create 2 accounts;
		Account account1=accountService.createAccount(1263862, "Frank Brown");
		Account account2=accountService.createAccount(4253892, "John Doe");
		//use account 1;
		//accountService.deposit(1263862, 240);
		//use command classes
		IBankCommands depositCommand = new DepositCommand(account1,240);
		depositCommand.execute();
		historyCommand.addCommand(depositCommand);
		//accountService.deposit(1263862, 529);
		IBankCommands depositCommand2 = new DepositCommand(account1,529);
		depositCommand2.execute();
		historyCommand.addCommand(depositCommand2);
		//accountService.withdraw(1263862, 230);
		IBankCommands withdrawCommand2 = new WithdrawCommand(account1,529);
		withdrawCommand2.execute();
		historyCommand.addCommand(withdrawCommand2);
		//use account 2;
		//accountService.deposit(4253892, 12450);
		IBankCommands depositCommand3 = new DepositCommand(account2,12450);
		depositCommand3.execute();
		historyCommand.addCommand(depositCommand3);
		//accountService.transferFunds(4253892, 1263862, 100, "payment of invoice 10232");
		IBankCommands transferFundsCommand3 = new TransferFundsCommand(account2,account1,100, "payment of invoice 10232");
		transferFundsCommand3.execute();
		historyCommand.addCommand(transferFundsCommand3);
		// show balances
		
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate()
						.toString(), entry.getDescription(), entry.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
		}
	}

}


