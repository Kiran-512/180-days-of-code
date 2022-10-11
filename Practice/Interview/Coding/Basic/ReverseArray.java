class ReverseArray{

public static void main(String... args){
	
	int[] arr ={1,2,3,4,5};

	String str = reversePrint(arr);
	
	int [] array = method(str);
	
	System.out.println(str);
	
	for(int a : array){
			System.out.println(a +"  ");
	}
	
	System.out.println(arr);//[I@Hashcode
	
	
	
	
	//reverse array
	reverseArray(arr);
	for(int a :arr){
		System.out.println("ELEMENT" + a);
	}
	
	
	
	
	
	
}
	static String reversePrint(int[] arr){
		String reverse ="";
		for(int i=arr.length-1;i>=0;i--)
		{
			reverse+= arr[i];
			//System.out.println(arr[i]);
		}
		return reverse;
	}
	static int[] method(String str){
		
		String[] arr = str.split(" ");
		for(String s :arr){
			System.out.println(s+"  aaaaaaaaaaaaa");
		}
		int[] a = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			a[i]= Integer.parseInt(arr[i]);
		}
		return a;
		
	}
	
	static void reverseArray(int[] arr){
		
		int low =0, high = arr.length-1;
		while(low<high){
			int temp = arr[low];
			arr[low++] = arr[high];
			arr[high--] = temp;
		}
		
	}
}