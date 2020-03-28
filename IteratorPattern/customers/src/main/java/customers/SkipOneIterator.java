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
        return position++ >=0;
    }

    @Override
    public Object next() {
        return list.get(position +2);
    }
}
