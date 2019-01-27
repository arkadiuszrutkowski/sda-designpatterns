package pl.sda.behavioral.strategy;

public class BlikStrategy implements PaymentStrategy {
    public void pay() {
        System.out.println("Paying via BLIK");
    }
}
