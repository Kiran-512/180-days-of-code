class A{
	int p = 10;
	int x = 100;
	void m1(){
		System.out.println("A:m1");
	}
}

class B extends A{
	int p = 20;
	int q = 30;
	
	void m1(){
		System.out.println("B:m1");
	}
	
	void m2(){
		System.out.println("B:m2");
	}
}

class C extends B{
	int p = 40;
	int q = 50;
	int r = 60;
	
	void m3(){
		System.out.println("C:m3");
	}
}

class MultiLevelInheritanceDemo{
	public static void main(String... args){
		A a1 = new A();
		a1.m1();//A:m1
		A a2 = new B();
		A a3 = new C();
		//B b = new A();
		//C c = new B();
		//C c = new A();
		B b1 = new B();
		b1.m1();//A:m1
		b1.m2();//B:m2
		B b2 = new C();//A:m1
		b2.m1();//A:m1
		C c = new C();
		c.m3();
		c.m2();//B:m2
		c.m1();
		System.out.println(a1.p);//10
		//System.out.println(a1.q);
		//System.out.println(a1.r);
		System.out.println(a2.p);//10
		//System.out.println(a2.q);
		//System.out.println(a3.q);
		//System.out.println(a3.r);
		
		System.out.println(b1.p); // 20
		System.out.println(b1.q); // 30
		//System.out.println(b1.r);
		System.out.println(b1.x); // 100
		
		System.out.println(b2.p);
		System.out.println(b2.q);
		//System.out.println(b2.r);
		System.out.println(b2.x);//100
		
		System.out.println(c.p);//40
		System.out.println(c.q);//50
		System.out.println(c.r);//60
		System.out.println(c.x);//100
		
		
	}
}