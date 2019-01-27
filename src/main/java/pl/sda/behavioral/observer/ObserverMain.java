package pl.sda.behavioral.observer;

public class ObserverMain {

    public static void main(String[] args) {
        Button button = new Button();
        button.addOnClickObserver(new OnClickObserver() {
            public void onClick() {
                System.out.println("Button clicked!");
            }
        });
        button.addOnClickObserver(new OnClickObserver() {
            public void onClick() {
                System.out.println("Button clicked! #1");
            }
        });
        button.addOnClickObserver(new OnClickObserver() {
            public void onClick() {
                System.out.println("Button clicked! #2");
            }
        });
        button.click();
    }
}
