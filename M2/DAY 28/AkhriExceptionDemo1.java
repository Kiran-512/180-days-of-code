public class AkhriExceptionDemo1 {

  static int m1() {
    try {
      int i = 1 / 0;
      System.out.println("Wont executed code below if exception found above");
      return 10;
    } catch (ArithmeticException e) {
      System.out.println("Returned 20");
      return 20;
    } finally {
      System.out.println("Returned 30");//logical errors ignored by the compiler as compiler has no idea if its gona enter the catch block or not also in try clock it has no idea if there is any error or not
    }
    // return 40;//this wont get exceuted as after finally as its syntactical error

  }

  /*
Compiler dont know if there is any error prone code which mioght throw arithmetic Exception inside try block or not (Its logical and not syntaxcticle) hence compiler wont throw 
any error for two return types inside the try block and catch block:  
But when we write return even after writing return after writing inside finally then compiler knows that finally will always execute and return some value so why there is another code after return? Hence it will thro CE:Unreachable code 
*/
  static int m2() {
    try {
      int i = 1 / 0;
      System.out.println("Wont executed code below if exception found above");
      return 10;
    } catch (ArithmeticException e) {
      System.out.println("Returned 20");
      return 20;
    } finally {
      System.out.println("Returned 30");
      return 30;
    }
    // return 40;//this wont get exceuted as after finally it will return 30

  }

  static int m3() {
    try {
      int i = 1 / 0;
      System.out.println("Wont executed code below if exception found above");
    } finally {
      System.out.println("Returned 30");
      return 30;
    }
    // return 40;//this wont get exceuted as after finally it will return 30

  }

  public static void main(String[] args) {
    System.out.println(m2());

    //try with the multi-catch statement
    try {
      int[] arr = new int[] { 1, 2 };
      arr[3] = 20 / 0; //this will throw arithmeticException as compiler will first check the portion which is on the right side of =
    } catch (
      ArithmeticException
      | NullPointerException
      | ClassCastException
      | IndexOutOfBoundsException e
    ) { // we can not add checked exception here if there is no error prone code in try block //MultiCatch is used if we want show the same message to the client
      //and Multiple catch block used to show the different message to client for exception
    }
  }
  /*catch(Exception | ArithmeticException  e ){ //In this case we can not write parent and it child together seperated by "|" (pipe) symbol

        }*/

}
