/*
Use of exception of rethrow in actual coding : Useful in advance JAVA

Controller=>Service=>Dao

Req from Broweser to controller and the controller will got service layer and service layer will go to Dao for database and infomration and again tiw ill given back to controller via service layer
User input handles Controller and hence Exception will be handled at service layer

*/
public class Rethrown3 {

  public static void main(String[] args) {
    try {
      int i = 1 / 0;
    } catch (Exception e) {
      System.out.println("1");
      try {
        throw new NullPointerException(); //this rethron exception is not catched again
      } catch (ArithmeticException f) {
        System.out.println("2");
        try {
          // throw f;
        } catch (NullPointerException n) {
          System.out.println("3");
        }
      }
    } finally {
      System.out.println("finally");
    }
    System.out.println("2");
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac Rethrown3.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java Rethrown3
1
finally
Exception in thread "main" java.lang.NullPointerException
        at Rethrown3.main(Rethrown3.java:18)

C:\CDAC\Github\180-days-of-code\M2\DAY 27>
*/
