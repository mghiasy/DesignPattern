package counter;

public class IncrementCommand extends CounterCommands{
    public IncrementCommand(Counter counter) {
        super(counter);
     }

    @Override
    public void execute() {
        counter.increment();
    }

    @Override
    public void unexecute() {
        counter.decrement();
    }
}
