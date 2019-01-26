package pl.sda.creational.factory_method2;

public class CircleFactory implements ShapeFactory {
    public Shape create() {
        return new Circle();
    }
}
