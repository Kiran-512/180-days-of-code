/*
User defined Exceptions
*/

import javax.management.RuntimeMBeanException;

class MyUncheckedExceptionDemo extends RuntimeException {

  MyUncheckedExceptionDemo(String getMessage) {
    super(getMessage); // this will pass the message from the coder to parent class contructor
  }
}

class MyCheckedExceptionDemo extends Exception {

  MyCheckedExceptionDemo(String getMessage) {
    super(getMessage); // this will pass the message from the coder to parent class contructor ;
  }
}

class MyUncheckedException {

  public static void main(String[] args) {
    try {
      throw new ArithmeticException();
    } catch (ArithmeticException e) {
      try {
        throw new MyUncheckedExceptionDemo(
          "This is unchecked user defined exception"
        );
      } catch (MyUncheckedExceptionDemo uc) {
        System.out.println(uc.getMessage());
        try {
          throw new MyCheckedExceptionDemo(
            "Bhai ye checked exception hai defined by user"
          );
        } catch (Exception ch) {
          System.out.println(ch.getMessage());
        }
      }
    } finally {
      System.out.println("finally");
    }
  }
}
