package bank.factory;

import bank.dao.IAccountDAO;
import bank.email.IEmailSender;

public interface MyFactory {
    IAccountDAO getAccountDAO();
    IEmailSender getEmailSender();

}
