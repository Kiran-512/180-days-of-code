class SortingDemo{

	static void SelectionSort(int[] arr, int n){
		
		int minindex,i,j,temp;
		
		for(i=0; i<n-1;i++){
			
			minIndex=i;

			for(j=i+1;j<n;j++){
				
				if(arr[j]<arr[minindex])
					minIndex=j;
			}
				if(i!= minIndex){
					temp=arr[i];
					arr[i]=arr[minIndex];
					arr[minIndex]=temp;
				}	
		}
	}
	
	static void bubbleSort(int[] a, int n){//1 2 3 4 5 //=> i goes from n-2 to 0 and j goes from 0 to i 
				int i,j,temp;
				for(i=n-2;i>=0;i--){//i=5-2=3 => 4 comparison in first pass, 3 comparision is second pass and 1 comparision in last pass!
					for(j=0;j<=i;j++){
					//value of i 3/2/1/0 where the no of comparisions = 4/3/2/1
						if(a[j]>a[j+1])
						{
							temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
	}

	static void insertionSort(int[] a, int n){
			
			int i,j,temp;
			
			for(i=1;i<n;i++){
				temp=a[i];
				for(j=i-1;a[j]>temp && j>=0 ;j--)
					a[j+1]=a[j];
				
				a[j+1]=temp;
			}
	}

	public static void main(String... args){
	//array and methods calling from here!
	
	
	}
}