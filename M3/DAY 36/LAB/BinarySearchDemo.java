import java.util.Scanner;

class BinarySearch{
	
	static int bSearch(int arr[],int x,int l,int h){
		if(h>=l){
			int mid = (l+h)/2;
			System.out.println("mid is "+ mid);
			if(arr[mid] == x)
				return mid;
			if(arr[mid]>x)
				return bSearch(arr,x,l,mid-1);
			return bSearch(arr,x,mid+1,h);
		}
		return -1;
	}
	
}
class BinarySearchDemo{

	public static void main(String... args){
		Scanner sc = new Scanner(System.in); 
		int arr[] = {10,11,12,13,14,15,16,17,18};
		System.out.println("Array elements are ");
		for(int x:arr){
		System.out.print(x+" ");			
		}
		System.out.println();
		int x =sc.nextInt();
		int result = BinarySearch.bSearch(arr,x,0,arr.length-1);
		
		if(result==-1)
		System.out.println("Element Not found");			
		else
		System.out.println("Element found at index "+ result);
		
		sc.close();
	}	
	
}