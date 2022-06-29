/*
It is not madantory to throws keyword in method signature to have code inside method and it that method called anywhere lets say in main 
thread then its compulsion for the main thread to either handle or propogate that exception!
*/

import java.io.*;

public class CheckedExceptionDemo4 {

  static void m1() throws ClassNotFoundException {}

  static void m2() throws FileNotFoundException, ClassNotFoundException {
    m1();
    m3(); // here unchecked exception automatically propogates
  }

  /* No need to explicitly write here as this is unchecked exception which propogates automatically
    when we call m2 in m3, m2 has thrown two checked exceptions so we will have to either handle both or throw both from here! 
  */
  static void m3()
    throws NullPointerException, FileNotFoundException, ClassNotFoundException {
    m2();
  }

  public static void main(String[] args)
    throws ClassNotFoundException, FileNotFoundException, NullPointerException { //this is mandaotry here as m1 which has ClassNotFoundException in method signature is called in main thread and here NPE is option as its optional becasue its unchecked exception and its propogates automatically or else here parent class of Exceptions can also be mentioned
    System.out.println("main start ");
    m1();
    m2();
    m3();
  }
}
