package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring boot does not have XML file or Java configuration
//Main class is annotated by @SpringBootApplication
@SpringBootApplication
//Also Main class implements CommandLineRunner
//Other classes are the same as Dependency injection with Java Config + classpath scanning + autowiring
public class Application implements CommandLineRunner {

	@Autowired
	//Should be Auto wired with Interface rather than the class
	private ICustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerService.addCustomer("Frank Brown", "fbrown@acme.com",
				"mainstreet 5", "Chicago", "60613");
	}
}
