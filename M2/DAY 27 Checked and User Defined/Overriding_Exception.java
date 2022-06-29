//import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;

/*
for Unchecked Exceptions:
If PCM throws unchecked Exception then for CCM its not compulsion to throw any Exception as UncheckedExcetion propogates automatically
e.g.If PCM throws ArithmeticException then for CCM its not compulsion to throw any Exception as Arithmetic Excetion is unchecked Exception which propogates automatically

for checked Exceptions:
If PCM is Checked Exception then child class Method must throw same Exception or child class Expception of the Exception thrown by the PCM OR its should not throw any other exception 


For overriding Chid class method:

 - Must not throw new or broader checked exceptions.
 - May throw fewer or narrower checked exceptions, or any unchecked exception
*/

class A {

  void m1() throws FileNotFoundException {
    System.out.println("Parent method");
  }

  void m2(int i) {
    i = i / 0; // here is Arithmeticexception
    System.out.println("m2 parent");
  }

  void m3(int i) {
    System.out.println("m3 Parent");
  }
}

class B extends A {

  @Override
  void m1() {
    System.out.println("Child Method");
  }

  void m2(int i) {
    System.out.println("m2 child");
  }

  void m3(int i) {
    i = i / 0; // here is Arithmeticexception and now exception will be thrown here so to catch we will have to write try-catch here or in main thread from where it called
    System.out.println("m3 Child");
  }
}

public class Overriding_Exception {

  public static void main(String[] args)
    throws ArithmeticException, Exception, FileNotFoundException { // here seq of parent child class doesn't matters like we give inside the try block and unchecked if not mentioned then also okay
    System.out.println("Main starts");
    A a = new A();
    A a1 = new B();
    a1.m1();
    a1.m2(1);
    a1.m3(1);
    System.out.println("Main end");
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac Overriding_Exception.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java Overriding_Exception
Main starts
Child Method
m2 child
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at B.m3(Overriding_Exception.java:45)
        at Overriding_Exception.main(Overriding_Exception.java:59)

C:\CDAC\Github\180-days-of-code\M2\DAY 27>

*/
