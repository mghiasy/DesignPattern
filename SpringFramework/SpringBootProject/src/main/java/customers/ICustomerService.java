package customers;

import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
	void addCustomer(String name, String email, String street,String city, String zip);
}
