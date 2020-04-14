package customers;

public class CustomerService implements ICustomerService {
	//Here we have to attr and should inject them via setter method
	ICustomerDAO customerDAO ;//= new CustomerDAO();
	IEmailSender emailSender ;//= new EmailSender();

	public void addCustomer(String name, String email, String street,
			String city, String zip) {
		Customer customer = new Customer(name, email);
		Address address = new Address(street, city, zip);
		customer.setAddress(address);
		customerDAO.save(customer);
		emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
	}

	//Setter methods for injection
    public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO=customerDAO;
    }

	public void setEmailSender(EmailSender emailSender) {
		this.emailSender=emailSender;
	}
}
