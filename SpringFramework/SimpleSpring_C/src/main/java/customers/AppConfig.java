package customers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Dependency injection with Java Config
//Here we dont have any XML file
@Configuration
public class AppConfig {
    @Bean
    public ILogger logger(){
        return new Logger();
    }

    @Bean
    //create bean
    public ICustomerService customerService(){
        CustomerService customerService = new CustomerService();
        //Do the in injection
        customerService.setCustomerDAO(customerDAO());
        customerService.setEmailSender(emailSender());
        //return the bean
        return customerService;
    }
    @Bean
    public IEmailSender emailSender(){
        EmailSender emailSender= new EmailSender();
        //we should use method instead of parameter name
        //if it is defined in the setter method by Interface needs to be downcast
        //public void setLogger(Logger logger) { this.logger=logger; } -->  emailSender.setLogger((Logger) logger());

        //** It is better to both be Interface
        emailSender.setLogger(logger());
        return emailSender;
    }
    @Bean
    public ICustomerDAO customerDAO(){
        CustomerDAO customerDAO= new CustomerDAO();
        customerDAO.setLogger(logger());
        return customerDAO;
    }

}
