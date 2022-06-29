public class AithmaticException {

  public static void main(String[] args) {
    //    int i = 1/0;
    try {
        int i = 1 / 0;
        System.out.println("try");
      } catch (ArithmeticException a) {
  
      // a.getMessage();
      System.out.println(a.getMessage());
      a.printStackTrace();
      System.out.println("catch");
    }
    finally{//will always execute
      System.out.println("release the resource");
    }
    System.out.println("After");

  }
}
