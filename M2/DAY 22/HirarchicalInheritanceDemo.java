class Parent{
	int i=10;
	void m1(){
		System.out.println("A::m1()");
	}
}
class Child1 extends Parent{
	int j = 20;
	void m2(){
		System.out.println("B::m2()");
	}
}

class Child2 extends Parent{
	int k = 30;
	void m3(){
		System.out.println("C::m3()");
	}
}

class HirarchicalInheritanceDemo{

	public static void main(String[] args){
		Parent p1 = new Parent();
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		Parent p2 = new Child1();
		Parent p3 = new Child2();
		
		//If m1 wouldnot have been in 'Parent class' then it wou;ld have checked in the Parent of 'Parent class' and even if its not there then Its a CError
		p2.m1(); //A::m1
		//p2.m2();
		//p2.m3();
		c1.m1();// A::m1
		c1.m2(); //B:m2
		
		c2.m1();// A:m1
		//c2.m2();
		c2.m3();//C:m3
		
		System.out.println(p2.i);//10
		//System.out.println(p2.j);
		//System.out.println(p2.k);
		
		System.out.println(c1.i);//10
		System.out.println(c1.j);//20
		//System.out.println(c1.k);
		
		System.out.println(c2.i);//10
		//System.out.println(c2.j);
		System.out.println(c2.k);//30
		
	}
}