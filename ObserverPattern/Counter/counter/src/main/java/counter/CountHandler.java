package counter;

public abstract class CountHandler {
    protected CountHandler nextHandler;

    public CountHandler(CountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(int count);
}
