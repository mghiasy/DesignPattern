package counter;

public class RedHandler extends CountHandler{
    public RedHandler(CountHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(int count) {
        // If the counter value is even and the counter value < 10 or if the counter value is
        //even and the counter value =12 or 13 then we print in the console : “Red”
        if((count %2 == 0)&& ((count<10)||(count==12)||(count==13))){
            System.out.println("RED");
        }
        else {
            nextHandler.handle(count);
        }
    }
}
