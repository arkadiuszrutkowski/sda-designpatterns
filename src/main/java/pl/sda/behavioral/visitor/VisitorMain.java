package pl.sda.behavioral.visitor;

public class VisitorMain {

    public static void main(String[] args) {
        ShopAssistant assistant = new ShopAssistant();

        Book book = new Book("123456", 13);
        Onion onion = new Onion(2, 4);
        Socks socks = new Socks(10);

        assistant.visit(book);
        System.out.println("---");
        assistant.visit(onion);
        System.out.println("---");
        assistant.visit(socks);
    }
}
