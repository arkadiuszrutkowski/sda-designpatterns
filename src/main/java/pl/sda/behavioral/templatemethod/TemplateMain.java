package pl.sda.behavioral.templatemethod;

public class TemplateMain {

    public static void main(String[] args) {
        pay(new BlikPaymentTemplate());
        System.out.println("---");
        pay(new PayPalPaymentTemplate());
    }

    public static void pay(PaymentTemplate template) {
        template.pay();
    }
}
