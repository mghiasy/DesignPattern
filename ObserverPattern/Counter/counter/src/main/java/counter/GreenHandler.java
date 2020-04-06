package counter;

public class GreenHandler  extends CountHandler{
    public GreenHandler(CountHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(int count) {
//If the counter value is even and the counter value >= 10 but not 12 or 13 then we
//print in the console : “Green”
        if((count %2 == 0)&& ((count>=10)||(count!=12)||(count!=13))){
            System.out.println("GREEN");
        }
        else {
            nextHandler.handle(count);
        }

    }
}
