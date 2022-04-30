// Choosing an element from array to put it at the back in a sequence

import  java.util.*;




class ArrayBasicDS{
	public static void main(String... args){
		ArrayBasicDS ab = new ArrayBasicDS();
		int n;
		
		Scanner sc = new Scanner(System.in);	
		n=sc.nextInt();
		int[] a = new int[n];	
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
				
		int ele = sc.nextInt();		
		ab.removeLast(a,n,ele);
		for(int e : a){
		System.out.println(e);
		}
	}	
	
	void removeLast(int a[],int n, int ele){
	int j=0;
		 do{
			 if(a[j] == ele){			//	
				 for(int i=j;i<n-1;i++){//
					 a[i]=a[i+1];		//
				 }
					a[n-1] = ele;
				 break;
			 }
			 j++;
		 }while(j<n);
}

}