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