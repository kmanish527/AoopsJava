package Design_Patterns.CreationalPattern.singleton;
//Early/Eager initialization - object is created at the load time and returned when required
//disadvantage - object is created even when there is no requirement

public class SingletonEarlyMethod {
    private static SingletonEarlyMethod Singleton = new SingletonEarlyMethod();

    public static SingletonEarlyMethod getSingletonEarly(){
        return Singleton;
    }
}
