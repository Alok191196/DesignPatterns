package creational.The_Singleton_Design_Pattern;

public class ThreadSafeSingleton {

    // initialize the instance as null.
    private static ThreadSafeSingleton instance = null;

    // private constructor, so it cannot be instantiated outside this class.
    private ThreadSafeSingleton() {  }


/*
    In Java, the keyword synchronized is used on methods or objects to implement thread safety,
     so that only one thread will access a particular resource at one time.
      The class instantiation is put within a synchronized block
      so that the method can only be accessed by one client at a given time.

      The overhead for the synchronized method is high, and reduces the performance of the whole operation.
*/

    // check if the instance is null, within a synchronized block. If so, create the object
    public static ThreadSafeSingleton getInstance() {
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }


    /*
    * For example, if the instance variable has already been instantiated,
    * then each time any client accesses the getInstance() method,
    * the synchronized method is run and the performance drops.
    * This just happens in order to check if the instance variables’ value is null.
    * If it finds that it is, it leaves the method.
    * */

    // double locking is used to reduce the overhead of the synchronized method
    public static ThreadSafeSingleton getInstanceDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
