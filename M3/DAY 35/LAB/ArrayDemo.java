import java.util.Scanner;
class ArrayOperations{
	Scanner sc = new Scanner(System.in);
	
	void set(int a[],int n,int p){
	/*	for(int i=0;i<n;i++){
			if(p == i){
				System.out.println("Enter the value");
				a[i]=sc.nextInt();
				}
		}
		*/
			try{
			System.out.println("Enter the value");				
			a[p]=sc.nextInt();
			}catch(IndexOutOfBoundsException e){
					System.out.println(e.getMessage());
			}	
	}
	void get(int[] arr,int q){
		try{
		System.out.println("value at index "+ q +" is " + arr[q]);		
		}catch(IndexOutOfBoundsException e){
				//e.printStackTrace();
				System.out.println(e.getMessage());
		}
		
	}
	void find(int[] arr, int n; int r){
			
	}
	void printArray(int[] arr,int n){
				System.out.println("Array elements after updation are ");		
		for(int x:arr){
			System.out.print(x + " ");
		}
			System.out.println();		
	}
	
}
public class ArrayDemo{
	public static void main(String args[]){
		ArrayOperations driver = new ArrayOperations();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array elements");
		int[] arr = new int[5];
		int n = arr.length;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		//to search element at particular index
		System.out.println("Enter the index at which you want to get the value");
		int q = sc.nextInt();
		driver.get(arr,q);
		
		//to add element at particular index
		System.out.println("Enter the index at which you want to set another value");
		int p = sc.nextInt();
		driver.set(arr,n,p);
		driver.printArray(arr,n);
		
		//display the value
		System.out.println("Enter the value you want to search in the array");		
		int r= sc.nextInt();
		driver.find(arr,n,r);
	
		
	}
	
}