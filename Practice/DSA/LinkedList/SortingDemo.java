import java.util.Scanner;

public class SortingDemo {

  private SortingDemo() {} //class is not for instantiation

  public static void selectionSort(int[] a) {
    int minIndex, temp, i, j;

    for (i = 0; i < a.length - 1; i++) {
      minIndex = i;
      System.out.println("Pass " + (i+1));
      for (j = i + 1; j < a.length; j++) {
        if (a[j] < a[minIndex]) minIndex = j;
      }

      if (i != minIndex) {
        temp = a[i];
        a[i] = a[minIndex];
        a[minIndex] = temp;
      }
    }
  }

  public static void bubbleSort(int[] arr) {
    int i, j, temp;

    boolean flag;
    int count;

    for (i = 0; i < arr.length; i++) {
     
      flag = false;
      count=0;
      for (j = 1; j < arr.length; j++) {

          count++;
        if (arr[j - 1] > arr[j]) {
          flag = true;
          temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }

      System.out.print("Pass " + (i+1) + "  "+"Comparisions "+ count +" => ");
      for (int e : arr) {
        System.out.print(e + " ");
      }
      System.out.println();
      if(flag==false) break;

    }
  }


  
  //Improved bubble Sort

  public static void BubbleSortDemo(int[] a){
    int i,j,temp,count;

    boolean flag;

    for (i= a.length-2; i >= 0; i--) {
      flag=false;
      count=0;
      for(j=0;j<=i;j++){
        count++;
        if(a[j]>a[j+1])
        {
          flag=true;
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
      System.out.print("Pass " + (i+1) + "  "+"Comparisions "+ count +" => ");
      for (int e : a) {
        System.out.print(e + " ");
      }
      System.out.println();
      if(flag==false) break;
    }
  }
 
 //Insertion sort :
public static void insertionSort(int[] a){

  int i,j,temp,n= a.length;

  for(i=1;i<n;i++){

    temp =a[i];
    for(j=i-1;j>=0 && a[j]>temp;j--)
      a[j+1]=a[j];

    a[j+1]= temp;

    System.out.print("Pass "+ i );
    for (int e : a) {
    System.out.print( " "+ e );
  }  
  System.out.println();
  }


}

 
  public static void main(String[] args) {
    Scanner sc = null;

    try {
      sc = new Scanner(System.in);
      int n;
      System.out.println("Enter the size of an array");
      n = sc.nextInt();
      int random = 0;

      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
  //            System.out.println("Enter an element ");
//      arr[i] = sc.nextInt();
        random = (int) (100 * Math.random()) + 1;
 arr[i] = random;
      }

      for (int i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();

 //     selectionSort(arr);

//      bubbleSort(arr);
      System.out.println();
//      BubbleSortDemo(arr);
 
      insertionSort(arr);

      System.out.println("After sorting ");
      for (int i : arr) {
        System.out.print(i + " ");
      }
    } finally {
      sc.close();
    }
  }
}
