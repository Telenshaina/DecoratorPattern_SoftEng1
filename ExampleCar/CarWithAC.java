// Class - Concrete Decorators
public class CarWithAC implements CarDecorator {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public String assemble() {
        return car.assemble() + " AC added.";
    }
}
