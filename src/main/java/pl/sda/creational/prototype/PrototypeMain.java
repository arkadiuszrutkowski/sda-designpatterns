package pl.sda.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeMain {

    public static void main(String[] args) {
        Map<String, Shape> prototypes = new HashMap<String, Shape>();
        prototypes.put("Rectangle", new Rectangle());
        prototypes.put("Circle", new Circle());

        ShapeCreator creator = new ShapeCreator(prototypes);
        Shape circleShape = creator.createNewShape("Circle");
        Shape rectangleShape = creator.createNewShape("Rectangle");
        circleShape.draw();
        rectangleShape.draw();
    }
}
