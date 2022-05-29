package observer;

import java.util.ArrayList;
import java.util.List;

public class ThermometerObservable implements Observable {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers(Object data) {

    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
