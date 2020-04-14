package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//for class path scanning
@Service
public class CustomerService implements ICustomerService {
	//can also put AutoWire annotation here --> But not recommended ??
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
	@Autowired
    public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO=customerDAO;
    }
	@Autowired
	public void setEmailSender(EmailSender emailSender) {
		this.emailSender=emailSender;
	}
}
