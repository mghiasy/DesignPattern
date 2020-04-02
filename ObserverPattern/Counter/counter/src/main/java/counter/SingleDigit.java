package counter;

public class SingleDigit extends  CounterState{
    SingleDigit(Counter counter) {
        super(counter);
    }

    @Override
    public int computeDigit() {
        int value= counter.getCount()+1;
        //value = value +1;
        if(value>=10){
            counter.setCounterState((new DoubleDigit(counter)));
        }
        return 1;
    }
}
