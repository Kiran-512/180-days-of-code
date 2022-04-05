/*
IndexOutOfBoundException: Unchecked Exception : RTE

Note the sequence of the catch block
*/

class ExceptionHandDemo{

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    String s = "Kiran";

    //  arr[6]=10;//Exception ArrayIndexOutOfBound : RTE at this line
    //  System.out.println(s.charAt(6));//Exception String IndexOutOfBound : RTE at this line
    System.out.println("main start");
    try {
      arr[6] = 10;
      System.out.println(s.charAt(6));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println("catch done");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println("catch2 done");
    } finally {
      System.out.println("finally done");
    }
    System.out.println("finish");
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac ExceptionHandDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java ExceptionHandDemo
main start
Index 6 out of bounds for length 5
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        at ExceptionHandDemo.main(ExceptionHandDemo.java:17)
catch done
finally done
finish

C:\CDAC\Github\180-days-of-code\M2\DAY 27>
*/