package pl.sda.behavioral.state;

public class PackageDeliveredState extends DeliveryState {

    public void print() {
        System.out.println("Package delivered. Another satisfied customer!");
    }
}
