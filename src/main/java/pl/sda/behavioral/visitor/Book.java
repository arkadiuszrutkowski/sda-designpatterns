package pl.sda.behavioral.visitor;

public class Book implements Visitable {

    private final String barCode;
    private final int price;

    public Book(String barCode, int price) {
        this.barCode = barCode;
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getPrice() {
        return price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
