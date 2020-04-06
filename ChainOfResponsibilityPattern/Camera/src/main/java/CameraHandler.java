public abstract class CameraHandler {
    protected  CameraHandler nextHandler;
    public abstract void handle(CameraRecord cameraRecord);

    public CameraHandler(CameraHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
