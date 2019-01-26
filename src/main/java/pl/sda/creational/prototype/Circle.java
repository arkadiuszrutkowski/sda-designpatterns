package pl.sda.creational.prototype;

public class Circle implements Shape {

    public void draw() {
        System.out.println("Jestem kołem!");
    }

    public Shape copy() {
        return new Circle();
    }
}
