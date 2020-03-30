package customers;

import java.util.*;

//we should specify the object of iterator
public class AgeIterator implements Iterator<Customer> {
    //use external iterator
    //we dont have position here
    private List<Customer> customerList;
    //private int position;
    //Iterator is abstract, cannot be instantiated ,
    private Iterator<Customer> customerIterator;

    public AgeIterator(List<Customer> customers) {
//create a copy of list not to sort in original list
        // new ArrayList<customerList>() ==>create a new empty list of type customer
        //new ArrayList<>(customerList) ==> create a new list and copy customer in it
        this.customerList = new ArrayList<>(customers);
        this.customerIterator= customers.iterator();
//sort based on age and store in new list in iterator constructor
        Collections.sort(this.customerList,Comparator.comparingInt(Customer::getAge));
    }

    @Override
    public boolean hasNext() {
        return customerIterator.hasNext();
    }

    @Override
    public Customer next() {
        return customerIterator.next();
    }
}
