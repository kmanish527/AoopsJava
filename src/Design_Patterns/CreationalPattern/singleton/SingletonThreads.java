package Design_Patterns.CreationalPattern.singleton;
//We are applying thread synchronization in this program because
//when multiple threads are assigned with same job at same time then multiple threads will create multiple objects
//so to avoid this we use block synchronization - technique
//we don't prefer to use method synchronization - technique because
//when after creation of 1 object when a task is assigned to return the same object to multiple threads, then threads can't do the work simultaneously each thread needs to wait for the previous thread to return

public class SingletonThreads {
    private SingletonThreads(){

    }
    private static SingletonThreads singletonT;

//    public static SingletonThreads getSingletonT(){ //normal
//        if(singletonT==null){
//            singletonT=new SingletonThreads();
//        }
//    return singletonT;
//}

//public static synchronized SingletonThreads getSingletonT(){ //method synchronization
//    if(singletonT==null){
//        singletonT=new SingletonThreads();
//    }
//        return singletonT;
//    }

//    synchronized (object reference expression) {
//         code block
//    }
// In Java, when we want to synchronize a static method, we use the .class reference of the class in the synchronized block. ]
// This is because static methods belong to the class itself, not to any instance of the class.
public static SingletonThreads getSingletonT(){ //method synchronization
    if(singletonT==null){
       synchronized (SingletonThreads.class){
           if(singletonT==null){
                singletonT=new SingletonThreads();
          }
       }
    }
        return singletonT;
    }

}
