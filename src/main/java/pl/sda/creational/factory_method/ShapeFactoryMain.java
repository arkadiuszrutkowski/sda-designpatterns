package pl.sda.creational.factory_method;

import pl.sda.creational.factory_method2.Shape;

public class ShapeFactoryMain {

    public static void main(String[] args) {
        Shape rectangleShape = ShapeFactory.create("Rectangle");
        Shape circleShape = ShapeFactory.create("Circle");
        rectangleShape.draw();
        circleShape.draw();
    }
}
