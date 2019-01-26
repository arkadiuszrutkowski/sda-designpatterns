package pl.sda.creational.factory_method;

import pl.sda.creational.factory_method2.Circle;
import pl.sda.creational.factory_method2.Rectangle;
import pl.sda.creational.factory_method2.Shape;

public class ShapeFactory {

    public static Shape create(String shapeName) {
        if (shapeName.equals("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equals("Circle")) {
            return new Circle();
        } else {
            throw new IllegalArgumentException("Nieznany ształt");
        }
    }
}
