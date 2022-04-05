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
}

class B extends A {

  @Override
  void m1(){
      System.out.println("Child Method");
  }
}

public class Overriding_Exception {

  public static void main(String[] args)
    throws ArithmeticException, Exception, FileNotFoundException {// here seq of parent child class doesn't matters like we give inside the try block
    A a = new A();
    A a1 = new B();
    a1.m1();
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac Overriding_Exception.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java Overriding_Exception
Child Method

C:\CDAC\Github\180-days-of-code\M2\DAY 27>

*/
