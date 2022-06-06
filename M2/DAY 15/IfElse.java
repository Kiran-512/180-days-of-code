import java.util.Scanner;

public class IfElse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter X");
    int x = sc.nextInt();
    System.out.println("Enter Y");
    int y = sc.nextInt();

    if (x > y) {
      System.out.println("X is greater than Y");
      if (x % 2 == 0) {
        System.out.println("X is Even Number");
      } else {
        System.out.println("X is not divisible by 2");
      }
    } else if (x == y) {
      System.out.println("X is equal to Y");
    } else {
      System.out.println("Y is greater than X");
      if (y % 2 == 0) {
        System.out.println("Y is even");
      } else {
        System.out.println("Y is odd");
      }
    }
  }
}
