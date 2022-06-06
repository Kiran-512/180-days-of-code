public class Finally {

  public static void main(String[] args) {
    try {
      int i = 1 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic catched here in first block");
    } finally {
      try {
        throw new ArithmeticException();
      } catch (Exception e) {
        System.out.println("2");
      } finally {
        System.out.println("finally");
      }
      System.out.println("finally for main try");
    }
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac Finally.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java Finally
Arithmetic catched here in first block
2
finally
finally for main try

C:\CDAC\Github\180-days-of-code\M2\DAY 27>
*/
