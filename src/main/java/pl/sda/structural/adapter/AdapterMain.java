package pl.sda.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Shape2D shape2D = new Shape2DToShape3DAdapter(new Cube());
        Shape2D realShape2D = new Rectangle();
        printShape(shape2D);
        printShape(realShape2D);
    }

    public static void printShape(Shape2D shape2D) {
        shape2D.draw2D();
    }
}
