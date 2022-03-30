class ForEachLoopDemo{
	
	public static void main(String[] args){
		
		int[] arr = {10,20,30};
		
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//for-each loop
		for(int val : arr){
			System.out.println(val);
		}
		
		int arr2d[][] = {
						{10,20},
						{30,40},
						{50,60}
					};
					
		for(int i = 0;i<arr2d.length;i++){
			for(int j=0;j<arr2d[i].length;j++){
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println("");
		}
		
		for(int rows[] : arr2d){
			for(int colValue : rows){
				System.out.print(colValue+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("3D loop printing!!");
		int arr3d[][][] = {
								{
									{10,20},{30,40}
								},
								{
									{50,60},{70,80}
								}
							};
							
		for(int i = 0;i<arr3d.length;i++){
			for(int j=0;j<arr3d[i].length;j++){
				for(int k=0;k<arr3d[j].length;k++){
					System.out.print(arr3d[i][j][k]+" ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("3D using for each loop!!");
		for(int[][] dim1 : arr3d){
			for(int dim2[] : dim1){
				for(int value : dim2){
					System.out.print(value+" ");
				}
				System.out.println("");
			}
		}
		
	}
}