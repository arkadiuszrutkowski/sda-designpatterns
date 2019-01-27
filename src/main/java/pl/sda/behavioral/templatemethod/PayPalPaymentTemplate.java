package pl.sda.behavioral.templatemethod;

public class PayPalPaymentTemplate extends PaymentTemplate {
    public void initiatePayment() {
        System.out.println("Pay via PayPal");
    }
}
