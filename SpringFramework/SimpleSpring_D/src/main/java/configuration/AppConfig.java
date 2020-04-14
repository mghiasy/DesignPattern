package configuration;

import customers.CustomerService;
import customers.ICustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public CustomerService icustomerService(){
        return new CustomerService();
    }

}
