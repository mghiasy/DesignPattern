package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("Test")
//We should implement the mock from Intf to do the injection
public class CustomerDAOMock implements ICustomerDAO{
//no need to logger in Mock
    public void save(Customer customer) {
        System.out.println("CustomerDAOMock: saving customer "+customer.getName());
    }
}
