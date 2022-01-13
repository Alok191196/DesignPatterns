package creational.The_Singleton_Design_Pattern;

public class EagerSingleton {
    // create an instance of the class.
    private static EagerSingleton instance = new EagerSingleton();

    // private constructor, so it cannot be instantiated outside this class.
    private EagerSingleton() {  }

    // get the only instance of the object created.
    public static EagerSingleton getInstance() {
        return instance;
    }
}


// MUST READ

/*
    This type of instantiation happens during class loading,
     as the instantiation of the variable instance happens outside any method.
      This poses a hefty drawback if this class is not being used at all by the client application.
       The contingency plan, if this class is not being used, is the Lazy Instantiation.
*/
