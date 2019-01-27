package pl.sda.behavioral.strategy;

public class PayPalStrategy implements PaymentStrategy {
    public void pay() {
        System.out.println("Payment via PayPal");
    }
}
