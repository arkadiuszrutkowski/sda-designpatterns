package pl.sda.creational.abstract_factory;

public class RectangleAndCubeFactory implements ShapeFactory {
    public Shape2D createShape2D() {
        return new Rectangle();
    }

    public Shape3D createShape3D() {
        return new Cube();
    }
}
