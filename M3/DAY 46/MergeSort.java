/*
Approach => Divide and Conquer
*/

class MergeSort{
	
	public static void conquer(int[] arr,int low,int mid, int high){
		int merge[]= new int[high-low+1];
		
		int ind1 = low;
		int ind2 = mid+1;
		int x=0;
		
		while(ind1<=mid && ind2<=high){
			if(arr[ind1]<=arr[ind2]){
				merge[x]=arr[ind1];
				x++;ind1++;				
			}else{
				merge[x++]=arr[ind2++];
			}	
		}
		while(ind1<=high){
			merge[x++]=arr[ind1++];
		}
		while(ind2<=mid){
			merge[x++]=arr[ind2++];
		}
		for(int i=0,j=low;i<merge.length;i++,j++){
			arr[j]=merge[i];
		}
	}
	public static void divide(int[] arr,int low, int high){
		
		if(low>=high)
			return;
		
		int mid = low + (high-low)/2;
		
		divide(arr,low,mid);
		divide(arr,mid+1,high);		
		conquer(arr,low,mid,high);
	}

	public static void main(String... args){
	int[] arr ={6,3,9,5,2,8};
	int n= arr.length;
	
	divide(arr,0,n-1);
	
	//print
		for(int x:arr){
			System.out.	print(x);
		}
		
	
	}
}