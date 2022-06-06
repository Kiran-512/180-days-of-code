/*
Singleton class is the type of class which can be instaciated only once.
We can create the single object of the such class  
*/

public class Singleton {

  private static Singleton Instance;

  // by making contructor private we invoke contructor only once which is factory of making objects
  private Singleton() {
    System.out.println("Invoked");
  }

  public static Singleton getInstance() { // here return type is of Singleton type as we are retruing the object of Singleton class
    if (Instance == null) {
      Instance = new Singleton();
    }

    return Instance;
  }

  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}
/*
Invoked
Singleton@3fee733d
Singleton@3fee733d
Singleton@3fee733d
Singleton@3fee733d
*/

//Another way
/*
public class Singleton {

  private static Singleton Instance = new Singleton();

  private Singleton() {
    System.out.println("Invoked");
  }

  public static Singleton getInstance() { // here return type is of Singleton type as we are retruing the object of Singleton class
    return Instance;
  }

  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    Singleton s1 = Singleton.getInstance();
 
    }

}
*/