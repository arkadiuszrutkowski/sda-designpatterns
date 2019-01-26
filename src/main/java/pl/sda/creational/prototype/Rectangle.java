package pl.sda.creational.prototype;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Jestem prostokątem!");
    }

    public Shape copy() {
        return new Rectangle();
    }
}
