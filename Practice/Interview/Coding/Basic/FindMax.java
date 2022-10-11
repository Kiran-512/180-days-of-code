class FindMax{

public static void main(String... args){
	
	int[] arr ={22121,3,4,500,6,34,5,54};
	
	int maxOfAll=0, currentMax=0;
	for(int i=0;i<arr.length-1;i++){
		
		if(arr[i]>arr[i+1])
			currentMax = arr[i];
		if(currentMax > maxOfAll)
			maxOfAll=currentMax;		
	}

		if(arr[arr.length-1]>maxOfAll)
				maxOfAll=arr[arr.length-1];
		
	System.out.println(maxOfAll);
	
	
}

}