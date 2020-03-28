package customers;

import java.util.Iterator;
import java.util.List;

public class AgeIterator implements Iterator {
    private  final List<Customer> customerList;
    private int position;

    public AgeIterator(List<Customer> customerList) {

        this.customerList = customerList;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        return position>=0;
    }

    @Override
    public Object next() {
        return customerList.get(position++);
    }
}
