import java.util.Scanner;

class SortingDemoNew{

	static void selectionSort(int[] arr){// 4 3 5 1 2 => 1 3 5 4 2 => 1 2 5 4 3 => 1 2 3 4 5
	
	int i,j,minIndex,temp;
	int n = arr.length;
	
	for(i=0;i<n-1;i++){// 4

		System.out.println("Pass " + (i+1));
		
		minIndex = i;
		
		for(j=i+1;j<n;j++){// 4
		
		System.out.println("Comparision" + (j-i));
		
		if(arr[minIndex]>arr[j])
				minIndex=j;
		}
		
		if(i!=minIndex)
		{
		System.out.println("swapped");
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}



	static void sort(int[] arr, int n){
		
		int[] temp = new int[n];
		sort(arr,temp,0,n-1);
		System.out.println("Sorted with the merge sort");
	}
	static void sort(int[] arr, int[] temp, int low, int up){
		
		if(low==up) return;
		
		int mid = low + (up-low)/2;
		
		sort(arr,temp,low,mid);
		sort(arr,temp,mid+1,up);
		
		merge(arr,temp,low,mid,mid+1,up);
		
		copy(arr,temp,low,up);
	}
	
	static void merge(int[] arr, int[] temp, int low1,int up1, int low2, int up2){
		
		int i = low1;
		int j = low2;
		int k= low1;
		
		while(i<=up1 && j<=up2){
			if(arr[i]<=arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		
		while(i<=up1)
				temp[k++] = arr[i++];
			
		while(j<=up2)
				temp[k++] = arr[j++];			
	}
	
	static void copy(int arr[], int temp[], int low, int up){
		for(int i = low; i<=up; i++)
		{
			arr[i]=temp[i];
		}
	}


//==================== Quick Sort ===============
	static int partition(int[] arr, int low , int high){
		
		int pivot = arr[high];
		
		int i = low - 1;// at this index, pivot is moved in the end 
		
		for(int j = low; j<high ;j++)
		{
			if(arr[j]<pivot)
			{
			i++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		
		return i;
	}

	static void QuickSort(int[] arr, int low, int high){
		if(low<high)
		{
			int pindx = partition(arr,low,high);
			System.out.println("pindx is "+ pindx);
			QuickSort(arr,low,pindx-1);
			QuickSort(arr,pindx+1,high);
		}
	
	}

public static void main(String[] args) {
    Scanner sc = null;

    try {
      sc = new Scanner(System.in);
      int n;
      System.out.println("Enter the size of an array");
      n = sc.nextInt();
      int random = 0;
	
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
	//System.out.println("Enter an element ");
	//arr[i] = sc.nextInt();
        random = (int) (100 * Math.random()) + 1;
		arr[i] = random;
      }

      for (int i : arr) {
        System.out.print(i + " ");
      }
	  
      System.out.println();

		//selectionSort(arr);
		QuickSort(arr,0,n-1);
 


      System.out.println("After sorting ");
      for (int i : arr) {
        System.out.print(i + " ");
      }
    } finally {
      sc.close();
    }
  }






}