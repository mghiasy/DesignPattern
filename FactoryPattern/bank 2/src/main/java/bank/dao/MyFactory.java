package bank.dao;

import bank.Mock.MockEmailSender;

public interface MyFactory {
    IAccountDAO getAccountDAO();
    IEmailSender getEmailSender();

}
