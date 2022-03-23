/* Code for taking three side from user and to check if its right angled isosceles or equilateral or not special
 Thhree sides to be accecpted as values for side of tirangle only if sum of the  first wo is greater than third one or else print invalid
*/
import java.util.Scanner;

class triangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    int sum = a + b;
    if (sum > c) {
      if (a == b && b == c) {
        System.out.println("Equilateral");
      } else if (a == b || b == c || c == a) {
        System.out.println("Isosceles");
      } else if (a * a + b * b > c * c) {
        System.out.println("Right-angled");
      } else {
        System.out.println("Not special");
      }
    } else {
      System.out.println("Invalid");
    }
  }
}
