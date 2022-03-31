
class A{
	void m1() // yahan access modifier is 'default'
	{
		System.out.println("A:m1()");
	}

	public void m2(int x, double y){
		System.out.println("A:m2()");
		
	}

	public void m3(int p, int q, float r, double s){
		System.out.println("A:m3()");
		
	}

	void m4(int a) // yahan access modifier is 'default'
	{
		System.out.println("A:m4()");
	}

}

 
class B extends A{
	public void m1() // yahan parent class ke access modifier se kam restrictive hona chaiye -> protected or public hona chaiye
	{
		System.out.println("B:m1()");
	
	}

	public void m2(int x, double y){
		System.out.println("B:m2()");
		
	}
	
	public void m3(int p, int q, float r, double s){
		System.out.println("B:m3()");
	
	}

	void m4(double d) // yahan access modifier is 'default'
	{
		System.out.println("B:m4()");
	}


}

class Overriding{
	public static void main(String[] args){
		A a = new B();
		a.m1();
		a.m2(10,20);
		a.m3(20,30,40.0f,3.14);	
		a.m4(10);

	}
	
}