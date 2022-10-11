abstract class A{

	abstract void display();
	abstract void show();
}

abstract class B extends A{
	
	public void display(){
		System.out.println("Hii from display");
	}
}


 class C extends B{
	
	public void show(){
		System.out.println("Hii from show");
	}
}



class AbstractDemo{

	public static void main(String... agrs){
		A a = new C();
		
		a.show();
		
		B b = new C();
		
		b.show();
		
		
	}

}