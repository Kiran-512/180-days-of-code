public class TryFinally {

  public static void main(String[] args) {
    System.out.println("Before");
    try {
      throw new StackOverflowError();
    } finally {
      System.out.println("Release the resources");
    }
    // System.out.println("After");//This code is unreachable
  }
}
