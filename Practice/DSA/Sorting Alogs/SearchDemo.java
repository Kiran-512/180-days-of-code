import java.util.Scanner;

class SearchDemo{

	public static int search(int[]arr, int n, int sv){
	
		arr[n] = sv;
		
		int i = 0;
		
		while(sv!=arr[i])
			i++;
		
		if(i<n)
			return i;
		else 
			return -1;
	
	}



	static int binarySearch(int[] arr, int low, int high, int sv)
	{
		if(high>=low)
		{
			int mid = low +(high-low)/2;
			
			if(arr[mid] == sv) return mid;
			if(arr[mid]> sv) return binarySearch(arr,low,mid-1,sv);
			return binarySearch(arr,mid+1,high,sv);			
		}
		 return -1;
	}
	
	public static void main(String... args){
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];		
		for(int i =0;i<n;i++){
			System.out.println("Enter the element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to search : ");
		
		int sv = sc.nextInt();
		
		int res = binarySearch(arr,0,n-1,sv);
		
		System.out.println("The elemtns is found at "+ res);
	}
	
}