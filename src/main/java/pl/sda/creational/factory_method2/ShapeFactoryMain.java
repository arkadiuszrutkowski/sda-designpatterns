package pl.sda.creational.factory_method2;

public class ShapeFactoryMain {

    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        createAndDrawShape(circleFactory);
        createAndDrawShape(rectangleFactory);
    }

    public static void createAndDrawShape(ShapeFactory factory) {
        Shape shape = factory.create();
        shape.draw();
    }
}
