package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("One")
public class CustomerDAO implements ICustomerDAO{
	//private ILogger logger = new Logger();
	private ILogger logger;
	public void save(Customer customer) {
		// simple sleep
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerDAO: saving customer "+customer.getName());
		logger.log("Customer is saved in the DB: "+ customer.getName() );
	}

	@Autowired
	public void setLogger(ILogger logger) {
		this.logger=logger;
	}
}
