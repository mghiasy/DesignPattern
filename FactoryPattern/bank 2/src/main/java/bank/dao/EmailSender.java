package bank.dao;

import bank.domain.Customer;

public class EmailSender implements IEmailSender{
    @Override
    public void sendEamil(Customer customer) {
        System.out.println("Send Eamil to cusrtomer from EamilSender to customer: "+ customer.getName());
    }
}
