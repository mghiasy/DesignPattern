package counter;

public class DecrementCommand extends CounterCommands {

    public DecrementCommand(Counter counter) {
        super(counter);
    }

    @Override
    public void execute() {
        counter.decrement();
    }

    @Override
    public void unexecute() {
        counter.increment();
    }
}
