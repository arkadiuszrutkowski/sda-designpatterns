package pl.sda.behavioral.strategy;

public class ShoppingClient {

    public void pay(PaymentStrategy strategy) {
        System.out.println("Preparing to pay");
        strategy.pay();
        System.out.println("Payment accepted");
    }
}
