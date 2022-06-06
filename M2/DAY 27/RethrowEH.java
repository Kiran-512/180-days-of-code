/*
In this case due to rethrown exception finish will not execute as there is no handler to catch that rethrown exception
*/
class RethrowEH {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    String s = "Kiran";

    System.out.println("main start");
    try {
      arr[6] = 10;
      System.out.println(s.charAt(6));
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println("ArrayIndexOutOfBoundsException catch done");
      throw e;//This is not catched anywhere so exception is thrown 
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
    System.out.println("finish"); // THIS WONT PRINT BUT THERE IS NO CE
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac RethrowEH.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java RethrowEH
main start
Index 6 out of bounds for length 5
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        at RethrowEH.main(RethrowEH.java:12)
ArrayIndexOutOfBoundsException catch done
finally done
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        at RethrowEH.main(RethrowEH.java:12)

C:\CDAC\Github\180-days-of-code\M2\DAY 27>
*/
