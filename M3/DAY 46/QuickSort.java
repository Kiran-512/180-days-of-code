/*
Approach => pivot and partition
*/

class QuickSort{
	public static int partition(int[] arr, int low, int high){
	
	int pivot = arr[high];
	int i=low-1;
	
	for(int j=low;j<high;j++){// here j<high as we have already stored arr[high]in pivot
			if(arr[j]<pivot){
				i++;
				//swap
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}
		//swap with pivot
		i++;
			int temp = arr[i];
			arr[i]=arr[high];
			arr[high]=temp;
			return i;// will return pivot index
	}
	
	public static void quickSort(int[] arr, int low, int high){
		
		if(low<high){// condition checks if there are more than 1 element in array, if its only one element i.1. when low==high then it wont enter the if block
			
			int pidx = partition(arr,low,high);
			
			quickSort(arr,low,pidx-1);			
			quickSort(arr,pidx+1,high);

		}
		
	}

	public static void main(String... args){
		int[] arr = {6,3,9,5,2};	
		int n = arr.length;
	
		quickSort(arr,0,n-1);
		
		//print
		for(int x:arr){
			System.out.	print(x);
		}
		
	}


}

/*
Time complexity

Worst O(n^2)
Average nlogn

Worst case occurs when pivot is always the smallest or the largest element

1 2 3 4 5

Worst time rarely occurs and we do not have use extra array to save the sorted array as in the case of merge Sort


*/