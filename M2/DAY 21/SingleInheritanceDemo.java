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
		c.printParentData();
		
		c.printData();
		c.m2();
		c.m1();
		
		System.out.println(c.a);
		System.out.println(c.b);
		
		Parent p = new Parent();
		//p.printParentData(); // CTE
		System.out.println(p.a);
		System.out.println(p.b);
		p.m1();
		
		
		Parent p1 = new Child();
		p1.m1();
		//p1.m2();///CTE
		System.out.println(p1.a);
		//System.out.println(p1.x);
		
		
		
		
	}
}