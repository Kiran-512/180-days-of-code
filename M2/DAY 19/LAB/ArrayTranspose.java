import java.util.Scanner;

class ArrayTranspose{

	public static void main(String[] args){
	
		int[][] first = new int[3][3];
		int[][] transpose = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int[] dim : first){
			for(int value : dim){
				value = sc.nextInt();
				System.out.println("value is " + value);
			}
		}
		
		System.out.println("Entered matrix elements are");
		for(int[] dim:first){
			for(int value:dim){
			System.out.print(value+" ");
			}
			System.out.println(" ");
		}
		
		
		
		
	}

}

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 19\LAB>javac ArrayTranspose.java

C:\CDAC\Github\180-days-of-code\M2\DAY 19\LAB>java ArrayTranspose
Enter array elements
1
2
3
4
5
6
7
8
9
Entered matrix elements are
0 0 0
0 0 0
0 0 0

C:\CDAC\Github\180-days-of-code\M2\DAY 19\LAB>


*/