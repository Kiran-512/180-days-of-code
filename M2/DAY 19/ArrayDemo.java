class Dozen{
	
}

class ArrayDemo{

	public static void main(String args[]){
		
		/*
		//java ArrayDemo 30 10
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		*/
		
		int iarr[] = new int[10];
		boolean barr[] = new boolean[5];
		Dozen darr[] = new Dozen[20];
		
		
		for(int i=0;i<iarr.length;i++){
			System.out.print(iarr[i]+" ");
		}
		System.out.println("");
		
		
		for(int i=0;i<barr.length;i++){
			System.out.print(barr[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<darr.length;i++){
			System.out.print(darr[i]+" ");
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
		
		
		
	}
}