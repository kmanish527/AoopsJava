package Design_Patterns.BehaviouralPattern.ObserverPattern;

import Design_Patterns.BehaviouralPattern.ObserverPattern.Observer;

public class User1 implements Observer {
    public void Update(String msg){
        System.out.println("User 1 " + msg);
    }
}
