class QuickSort{
	public static int partition(int[] arr,int low, int high)
	{
		int pivot =arr[high];
		int i =low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp =arr[i]; 
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}


	public static void quickSort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int pivotIndex = partition(arr,low,high);
			
			quickSort(arr,low,pivotIndex-1);
			quickSort(arr,pivotIndex+1,high);
			
		}
	}

	public static void main(String... agrs)
	{
	
		int[] arr ={1,6,4,3,2,0};
	
		int n =arr.length;
	
		quickSort(arr,0,n-1);
	
	
	}
}