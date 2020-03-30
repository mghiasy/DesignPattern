package customers;

import java.util.Iterator;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		CustomerCollection customerCollection = new CustomerCollection();
		customerCollection.add(new Customer("Frank","Brown","fbrown@gmail.com","0643267843",34, new Address("Mainstreet 10","Chicago","59223")));
		customerCollection.add(new Customer("John","Johnson","jjohnson@hotmail.com","0609834544",44, new Address("Mainstreet 2","San Fransisco","12225")));
		customerCollection.add(new Customer("Bill","Waters","bill34@gmail.com","0632416786",82, new Address("456 S 2th street","Chicago","59223")));
		customerCollection.add(new Customer("Mary","Clinton","maclinton@gmail.com","0655676689",64, new Address("421 Jeffersen Stret","New York","45231")));
		customerCollection.add(new Customer("Sue","Jackson","sue@yahoo.com","0644332256",78, new Address("101 South D street","New York","45786")));
		customerCollection.add(new Customer("Ed","Trump","edwardtrump@yahoo.com","063322667893",66, new Address("34 North E street","Chicago","59223")));
		customerCollection.add(new Customer("Bob","Brown","bobbrown@gmail.com","063245633221",26, new Address("Jeffersen Av 324","San Fransisco","12897")));
		customerCollection.add(new Customer("Eric","Vanderberg","eberg@gmail.com","0643215673",26, new Address("305 South B street","Chicago","59223")));
		customerCollection.add(new Customer("Joe","Johnson","jj@gmail.com","0643256743",48, new Address("453 N C Street","Chicago","59223")));
		customerCollection.add(new Customer("Frank","Cohen","fcohen@gmail.com","0643232178",53, new Address("Jeffersen Av 3","New York","54221")));
		customerCollection.add(new Customer("Eric","Johnson","ejohnson@hotmail.com","0612342345",36, new Address("1000 S 4th street","San Fransisco","12544")));

		//Part A
		System.out.println("Part A ------------order customers  by age------------");
		Iterator<Customer> ageIterator = customerCollection.ageIteratorFactory();
		while (ageIterator.hasNext()){
			System.out.println(ageIterator.next());
		}
//		//customerCollection
//		//Part B
//		System.out.println("Show customers iterated by address");
//		Predicate<Customer> customerPredicate = p->p.getAddress().getCity().equals("Chicago") && p.getAddress().getZip().startsWith("12");
//		Iterator<Customer> customerAddressIterator= customerCollection.addressFilterIterator(customerPredicate);
//		while (customerAddressIterator.hasNext()){
//			customerAddressIterator.next();
//		}
//		customerCollection.print();
//
//		//Part C
//		System.out.println("Show skiped 1 customers");
//		Iterator<Customer> customerIterator= customerCollection.skip1Iterator();
//		while (customerIterator.hasNext()){
//			System.out.println(customerIterator.next());
//		}
//
//		//Part D
//		//Suppose you have to write an XML parser. Draw the class diagram of the domain model for
//		//this XML parser without using the composite pattern.

	}

}
