package pl.sda.creational.abstract_factory;

public class CircleAndSphereFactory implements ShapeFactory {
    public Shape2D createShape2D() {
        return new Circle();
    }

    public Shape3D createShape3D() {
        return new Sphere();
    }
}
