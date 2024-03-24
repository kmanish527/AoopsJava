package BehaviouralPattern.ObserverPattern;

public interface Subject {
    void RegisterObserver(Observer observer);

    void UnRegisterobserver(Observer observer);

    void NotifyObserver(String msg);
}
