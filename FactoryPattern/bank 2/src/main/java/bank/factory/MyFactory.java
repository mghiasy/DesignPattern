package bank.factory;

import bank.dao.IAccountDAO;
import bank.email.IEmailSender;

//better to have a package of factory to separate them from other codes
public interface MyFactory {
    //both methods returns sth of type interface
    IAccountDAO getAccountDAO();
    IEmailSender getEmailSender();

}
