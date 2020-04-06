public class UnpaidTicket extends CameraHandler{

    public UnpaidTicket(CameraHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.getLicencePlate().equals("444444")){
            notifyPolice();
        }
        else{
            nextHandler.handle(cameraRecord);
        }
    }
    void notifyPolice(){
        System.out.println("Notify police for the unpaid ticket car");
    }
}
