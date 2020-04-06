public class Application {
    public static void main(String[] args) {
        //High Speed
        CameraRecord cameraRecord = new CameraRecord(200,"11223344");
        CameraHandler fastCar = new FastCar(null);
        CameraHandler unpaidTicket = new UnpaidTicket(fastCar);
        CameraHandler notRecognizedCar = new NotRecognisedCar(unpaidTicket);
        CameraHandler stolenCar= new StolenCar(notRecognizedCar);

        cameraRecord.setCameraHandler(stolenCar);
        cameraRecord.receiveLicensePlate();

//Stolen car
        CameraRecord cameraRecord2 = new CameraRecord(35,"222222");
        CameraHandler fastCar2 = new FastCar(null);
        CameraHandler unpaidTicket2 = new UnpaidTicket(fastCar2);
        CameraHandler notRecognizedCar2 = new NotRecognisedCar(unpaidTicket2);
        CameraHandler stolenCar2= new StolenCar(notRecognizedCar2);

        cameraRecord2.setCameraHandler(stolenCar2);

        //Not recognized car
        CameraRecord cameraRecord3 = new CameraRecord(55,"333333");
        CameraHandler fastCar3 = new FastCar(null);
        CameraHandler unpaidTicket3 = new UnpaidTicket(fastCar3);
        CameraHandler notRecognizedCar3 = new NotRecognisedCar(unpaidTicket3);
        CameraHandler stolenCar3= new StolenCar(notRecognizedCar3);

        cameraRecord3.setCameraHandler(stolenCar3);


        //unpaid ticket car
        CameraRecord cameraRecord4 = new CameraRecord(54,"444444");
        CameraHandler fastCar4 = new FastCar(null);
        CameraHandler unpaidTicket4 = new UnpaidTicket(fastCar4);
        CameraHandler notRecognizedCar4 = new NotRecognisedCar(unpaidTicket4);
        CameraHandler stolenCar4= new StolenCar(notRecognizedCar4);

        cameraRecord4.setCameraHandler(stolenCar4);

        cameraRecord.receiveLicensePlate();
    }
}
