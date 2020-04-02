package counter;

public abstract class CounterState {
    protected Counter counter;
    CounterState(Counter counter){
        this.counter=counter;
    }
    public abstract int computeDigit();

}
