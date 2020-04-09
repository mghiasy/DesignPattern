package bank.factory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.email.EmailSender;
import bank.email.IEmailSender;
import bank.factory.MyFactory;

public class ProductionFactory implements MyFactory {
    @Override
    public IAccountDAO getAccountDAO() {
        return new AccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {
        return new EmailSender();
    }
}
