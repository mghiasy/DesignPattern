package bank.dao;

import bank.domain.Account;

import java.util.Collection;

//we want to write a decorator for accountDAO
//For the class that wants to Decorate

//Implements IAccountDAO, so wants to decorate sth of type IAccountDAO
//This is abstract --> concrete is AccountDAOLogger
public abstract class AccountDecorator implements IAccountDAO {
    //It both implements and has relation with what wants to decorate
    IAccountDAO decoratedDAO;

    //in Constructor we say what we want to decorate
    public AccountDecorator(IAccountDAO decoratedDAO) {
        super();
        this.decoratedDAO = decoratedDAO;
    }

    //All methods is delegated to whatever is decorated
    @Override
    public void saveAccount(Account account) {
        decoratedDAO.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        decoratedDAO.updateAccount(account);
    }

    @Override
    public Account loadAccount(long accountnumber) {
        return decoratedDAO.loadAccount(accountnumber);
    }

    @Override
    public Collection<Account> getAccounts() {
        return decoratedDAO.getAccounts();
    }
}
