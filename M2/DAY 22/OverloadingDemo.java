/*
Rules for Overloading : Compiled time polymorphism // static polymorphism
- Overloading can be done in the same class or in the different class too but orverriding can't be done in the same class!
- Method name must be same
- No of arguments can be same or diff, if arguments > zero , if no of arguments are same then at least one of the argument must be of diff data type 
- if method has zero arguments then to overload method need more than 1 argument
- Access modifier can be same or different
*/

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
		
		short b = 10;
		
		d.m1(b);// arguments implicite typecasting is done 
		
		d.m2(10,10.0,20.0f);
		d.m2(10,10,20.0f);
	}
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 22>java OverloadingDemo
int : m1
float : m1
int : m1
int a, double b, float c : m2
int a, int b, float c : m2, B

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/