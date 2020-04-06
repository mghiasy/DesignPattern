public class FastCar extends CameraHandler{

    public FastCar(CameraHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.getSpeed() > 100){
            sendSpeedingTicket();
        }
        else{
            nextHandler.handle(cameraRecord);
        }
    }

    public void sendSpeedingTicket(){
        System.out.println("send SpeedingTicket ");
    }
}
