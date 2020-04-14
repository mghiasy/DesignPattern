package customers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Dependency injection with Java Config + classpath scanning + autowiring
//We dont have any XML file
//there is a configuration class --> but there is nothing in it
@Configuration
//class path scanning
@ComponentScan
public class AppConfig {

}
