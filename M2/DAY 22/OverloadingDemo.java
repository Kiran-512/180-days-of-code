class C{

	void m1(int a){
		System.out.println("int : m1");
	}
	
	void m1(float a){
		System.out.println("float : m1");
	}
	
	void m2(int a, int b, float c){
		System.out.println("int a, int b, float c : m2, A");
	}
	
	void m2(int a, double b, float c){
		System.out.println("int a, double b, float c : m2");
	}
	
}

class D extends C{
	
	@Override
	void m2(int a, int b, float c){
	System.out.println("int a, int b, float c : m2, B");
	}
	
	void m1(double a){
		System.out.println("float : m1");
	}
	
}

class OverloadingDemo{
	public static void main(String... args){
		D d = new D();
		
		d.m1(10);
		d.m1(10.0f);
		
		d.m2(10,10.0,20.0f);
		d.m2(10,10,20.0f);
	}
}