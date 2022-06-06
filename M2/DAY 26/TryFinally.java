public class TryFinally {

  public static void main(String[] args) {
    System.out.println("Before");
    try {
      throw new StackOverflowError();
    } finally {
      System.out.println("Release the resources");
    }
    // System.out.println("After");//This code is unreachable as thown exception is not catched and code is ended abruptly
  }
}
/*
Before
Release the resources
Exception in thread "main" java.lang.StackOverflowError
	at TryFinally.main(TryFinally.java:6)
*/