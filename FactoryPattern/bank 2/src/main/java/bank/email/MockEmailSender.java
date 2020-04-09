package bank.email;

import bank.domain.Customer;

public class MockEmailSender implements IEmailSender {
    @Override
    public void sendEamil(String message) {
        System.out.println("Send mock email to customer, message: "+ message);
    }
}
