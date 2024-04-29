package Design_Patterns.BehaviouralPattern.ObserverPattern;

import Design_Patterns.BehaviouralPattern.ObserverPattern.Observer;

public interface Subject {
    void RegisterObserver(Observer observer);

    void UnRegisterobserver(Observer observer);

    void NotifyObserver(String msg);
}
