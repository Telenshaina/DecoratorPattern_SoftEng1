//Class - Concrete Decorator
public class CarWithGPS implements CarDecorator {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public String assemble() {
        return car.assemble() + " GPS added.";
    }
}
