/*
We can handle exception at any block wherever it is occuring and in which ever block we 
will handle from there next set of instruction in program will execute

If the handler is of diff class then finally block will not get execute! 

TO handle the exception the handler i.e. the catch block must have argument of the same type of of the parent type



*/

public class UncheckedExceptionDemo {

  static void m3() {
    int i;
    try {
      i = 1 / 0;
    } catch (NullPointerException e) {
      e.printStackTrace();
      System.out.println("Exception handled");
    } finally {
      System.out.println("Resources released");
    }
  }

  static void m2() {
    System.out.println("Before 3");
    m3();
    try {
      m3();
    } catch (Error e) {
      e.printStackTrace();
      System.out.println("Exception handled");
    } finally {
      System.out.println("Released resources"); //this will not execute as the handler is of diff class
    }

    System.out.println("After 3");
  }

  static void m1() {
    System.out.println("Before 2");
    // m2();
    try {
      m2();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Exception handled");
    } finally {
      System.out.println("finally");
    }

    System.out.println("After 2"); //here after 3 is not printed
  }

  static void m() {
    System.out.println("Before 1");

    m1();
    System.out.println("After 1");
  }

  public static void main(String[] args) {
    System.out.println("Mainstart");
    UncheckedExceptionDemo.m();
    System.out.println("Mainend");
  }
}
//With try catch
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 26>javac UncheckedExceptionDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 26>java UncheckedExceptionDemo
Mainstart
Before 1
Before 2
Before 3
java.lang.ArithmeticException: / by zero
        at UncheckedExceptionDemo.m3(UncheckedExceptionDemo.java:4)
        at UncheckedExceptionDemo.m2(UncheckedExceptionDemo.java:14)
        at UncheckedExceptionDemo.m1(UncheckedExceptionDemo.java:29)
        at UncheckedExceptionDemo.m(UncheckedExceptionDemo.java:41)
        at UncheckedExceptionDemo.main(UncheckedExceptionDemo.java:47)
Exception handled
After 2
After 1
Mainend

C:\CDAC\Github\180-days-of-code\M2\DAY 26>

*/
//Without try catch
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 26>javac UncheckedExceptionDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 26>java UncheckedExceptionDemo
Mainstart
Before 1
Before 2
Before 3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at UncheckedExceptionDemo.m3(UncheckedExceptionDemo.java:4)
        at UncheckedExceptionDemo.m2(UncheckedExceptionDemo.java:9)
        at UncheckedExceptionDemo.m1(UncheckedExceptionDemo.java:15)
        at UncheckedExceptionDemo.m(UncheckedExceptionDemo.java:23)
        at UncheckedExceptionDemo.main(UncheckedExceptionDemo.java:29)

C:\CDAC\Github\180-days-of-code\M2\DAY 26>
*/
