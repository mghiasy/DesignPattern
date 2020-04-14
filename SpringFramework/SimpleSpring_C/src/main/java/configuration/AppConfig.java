package configuration;

import customers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ICustomerService icustomerService(){
        CustomerService customerService = new CustomerService();
        customerService.setCustomerDAO(customerDAO);
        customerService.setEmailSender(emailSender);
        return customerService;
    }
    @Bean
    public IEmailSender iemailSender(){
        EmailSender emailSender= new EmailSender();
        emailSender.setLogger(logger);
        return emailSender;
    }
    @Bean
    public ICustomerDAO icustomerDAO(){
        CustomerDAO customerDAO= new CustomerDAO();
        customerDAO.setLogger(logger);
        return customerDAO;
    }
    @Bean
    public ILogger logger(){
        return new Logger();
    }
}
