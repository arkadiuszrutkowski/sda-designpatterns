package pl.sda.behavioral.templatemethod;

public abstract class PaymentTemplate {

    public void pay() {
        System.out.println("Preparing payment");
        initiatePayment();
        System.out.println("Payment accepted");
    }

    public abstract void initiatePayment();
}
