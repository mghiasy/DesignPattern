package bank.email;

import bank.domain.Customer;

//for every business different packages
public interface IEmailSender {
    void sendEamil(Customer customer);
}
