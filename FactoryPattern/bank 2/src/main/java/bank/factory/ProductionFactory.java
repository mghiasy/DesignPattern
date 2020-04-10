package bank.factory;

import bank.dao.AccountDAO;
import bank.dao.AccountDAOLogger;
import bank.dao.IAccountDAO;
import bank.email.EmailSender;
import bank.email.IEmailSender;
import bank.factory.MyFactory;

public class ProductionFactory implements MyFactory {
    @Override
    public IAccountDAO getAccountDAO() {
        //since DAO will be created through Factory, To put logger in front of it, we should go to factories, in method getAccountDAO

        //first create an accountDAO of type parent
        IAccountDAO accountDAO= new AccountDAO();
        //then we put logger in front of it
        //this is a reference to AccountDAOLogger and logger is a reference to AccountDAO
        accountDAO= new AccountDAOLogger(accountDAO);
        return accountDAO;
    }

    @Override
    public IEmailSender getEmailSender() {
        return new EmailSender();
    }
}
