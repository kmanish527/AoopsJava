package Design_Patterns.BehaviouralPattern.ObserverPattern;

import Design_Patterns.BehaviouralPattern.ObserverPattern.Observer;

public class User3 implements Observer {
    @Override
    public void Update(String msg) {
        System.out.println("User 3 "+ msg);
    }
}
