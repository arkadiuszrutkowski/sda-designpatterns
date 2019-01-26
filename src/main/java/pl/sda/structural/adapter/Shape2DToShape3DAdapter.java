package pl.sda.structural.adapter;

public class Shape2DToShape3DAdapter implements Shape2D {

    private final Shape3D shape3D;

    public Shape2DToShape3DAdapter(Shape3D shape3D) {
        this.shape3D = shape3D;
    }

    public void draw2D() {
        shape3D.draw3D();
    }
}
