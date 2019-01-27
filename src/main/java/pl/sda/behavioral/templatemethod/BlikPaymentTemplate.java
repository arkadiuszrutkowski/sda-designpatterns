package pl.sda.behavioral.templatemethod;

public class BlikPaymentTemplate extends PaymentTemplate {
    public void initiatePayment() {
        System.out.println("Pay via BLIK");
    }
}
