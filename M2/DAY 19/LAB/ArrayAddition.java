package LAB;

/*
Addition operation for 3x3 matrix with array and fori and foreach loop
*/

import java.util.Scanner;

class ArrayAddition{
	
	public static void main(String[] args){
		
		int[][] slot1 = new int[3][3];//total no of objects created here => 3 + 1 =4; 
		int[][] slot2 = new int[3][3];
		int[][] slot3= new int[3][3];
		
		System.out.println("Enter slot1 Elements");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<slot1.length;i++){
			for(int j=0; j<slot1[i].length;j++){
				slot1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Slot1 elements are");
		
		//to print all the elements
		for(int[] dim : slot1){
			for(int value : dim){
				System.out.print(value +" ");
			}
			System.out.println();
		}
		
			System.out.println("Enter slot2 Elements");
		for(int i =0; i<slot2.length;i++){
			for(int j=0;j<slot2[i].length;j++){
				slot2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Slot2 elements are");
		
		for(int[] dim : slot2){
			for(int value : dim){
				System.out.print(value + " ");
			}
			System.out.println();
		  }
		  
//		  for addition
	
		for(int i=0;i<slot1.length;i++){
			for(int j = 0;j<slot1[i].length;j++){
			slot3[i][j] = slot1[i][j] + slot2[i][j];
			}
		}
		System.out.println("Addition of two matrices is ");
		for(int[] dim2 :slot3){
			for(int var:dim2){
				System.out.print(var +" ");
			}
			System.out.println();
		}
			
			
			
		}
	
}

/*

C:\CDAC\Github\180-days-of-code\M2\DAY 19\LAB>javac ArrayAddition.java

C:\CDAC\Github\180-days-of-code\M2\DAY 19\LAB>java ArrayAddition
Enter slot1 Elements
1
2
3
4
5
6
7
8
9
Slot1 elements are
1 2 3
4 5 6
7 8 9
Enter slot2 Elements
9
8
7
6
5
4
3
2
1
Slot2 elements are
9 8 7
6 5 4
3 2 1
Addition of two matrices is
10 10 10
10 10 10
10 10 10

*/