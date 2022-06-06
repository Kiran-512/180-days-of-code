package packa;
import packb.C;

class A{
	public static void main(String[] args){
		
		//Same package 
		B b = new B();
		System.out.println(b.x);
		//System.out.println(b.y);
		System.out.println(b.p);
		System.out.println(b.q);
		
		b.m1();
		//b.m2();
		b.m3();
		b.m4();
		
		
		//C c = new C();
		//System.out.println(c.j);
		//System.out.println(c.k);
		//System.out.println(c.l);
		//System.out.println(c.m);
		
		//c.m1();
		//c.m2();
		//c.m3();
		//c.m4();
		
		System.out.println(C.n);
		C.m5();
		
		
		C c = new C(10,20);
		System.out.println(c.j);
		c.m1();
		
	}
}

