class staticInstance{
	int x;
	static int y;
	static void m(){
		System.out.println(y);
		//System.out.println(X);// ERROR
	}
}
class A{
			static {
					int x = 10;
			}
			
}
class demo{
	
public static void main(String... args){
	
		staticInstance s = new staticInstance();
		A a = new A();
		
		// Even if we write below method then JVM will treat it as "staticInstance.m()" and "A.m()", with the type fothe reference variable 
		s.m(); // NO ERROR
		//a.m(); // ERROR 
		
		
		//Error on below two lines
		System.out.println(a.x);
		System.out.println(A.x);
}
	
} 