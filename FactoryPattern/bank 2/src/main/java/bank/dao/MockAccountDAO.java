package bank.dao;

import bank.dao.IAccountDAO;
import bank.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class MockAccountDAO implements IAccountDAO {
    @Override
    public void saveAccount(Account account) {
        System.out.println("Mock account saved");
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("Mock account updated");
    }

    @Override
    public Account loadAccount(long accountnumber) {
        System.out.println("Mock account loaded");
        return new Account(112233);
    }

    @Override
    public Collection<Account> getAccounts() {
        System.out.println("Mock accounts loaded");
        Collection<Account> accountlist = new ArrayList<Account>();
        return accountlist;
    }
}
