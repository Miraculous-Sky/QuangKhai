package observer;

public interface Observable {
    void addSubscriber(Observer observer);

    void removeSubscriber(Observer observer);

    void notifySubscribers(Object data);

    void notifySubscribers();
}