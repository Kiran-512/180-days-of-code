/*
Condition where finally block is not executed in Java
When the System. exit(0) method is called in the try block before the execution of finally block, 
finally block will not be executed.
*/
package LAB;

import java.io.FileNotFoundException;

public class Assignment {

  public static void main(String[] args) throws FileNotFoundException {
    //in this case finally gets executed
    try {
      throw new ArithmeticException();
    } catch (ArithmeticException e) {
      System.out.println("Catched AIOOBE");
    } finally {
      System.out.println(
        "Finally will get excuted even if exceoption is not handled"
      );
    }
    //finally wont gets executed
    try {
      System.exit(0);// Here program will get terminated and wont go further in program flow so wont eecute teh finally this time
      throw new ArithmeticException();
      // code below throw wont get compiled at all and will give CE
    } catch (ArithmeticException e) {
      System.out.println("Catched AIOOBE");
    } finally {
      System.out.println("Finally wont get excuted");
    }
  }
}
