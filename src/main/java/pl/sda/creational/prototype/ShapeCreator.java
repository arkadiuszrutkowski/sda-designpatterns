package pl.sda.creational.prototype;

import java.util.Map;

public class ShapeCreator {

    private final Map<String, Shape> prototypes;

    public ShapeCreator(Map<String, Shape> prototypes) {
        this.prototypes = prototypes;
    }

    public Shape createNewShape(String shapeName) {
        return prototypes.get(shapeName).copy();
    }
}
