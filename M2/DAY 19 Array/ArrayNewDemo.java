class Dozen{
	int a;
	int b;
	
	void m1(){
		System.out.println("a="+this.a+", b="+this.b);
	}
	
	Dozen(int a,int b){
		this.a = a;
		this.b = b;
	}
}

class ArrayDemo{

	public static void main(String args[]){
		
		int iarr[] = new int[10];
		boolean barr[] = new boolean[5];
		
		for(int i=0;i<iarr.length;i++){
			System.out.print(iarr[i]+" ");
		}
		System.out.println("");
		
		
		for(int i=0;i<barr.length;i++){
			System.out.print(barr[i]+" ");
		}
		System.out.println("");
		int iarr2d[][] = new int[5][10];
		for(int i=0;i<iarr2d.length ;i++){
			for(int j=0;j< iarr2d[i].length;j++){
				System.out.print(iarr2d[i][j]+" ");
			}
			System.out.println("");
		}
		
		for(int i=0;i<iarr.length;i++){
			iarr[i] = i+1;
		}
		
		for(int i=0;i<iarr.length;i++){
			System.out.print(iarr[i]+" ");
		}
		System.out.println("");
		int k = 0;
		for(int i=0;i<iarr2d.length ;i++){
			for(int j=0;j< iarr2d[i].length;j++){
				iarr2d[i][j] = ++k;
			}
			
		}
		
		for(int i=0;i<iarr2d.length ;i++){
			for(int j=0;j< iarr2d[i].length;j++){
				System.out.print(iarr2d[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		//2. Declaring and initializing an array in same line
		
		int arr[] = {10,20,30,40,50};
		int arr2d[][] = {
							{10,20},
							{30,40},
							{50,60}
						};
		for(int i=0;i<arr2d.length ;i++){
			for(int j=0;j< arr2d[i].length;j++){
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println("");
		}
		
		//3. Array of reference variable
		Dozen dznarr[] = new Dozen[5];
		dznarr[0] = new Dozen(10,20);
		
		dznarr[1] = new Dozen(30,40);
		
		dznarr[2] = new Dozen(50,60);
		
		/*dznarr[3] = new Dozen(70,80);
		
		dznarr[4] = new Dozen(90,100);*/
		
		for(int i=0;i<dznarr.length;i++){
			if(dznarr[i] != null){
				dznarr[i].m1();
			}else{
				System.out.println(i+"'th value is null");
			}
		}
		
	}
}




// Initailly we created array with the base size of 3 and 2 later we created array[0] of size 5 and the array oif size 2 became eligible for garbage collection
 
class ArrayVariable{

	public static void main(String... args){

		int[][] array = new int[3][2];
		array[0] = new int[5];
		array[0][1] = 4;
		array[0][2] = 4;
		array[0][3] = 4;	
		array[0][4] = 4;
		array[0][0] = 4;

		for(int x : array[0]){
			System.out.println(x);
		}
	}
}