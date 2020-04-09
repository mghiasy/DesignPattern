package bank.factory;

import bank.dao.IAccountDAO;
import bank.dao.MockAccountDAO;
import bank.email.IEmailSender;
import bank.email.MockEmailSender;

public class MockFactory implements MyFactory {
    @Override
    public IAccountDAO getAccountDAO() {
        return new MockAccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {

        return new MockEmailSender();
    }
}
