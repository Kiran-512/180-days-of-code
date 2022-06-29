interface I3{
	void m1();
}

interface I4{
	void m4();
	void m5();
}
interface I5{
	void m6(int a, float b);
}

interface PQR{
	int add(int a, int b);
}

interface Button{
	void click();
}

class LambdaExpressionDemo{
	
	public static void main(String[] args){
		
		// Create a Child class
		// override m6()
		// save object in x
		I5 x = (c,d) -> {
			System.out.println("Child:m6()");
			System.out.println(c+" "+d);
		};
		
		x.m6(10, 20.f);
		
		I3 a = new I3(){
			
			@Override
			public void m1(){
				System.out.println("Child:m1()");
			}
		};
		
		I3 b = () -> {
			System.out.println("Lambda m1() called");
		};
		
		b.m1();
		
		/*m2(a);
		
		I4 i4 = new I4(){
			public void m4(){
			
			}
			
			public void m5(){
			
			}
		};*/
		
		PQR p = (aa,bb) -> {
			
		};
		System.out.println("Add res = "+p.add(10,20));
		
	}
}