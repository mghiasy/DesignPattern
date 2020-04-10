package bank.dao;

import bank.domain.Account;

import java.util.Collection;

public class AccountDAOLogger extends AccountDecorator{

    //in Constructor we should set what we want to decorate
    public AccountDAOLogger(IAccountDAO decoratedDAO) {
        super(decoratedDAO);
    }

    //Every method we want to decorate should be overridden and then first do the log then delegated to decorated class through supper
    @Override
    public void saveAccount(Account account) {
        System.out.println("Logging : saveAccount with accountNo :"+account.getAccountnumber());
        super.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("Logging : updateAccount with accountNo :"+account.getAccountnumber());
        super.updateAccount(account);
    }

    @Override
    public Account loadAccount(long accountnumber) {
        System.out.println("Logging : updateAccount with accountNo :"+ accountnumber);
        return super.loadAccount(accountnumber);
    }

    @Override
    public Collection<Account> getAccounts() {
        System.out.println("Logging : getAccounts");
        return super.getAccounts();
    }
}
