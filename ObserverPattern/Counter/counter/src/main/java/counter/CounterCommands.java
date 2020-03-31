package counter;

public abstract class CounterCommands {
    protected Counter counter;

    public CounterCommands(Counter counter) {
        this.counter = counter;
    }

    public abstract void execute();
    public abstract void unexecute();
}
