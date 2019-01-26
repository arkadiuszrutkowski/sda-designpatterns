package pl.sda.behavioral.visitor;

public class Onion implements Visitable {

    private final double weight;
    private final int price;

    public Onion(double weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
