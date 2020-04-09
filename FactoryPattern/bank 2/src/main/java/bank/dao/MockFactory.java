package bank.dao;

import bank.Mock.MockAccountDAO;
import bank.Mock.MockEmailSender;

public class MockFactory implements MyFactory{
    @Override
    public IAccountDAO getAccountDAO() {
        return new MockAccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {

        return new MockEmailSender();
    }
}
