package bank.email;

import bank.domain.Customer;
import bank.email.IEmailSender;

public class EmailSender implements IEmailSender {
    //declare a private static instance of the class --> so it is unique and private and static
    private static EmailSender emailSender;
    // 1) make constructor private
    public EmailSender() { }

    // 2) Create a static factory class to generate singleton
    public static EmailSender getEmailSender()
    {
        //check if is not created before then create it
        if(emailSender == null){
            //Synchronized Blocks in Instance Methods -->synchronized(this)
            //Synchronized Blocks in Static Methods --> synchronized(MyClass.class)
            synchronized (EmailSender.class){
                if(emailSender == null) {
                    //create an instance here
                    emailSender = new EmailSender();
                }
            }
        }
        //return created instance
        return emailSender;
    }

    @Override
    public void sendEamil(String message) {
        System.out.println("Send Eamil to cusrtomer from EamilSender message: "+ message);
    }
}
