package pl.sda.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Button {

    private List<OnClickObserver> observers = new ArrayList<OnClickObserver>();

    public void click() {
        for (OnClickObserver observer : observers) {
            observer.onClick();
        }
    }

    public void addOnClickObserver(OnClickObserver observer) {
        this.observers.add(observer);
    }
}
