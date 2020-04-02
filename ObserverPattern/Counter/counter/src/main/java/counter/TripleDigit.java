package counter;

public class TripleDigit extends  CounterState{
    TripleDigit(Counter counter) {
        super(counter);
    }

    @Override
    public int computeDigit() {
//        int value= counter.getCount();
//        value = value +3;
        return 3;
    }
}
