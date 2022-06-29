import java.util.Scanner;

public class ArrayTransposeNew {

  public static void main(String[] args) {
    int[][] first = new int[3][3];
    int[][] transpose = new int[3][3];

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array elements");
    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < first[i].length; j++) {
        first[i][j] = sc.nextInt();
      }
    }

    System.out.println("Entered matrix elements are");
    for (int[] dim : first) {
      for (int value : dim) {
        System.out.print(value + " ");
      }
      System.out.println(" ");
    }

    System.out.println("Transpose iof the matrix is ");
    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < first[i].length; j++) {
        transpose[i][j] = first[j][i];
      }
    }

    for (int[] dim : transpose) {
      for (int values : dim) {
        System.out.print(values + " ");
      }
      System.out.println();
    }
  }
}
/*

*/
