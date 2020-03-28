package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class AddressFilterIterator<T> implements Iterator {
    private final List<T> list;
    private int position;
    private Predicate<T> predicate;

    public AddressFilterIterator(List<T> list,Predicate<T> predicate) {
        this.list = list;
        this.position = 0;
        this.predicate=predicate;
    }

    @Override
    public boolean hasNext() {
        int tempPosition = position;
        while(tempPosition<list.size()){
            T nextElement = list.get(tempPosition);
            if(predicate.test(nextElement)){
                return true;
            }
            else{
                tempPosition++;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        int tempPosition = position;
        while(tempPosition<list.size()) {
            T nextElement = list.get(tempPosition);
            if (predicate.test(nextElement)) {
                return nextElement;
            } else {
                tempPosition++;
            }
        }
        return null;
    }
}
