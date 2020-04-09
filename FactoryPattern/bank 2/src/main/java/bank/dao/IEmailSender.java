package bank.dao;

import bank.domain.Customer;

public interface IEmailSender {
    void sendEamil(Customer customer);
}
