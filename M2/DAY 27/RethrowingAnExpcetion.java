class RethrowingAnExpcetion {

  public static void main(String[] args) {
    System.out.println("Main starts");
    try {
      throw new NullPointerException();
    } catch (Exception e) {
      System.out.println("e");
      System.out.println("1");
      try {
          throw e;
      } catch (NullPointerException f) {
          System.out.println("new retheon catched in trycatch block declared in same catch block");
         //throw new ArithmeticException();// If its thrown again, it will go out of catch block and abruptly ends the program/ here the arithmetic exception is thrown and we need catch block of the same type OR of the parent type of thrown exception
      }
    } finally {
      System.out.println("finally before cathcing the rethrown");
    }
    System.out.println("main ends");//here would be CE with unreachable code if rethrown exception is not handled which is rethronw at line no 11, but here its handled
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac RethrowingAnExpcetion.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java RethrowingAnExpcetion
Main starts
e
1
new retheon catched in trycatch block declared in same catch block
finally before cathcing the rethrown
main ends

*/