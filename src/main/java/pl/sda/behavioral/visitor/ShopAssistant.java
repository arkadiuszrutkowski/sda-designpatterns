package pl.sda.behavioral.visitor;

public class ShopAssistant implements Visitor {
    public void visit(Book book) {
        System.out.println("Scanning barcode " + book.getBarCode());
        System.out.println("Price: " + book.getPrice());
    }

    public void visit(Onion onion) {
        System.out.println("Checking weight " + onion.getWeight());
        System.out.println("Price: " + onion.getPrice());
    }

    public void visit(Socks socks) {
        System.out.println("Taking of metal clip");
        System.out.println("Price: " + socks.getPrice());
    }
}
