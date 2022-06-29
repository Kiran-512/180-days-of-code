/*
-----------------------------------------------------------------------
VERY iMPORTANT OUTCOME FROM mULTITHREADING pOINT OF VIEW :
When class A loaded into JVM,
	- to store the meta data of the class A and Object of class Class<A> is created

-----------------------------------------------------------------------
javap tells the metadata of the class

javap java.lang.reflect.Method 

Reflection API will help out to WAP to get the metadata of our class

Exceptions:
InstantiationException, IllegalAccessException => checked exception as what if constructor is private while creating object with newInstance()
ClassNotFoundException => CHECKED EXCEPTION occurs as what if class is not there when we load the class with Class aClass = Class.forName("A");
InvocationTargetException => Occurs as what if the method is private as declared on the line m2.invoke(a);
NoSuchMethodException => When we try to get the method with, aClass.getDeclaredMethod("Metho-name") checked Exception occurs to check the what if method is not there 

Can we access the private method outside the class!
Yes we can invoke the private method ouside the class by using reflection API and by using the accessible flag as methodName.setAccessible(true);
-----------------------------------------------------------------------
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
    System.out.println("Constructor of class A invoked");
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

//To check all the fields of the class A
    Field[] fields = aClass.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f.getName());
    }

//TO CHECK ALL the methods of the class A	
    Method[] methods = aClass.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println(m.getName());
    }

    //A a = new A();

    A a = (A) aClass.newInstance(); // Create new object of class A without using new keyword here constructor will get invoked
    //a.m1();
    Method m1 = aClass.getDeclaredMethod("m1");
    m1.invoke(a);

    // to invoke a private method outside the class
    Method m2 = aClass.getDeclaredMethod("m2");
    m2.setAccessible(true); // for private methods accessible = false -> is the bydefault value so when we change it to true then we can access that private method outside the class
    m2.invoke(a);
    //print m2 ka Access Modifier
    //Google
    //m2.get
  }
}
// 
/*
class Class<className> 
- When calss gets loaded in JVM, Object of class Class<> is createdto store the metadata of the class which is loaded 

When we write Class.forName("A") 
- It throws an exception ClassNotFoundException
- It loads the class and RETURNS the object which stores the meta data of an class A
- 

*/
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 33>java ReflectionDemo
static block invoked
x
z
y
m2
m1
m3
Constructor of class A invoked
m1() invoked
m2() invoked

C:\CDAC\Github\180-days-of-code\M2\DAY 33>
*/