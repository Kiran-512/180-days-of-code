/*
javap tells the metadata of the class

Reflection API will help out to WAP to get teh metadata of our class
Exceptions:
InstantiationException, IllegalAccessException, => checked exception as what if constructor is private while creating object with newInstance()
ClassNotFoundException => occurs as what if class is not there when we load the class with Class aClass = Class.forName("A");
InvocationTargetException =>occurs as what if the method is private as declared on the line m2.invoke(a);

Can we access the private method outside the class!
Yes we can invoke the private method ouside the class by using reflection API and by using the accessible flag as methodName.setAccessible(true);

*/

import java.lang.reflect.*;

class A {

  int x;
  int z;
  private int y;

  static {
    System.out.println("static block invoked");
  }

  A() {
    System.out.println("Constructor invoked");
  }

  void m1() {
    System.out.println("m1() invoked");
  }

  private void m2() {
    System.out.println("m2() invoked");
  }

  private void m3(int a) {
    System.out.println("m3() invoked");
  }
}

class ReflectionDemo {

  public static void main(String[] args)
    throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	// Class<A> aClass = Class.forName("A");
    Class aClass = Class.forName("A"); // load A without creating the object and without using ref var and return Class<A> object and here constructor wont get invoked BUT SINCE CLASS IS LOADED SO STATCI BLCOK Will get executed and static var and method will be initiasled

    Field[] fields = aClass.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f.getName());
    }

    Method[] methods = aClass.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println(m.getName());
    }

    //A a = new A();

    A a = (A) aClass.newInstance(); // Create new object without using new keyword here constructor will get invoked
    //a.m1();
    Method m1 = aClass.getDeclaredMethod("m1");
    m1.invoke(a);

    // to invoke a private method outside the class
    Method m2 = aClass.getDeclaredMethod("m2");
    m2.setAccessible(true); // for private methods accessible = false is the bydefault value
    m2.invoke(a);
    //print m2 ka Access Modifier
    //Google
    //m2.get
  }
}
// Class<A>
