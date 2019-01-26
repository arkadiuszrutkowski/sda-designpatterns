package pl.sda.behavioral.visitor;

public interface Visitable {

    void accept(Visitor visitor);
}
