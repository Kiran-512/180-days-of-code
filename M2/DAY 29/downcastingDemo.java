class Parent{
	int x =100;
	
	void m2(){
		
		System.out.println("The value of X from Parent class is "+x);
	}
}
class Child extends Parent{
	
	void m1(){
		
		System.out.println("Child :: M1");
	}
}

class downcastingDemo{

	public static void main(String... args){
	
			Parent P =new Child();
			
			//P.m1(); // error as m1 isnt present in the parent class which is checked at the compile time
			
			Child C = (Child)P;
			
			C.m1();
			
			Object o = new Parent();
			
			//o.m2(); //ERROR as m2 isnt present in the Object class
			
			Parent p = (Parent)o;
			
			p.m2();
			
	}
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 29>javac downcastingDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 29>java downcastingDemo
Child :: M1
The value of X from Parent class is 100

*/