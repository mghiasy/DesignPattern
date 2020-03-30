package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class AddressFilterIterator<Customer> implements Iterator {
    private final List<Customer> list;
    private int position;
    private Predicate<Customer> predicate;
    //private Iterator<Customer> customerIterator;

    public AddressFilterIterator(List<Customer> list,Predicate<Customer> predicate) {
        this.list = list;
        this.position = 0;
        this.predicate=predicate;
       // this.customerIterator= list.iterator();
    }

    @Override
    public boolean hasNext() {
        int tempPosition = position;
        while(tempPosition<list.size()){
            Customer nextElement = list.get(tempPosition);
            if(predicate.test(nextElement)){
                return true;
            }
            else{
                tempPosition++;
            }
        }
        return false;
   //     return customerIterator.hasNext();
    }

    @Override
    public Object next() {
        int tempPosition = position;
        while(tempPosition<list.size()) {
            Customer nextElement = list.get(tempPosition);
            if (predicate.test(nextElement)) {
                position=tempPosition+1;
                return nextElement;
            } else {
                tempPosition++;
            }
        }
        return null;
      //  return customerIterator.next();
    }
}
