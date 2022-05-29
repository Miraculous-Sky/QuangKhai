package model.observer;

import java.util.ArrayList;
import java.util.List;

public class ClockObservable implements Observable {
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
    public void notifySubscribers(Object newTime) {
        for (Observer observer : observers) {
            observer.update(newTime);
        }
    }
}
