public class StolenCar extends CameraHandler{

    public StolenCar(CameraHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.getLicencePlate().equals("222222")){
            notifyPolice();
        }
        else{
            nextHandler.handle(cameraRecord);
        }

    }

    void notifyPolice(){
        System.out.println("Notify police for the stolen car");
    }
}
