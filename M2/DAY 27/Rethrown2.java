/*
In this case due to rethrown exception finish will notprint as there is no handler to catch that rethrown exception but once its catched as shown with the next catch handler then it will exceute the next lines pof the code as exception propogation stops there!!
*/
class Rethrown2 {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    String s = "Kiran";

    System.out.println("main start");
    try {
      try {
        arr[6] = 10;
        System.out.println(s.charAt(6));
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        System.out.println("catch done");
        throw e;
      } catch (IndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        System.out.println("catch done");
      } catch (Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        System.out.println("catch done");
      } finally {
        System.out.println("finally done");
      }
      System.out.println("finish before rethron catched again"); //this line wont execute as the handler for rethrown exception is written after this statement but in case handler is not written then here there will be compiler error
    } catch (IndexOutOfBoundsException e) { //if here diff exception is written then
      e.printStackTrace();
      System.out.println("catched after rethrown again");
    }
    //We can write trycatch in finally too! but its not ethicalas purpose of finally is diffrent
    /*  finally{
      try{

      }
      catch(StringIndexOutOfBoundsException e){

      }
    }*/
    System.out.println("finish after rethron catched"); //this will execute as before this statement handler is written to catch the exception and exception propogation is stopped inabove catch block
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac Rethrown2.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java Rethrown2
main start
Index 6 out of bounds for length 5
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        at Rethrown2.main(Rethrown2.java:13)
catch done
finally done
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        at Rethrown2.main(Rethrown2.java:13)
catched after rethrown again
finish after rethron catched

C:\CDAC\Github\180-days-of-code\M2\DAY 27>
*/
