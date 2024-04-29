package Design_Patterns.BehaviouralPattern.ObserverPattern;

import Design_Patterns.BehaviouralPattern.ObserverPattern.Observer;
import Design_Patterns.BehaviouralPattern.ObserverPattern.Subject;

import java.util.ArrayList;

public class YouTubeChannel1 implements Subject {
    ArrayList<Observer> ObserverList = new ArrayList<Observer>();

    @Override
    public void RegisterObserver(Observer observer){
        ObserverList.add(observer);
    }

    @Override
    public void UnRegisterobserver(Observer observer) {
        int index = ObserverList.indexOf(observer);
        if(index>=0){
            ObserverList.remove(index);
        }
    }

    @Override
    public void NotifyObserver(String msg) {
        for(Observer observer:ObserverList){
            observer.Update(msg);
        }
    }
}
