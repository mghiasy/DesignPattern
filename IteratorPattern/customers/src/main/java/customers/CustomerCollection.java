package customers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CustomerCollection {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public void print() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	public Iterator<Customer> skip1Iterator (){
		return new SkipOneIterator<Customer>(customers);
	}
	public Iterator<Customer> addressFilterIterator(Predicate<Customer> predicate){
		return  new AddressFilterIterator(customers, predicate);
	}

}
