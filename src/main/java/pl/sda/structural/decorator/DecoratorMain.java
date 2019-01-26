package pl.sda.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Car car = new BasicCar();
        car.assemble();

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        Car sportAndLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportAndLuxuryCar.assemble();

        Car luxuryAndSportCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxuryAndSportCar.assemble();
    }
}
