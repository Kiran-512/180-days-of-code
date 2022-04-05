/*
throws basically helps to propogate the exception in the method where error code prone is used

throws just propagates the exception in the next block in the flow of code and will not handle the exception so code below error prone code wont get executed 

if file not found then it will throw exception at run time! 

*/

import java.io.*;

public class CheckedExceptionDemo2 {

  static void m() throws FileNotFoundException {
    System.out.println("code before error prone code in method");
    File f = new File("abcd.txt");
    FileReader fr = new FileReader(f);
    System.out.println("mehtod ends code after error prone code"); // if abcd.txt not found this wcode wont get executed
  }

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Main starts");
    m();
    System.out.println("Main ends"); //This line will excute only if exception is handled on the above line here its nto handled sp wont execute here this method also thrown the exception
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac CheckedExceptionDemo2.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java CheckedExceptionDemo2
Main starts
code before error prone code in method
Exception in thread "main" java.io.FileNotFoundException: abcd.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileReader.<init>(FileReader.java:75)
        at CheckedExceptionDemo2.m(CheckedExceptionDemo2.java:14)
        at CheckedExceptionDemo2.main(CheckedExceptionDemo2.java:19)

C:\CDAC\Github\180-days-of-code\M2\DAY 27>
*/