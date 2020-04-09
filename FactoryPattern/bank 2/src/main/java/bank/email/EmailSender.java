package bank.email;

import bank.domain.Customer;
import bank.email.IEmailSender;

public class EmailSender implements IEmailSender {
    @Override
    public void sendEamil(String message) {
        System.out.println("Send Eamil to cusrtomer from EamilSender message: "+ message);
    }
}
