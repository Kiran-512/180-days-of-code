import java.util.Scanner;

class ArrayMultiplication{

	public static void main(String[] args){
	
		int[][] first = new int[3][3];
		int[][] transpose = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int[] dim:first){
			for(int value:dim){
				value = sc.nextInt();
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