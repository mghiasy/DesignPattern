public class NotRecognisedCar extends CameraHandler{

    public NotRecognisedCar(CameraHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.getLicencePlate().equals("333333")){
            sendTicket();
        }
        else{
            nextHandler.handle(cameraRecord);
        }

    }
    public void sendTicket(){
        System.out.println("send Ticket for owner");
    }
}
