/*
try  and finally is written only once and catch can be written multiple times


*/
public class ThrowDemo {

  public static void main(String[] args) {
    System.out.println("Before");

    try {//We can not use tow throw line in try block as compiler wont go to the next line after throw
      //   throw new ArithmeticException();//5
      // throw new NullPointerException();//1
    //   throw new ClassCastException();//2
      throw new StackOverflowError();//
      
    } catch (ArithmeticException a) {
      System.out.println("5");
    } catch (NullPointerException a) {
      System.out.println("1");
    } catch (RuntimeException a) {
      System.out.println("2");
    } catch (Exception a) {
      System.out.println("3");
    } catch (Throwable a) {
      System.out.println("4");
    } finally {
      System.out.println("Release the resources");
    }
    System.out.println("After");
  }
}
