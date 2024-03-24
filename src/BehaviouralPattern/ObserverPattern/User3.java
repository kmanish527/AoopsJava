package BehaviouralPattern.ObserverPattern;

public class User3 implements Observer{
    @Override
    public void Update(String msg) {
        System.out.println("User 3 "+ msg);
    }
}
