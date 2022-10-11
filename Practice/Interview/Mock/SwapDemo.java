//Swaping two nos!

class SwapDemo{

	int a =10, b=20;
	
	public static void main(String... args){
	
	int a =10, b=20;
	
	//java supports only pass by value 
	/*System.out.println("before swap " + a + "  " + b);	

	Swap1(a,b);

	System.out.println("after swap " + a + "  " + b);	
	*/	
	//Method 1
	SwapDemo sd = new SwapDemo();
	System.out.println("before swap " + a + "  " + b);	

	sd.Swap1(a,b);

	System.out.println("after swap " + a + "  " + b);	
	
	}
	
	static void Swap(int a, int b){
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Inside method " + a + "  " + b);		
	}

	void Swap1(int a, int b){
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Inside method " + a + "  " + b);		
	}	


}