package counter;

public class DoubleDigit extends  CounterState{
    DoubleDigit(Counter counter) {
        super(counter);
    }

    @Override
    public int computeDigit() {
        int value= counter.getCount()+2;
        //value=value+2;
        if(value>=100){
            counter.setCounterState(new TripleDigit(counter));
        }
        return 2;
    }
}
