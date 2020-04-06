package counter;

public class BlueHandler  extends CountHandler{
    public BlueHandler(CountHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(int count) {
        //If the counter value is odd and the counter value < 15 or if the counter value is
        //odd and the counter value =17 or 19 then we print in the console : “Blue”
        if((count %2 != 0)&& ((count<15)||(count==17)||(count==19))){
            System.out.println("BLUE");
        }
        else {
            nextHandler.handle(count);
        }
    }
}
