package counter;

public class OrangeHandler  extends CountHandler{
    public OrangeHandler(CountHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(int count) {
        if((count %2 != 0)&& ((count>=15)||(count!=17)||(count!=19))){
            System.out.println("ORANGE");
        }
        else {
            nextHandler.handle(count);
        }

    }
}
