package pl.sda.creational.factory_method2;

public class RectangleFactory implements ShapeFactory {
    public Shape create() {
        return new Rectangle();
    }
}
