package pl.sda.creational.abstract_factory;

public class ShapeFactoryMain {

    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleAndSphereFactory();
        ShapeFactory rectangleFactory = new RectangleAndCubeFactory();
        createAndDrawShape(circleFactory);
        createAndDrawShape(rectangleFactory);
    }

    public static void createAndDrawShape(ShapeFactory factory) {
        Shape2D shape2D = factory.createShape2D();
        shape2D.draw();
        Shape3D shape3D = factory.createShape3D();
        shape3D.draw();
    }
}
