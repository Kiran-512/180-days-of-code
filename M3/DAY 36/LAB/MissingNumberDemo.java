import java.util.Scanner;

class MissingNumberDemo{
	//method 1 - will work if the given array is in ascending order
	static int missingNumberSortedArray(int[] arr){ 
		
		for(int i=0;i<arr.length-2;i++){
			if(arr[i+1]!=arr[i]+1)
				return arr[i];
		}
		return 0;
	}
	
	//method 2 => will work even if its ascending order or unsorted array
	static int missingNumberRandomArray(int[] arr){
		int n = arr.length+1;// since size of array is taken as n-1
		int sum1 = (n*(n+1))/2;
		int sum2=0;
		for(int i=0;i<arr.length;i++){
			sum2 = sum2 + arr[i];
		}
		return sum1-sum2;
	} 
	
	public static void main(String... args){
		//System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of ann array");
		int n= sc.nextInt(); 
		int arr[] = new int[n-1];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int num1 = missingNumberSortedArray(arr);
		int num2 = missingNumberRandomArray(arr);
		
		System.out.println("Missing number is "+ (num1+1));
		System.out.println("Missing numberr is "+ num2);
		sc.close();
			
	}
	
}