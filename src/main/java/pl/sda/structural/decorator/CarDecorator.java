package pl.sda.structural.decorator;

public class CarDecorator implements Car {

    private final Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void assemble() {
        car.assemble();
    }
}
