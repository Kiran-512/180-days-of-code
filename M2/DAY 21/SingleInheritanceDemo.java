class Parent{

	int a = 10;
	int b = 20;
	
	void printData(){
		System.out.println(a);
		System.out.println(b);
	}
	
	void m1(){
		System.out.println("Parent::m1()");
	}
	void m3(){
		System.out.println("Parent::m3()");
	}

}


class Child extends Parent{
	
	int a = 30;
	int x = 100;
	
	void printParentData(){
		System.out.println(a);
		System.out.println(b);
	}
	
	void m1(){
		System.out.println("Child::m1()");
	}
	
	void m2(){
		System.out.println("Child::m2()");
	}

}


class SingleInheritanceDemo{
	public static void main(String[] args){
		Child c = new Child();
		
		//Compiler => Checks reference Type
		//Below compiler ill check if printParentData method is there in Child class, if its there it will direclty execute that
		c.printParentData();

		//On Below line, compiler will check if printData method is there in Child class, If yes it will execute,if not then it will check whether Child class extends any other class if yes then it will check in that Parent class and its its there then that method will get executed		
		c.printData();
		c.m2();
		c.m1();
		
		System.out.println(c.a);//30
		System.out.println(c.b);//20 Since b is not present in Class C so it will check in its parent
		
		Parent p = new Parent();
		//p.printParentData(); // CTE
		System.out.println(p.a);//10
		System.out.println(p.b);//20
		p.m1();
		
		
		//UPCASTING - Assigning the object of the child class to the parent class
		Parent p1 = new Child();
		//Here compiler will check if m1()exist in type of p1 i.e. in Parent class if YES then it will check in its instance Type i.e. Child class and if its there in child class then it will execute the method of the child class and if its not there in the child class but present in the parent class Only then it will execute the parent class method
		p1.m1();

		//below is CE asm2() is not there in parent class
		//p1.m2();///CTE

		System.out.println(p1.a);
		//System.out.println(p1.x);//ERROR 
		
		p1.m3();
		
		
	}
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 21>javac SingleInheritanceDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 21>java SingleInheritanceDemo
30
20
10
20
Child::m2()
Child::m1()
30
10
20
Parent::m1()
Child::m1()
10
Parent::m3()
*/