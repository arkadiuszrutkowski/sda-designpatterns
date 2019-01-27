package pl.sda.behavioral.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        ShoppingClient client = new ShoppingClient();
        client.pay(new BlikStrategy());
        System.out.println("---");
        client.pay(new PayPalStrategy());
    }
}
