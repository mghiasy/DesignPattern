package customers;

import java.util.Iterator;
import java.util.List;

public class SkipOneIterator<T> implements Iterator {
    private int position;
    private final List<T> list;

    public SkipOneIterator(List<T> likst) {
        this.position = 0;
        this.list = likst;
    }

    @Override
    public boolean hasNext() {
        int tempPosition = position;
        while (tempPosition + 1 <= list.size())
            return true;
    return false;
    }

    @Override
    public Object next() {
       int tempPosition = position;
        while (tempPosition + 1 <= list.size()) {
            position = tempPosition + 2;
            return list.get(tempPosition);
        }
        return null;
    }
}
