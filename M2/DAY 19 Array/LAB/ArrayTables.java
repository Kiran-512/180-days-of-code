/*
Tables printinh with the array 
*/
public class ArrayTables {

  public static void main(String[] args) {
    int[] table =new int[31];
    

    for (int i = 1; i < table.length; i++) {
        table[i]=i;
      for (int j = 1; j <= 10; j++) {
        System.out.print(table[i] + "X" + j + "=" + table[i] * j +" ");
      }
      System.out.println();
    }
  }
}
