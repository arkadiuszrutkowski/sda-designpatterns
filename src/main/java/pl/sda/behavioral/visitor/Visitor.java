package pl.sda.behavioral.visitor;

public interface Visitor {

    void visit(Book book);

    void visit(Onion onion);

    void visit(Socks socks);
}
