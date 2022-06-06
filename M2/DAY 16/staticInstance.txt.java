class staticInstance{
	int x;
	static void m(){
		System.out.println(x);
	}
}
class demo{
	
public static void main(String... args){
	
		staticInstance s = new staticInstance();
		
		s.m();
}
	
} 