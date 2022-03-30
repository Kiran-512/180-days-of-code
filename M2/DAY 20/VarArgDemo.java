class VarArgDemo{


	static void add(int a,int b,int... arr){
		int result = a;
		for (int i=0;i<arr.length;i++){
			result= result + arr[i];
		}
		
		System.out.println(result);
	}
	
	
	public static void main(String[] args){
		//VarArgDemo.add();
		//VarArgDemo.add(1);//1
		VarArgDemo.add(1,2);//3
		VarArgDemo.add(1,1,1,1,1);//5
	}
}