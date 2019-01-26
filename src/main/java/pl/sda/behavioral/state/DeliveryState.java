package pl.sda.behavioral.state;

public abstract class DeliveryState {

    protected void updateState(Package yourPackage) {
        // no-op
    }

    protected abstract void print();
}
