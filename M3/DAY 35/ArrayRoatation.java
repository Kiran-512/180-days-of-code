//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.


class ArrayRotation{
	
	 void arrayRotate(int a[],int d, int n){
		for(int j=0;j<d;j++){
		int temp=a[0];
		for(int i=0;i<n-1;i++){
			a[i]=a[i+1];
			}
			a[n-1]=temp;
		}
	}
	void printArray(int[] a, int n){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+ " " );
		}	
	}
	
	public static void main(String... args){
		
	ArrayRotation rotate = new ArrayRotation();	
	
	int[] arr = new int[]{7,8,9,10,11,12};
	int n= 6;
	int d =3;
	rotate.arrayRotate(arr,d,n);
	rotate.printArray(arr,n);
	}
}

/*
#Learnings
- first devide the problem into smaller steps
- algorithms
- logic building
- try to make it as simple as possible in first approcah
- avoid complexity in the begining
*/