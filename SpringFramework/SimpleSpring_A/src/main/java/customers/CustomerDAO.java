package customers;

public class CustomerDAO implements ICustomerDAO{
	//private ILogger logger = new Logger();
	private ILogger logger;
//for constructor injection
	public CustomerDAO(ILogger logger) {
		this.logger = logger;
	}

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

	//can create a constructor and use const injection
	//Setter methods for injection
	//public void setLogger(ILogger logger) { this.logger=logger; }
}
