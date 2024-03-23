package CreationalPattern.singleton;
//Lazy initialization - Object is initialized when required
//better then Early Initialization

public class SingletonLazyMethod {
//1.create a private constructor - no one can create an object outside from class
    private SingletonLazyMethod(){

    }
//                   int                 a
//2.create a variable of class type to store the object
    private static SingletonLazyMethod Singleton;//by default static objects are initialed by null
//3.make static get method to avoid creating object to use this method
    public static SingletonLazyMethod getSingletonLazy(){
        if(Singleton==null){
            Singleton = new SingletonLazyMethod();
        }
            return Singleton;
    }
}
