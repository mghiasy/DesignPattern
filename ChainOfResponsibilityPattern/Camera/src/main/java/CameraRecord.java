public class CameraRecord {
    private int speed;
    private String licencePlate;

    public int getSpeed() {
        return speed;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public CameraRecord(int speed, String licencePlate) {
        this.speed = speed;
        this.licencePlate = licencePlate;
    }

    public void setCameraHandler(CameraHandler cameraHandler) {
        this.cameraHandler = cameraHandler;
    }

    private CameraHandler cameraHandler;

    public void receiveLicensePlate(){
        cameraHandler.handle(this);
    }
}
