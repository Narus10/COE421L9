import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;

    public ConcreteSubject() {
        observers = new ArrayList<Observer>();
    }

    public void notifyObservers(String a, int b) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(a, b);
        }
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
