package pl.sda.behavioral.state;

public class StateMain {

    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printState();
        pkg.updatePackageState();
        pkg.printState();
        pkg.updatePackageState();
        pkg.printState();
    }
}
