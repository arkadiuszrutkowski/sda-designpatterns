package pl.sda.behavioral.visitor;

public class Socks implements Visitable {

    private final int price;

    public Socks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
