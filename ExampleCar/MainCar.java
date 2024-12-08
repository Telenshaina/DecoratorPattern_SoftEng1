public class MainCar {
    public static void main(String[] args) {
        // Create the basic car
        Car basicCar = new BasicCar();

        // Decorate the car with AC
        CarWithAC acCar = new CarWithAC();
        acCar.setCar(basicCar);

        // Decorate the car with GPS
        CarWithGPS gpsCar = new CarWithGPS();
        gpsCar.setCar(acCar);

        // Display the assembled car
        System.out.println(gpsCar.assemble());
    }
}
