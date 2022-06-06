
class WrapperClassDemo2{
	
	public static void main(String[] args){
		//Boxing, AutoBoxing
		//converting primitive to wrapper class object 
		Integer i1 = 10; 
		// Step 1 : int -> Integer
		// Step 2 : Integer = Integer
		
		
		System.out.println(i1);//10
		//Unboxing, AutoUnboxing
		//converting wrapper class object to primitive
		int i = i1;
		//Integer -> int
		// int = int
		System.out.println(i);//10
		
		
		byte b = 10;
		Integer i2 = b;
		// byte -> Byte 
		// Integer = Byte
		
		short s = 20;
		Integer i3 = s;
		// short -> Short
		// Integer = Short
		int x = 10;
		Byte b2 = x;
		//int - > Integer
		//Byte = Integer
		
		
	}
	
}