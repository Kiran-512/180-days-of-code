/*
Once the Exception is handle with the try catch then no need to use throws again as exception wont propogate ahead in the flow of program excution
*/

import java.io.*;

public class CheckedExceptionDemo3 {

  static void m() throws FileNotFoundException {
    System.out.println("code before :  error prone code in method");
    File f = new File("abc.txt");
    FileReader fr = new FileReader(f);
    System.out.println("mehtod ends : code after error prone code");
  }

  static void m1() {
      System.out.println("m1 started and code before error prone code");
    try {
      m();
    } catch (FileNotFoundException e) {
      System.out.println("FileNotFound handled here!");
    } finally {
      System.out.println("Release the resources");
    }
    System.out.println("static m1 ends and code after error prone code"); // here its handled so this code will get executed
  }

  public static void main(String[] args) {
    System.out.println("Main starts");
    m1();
    System.out.println("Main ends"); // this will get executed as its already handeled in method m1
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac CheckedExceptionDemo3.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java CheckedExceptionDemo3
Main starts
m1 started and code before error prone code
code before error prone code in method
mehtod ends code after error prone code
Release the resources
static m1 ends and code after error prone code
Main ends

C:\CDAC\Github\180-days-of-code\M2\DAY 27>

*/