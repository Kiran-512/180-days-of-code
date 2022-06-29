/*
Rules for Overriding : Run time polymorphism // Dynamic Method Dispatch / late binding
- Method Name must be same
- No of arguments must be same along with its order and datatype
- Method signature i.e. name and arguments(with the same datatype and same order) must be the same 
- Return type must be same
- access modifiers of the method to override in the child class must be same or less retrictive
- We can not overrider private method as its scope is within the parent class
- In overriding, implicite type casting is done in the case of method arguments see method m4(), in 
	this case child method won't get overriden as first widening of the argument will take palce
*/

class A{
	void m1() // yahan access modifier is 'default'
	{
		System.out.println("A:m1()");
	}

	void m2(int x, double y){
		System.out.println("A:m2()");	
	}

	public void m3(int p, int q, float r, double s){
		System.out.println("A:m3()");
		
	}

	void m4(int a) // yahan access modifier is 'default'
	{
		System.out.println("A:m4()");
	}
	
	private void m5(){}
}

 
class B extends A{
	@Override
	public void m1() // yahan parent class ke access modifier se kam restrictive hona chaiye -> protected or public hona chaiye
	{
		System.out.println("B:m1()");
	}
	@Override
	protected void m2(int x, double y){
		System.out.println("B:m2()");		
	}
	@Override
	public void m3(int p, int q, float r, double s){
		System.out.println("B:m3()");
	}
		
	//@Override // Overriding.java:51: error: method does not override or implement a method from a supertype
	void m4(short d) // yahan access modifier is 'default'
	{
		System.out.println("B:m4()");
	}
	
	//@Override //Overriding.java:58: error: method does not override or implement a method from a supertype 
	 void m5(){}
}

class Overriding{
	public static void main(String[] args){
		A a = new B();
		a.m1();
		a.m2(10,20);
		a.m3(20,30,40.0f,3.14);	
		a.m4(10); // This method is not overridden due to diff arguments
		
		short s =10;
		a.m4(s);
	}
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 22>javac Overriding.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22>java Overriding
B:m1()
B:m2()
B:m3()
A:m4()
A:m4()

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/