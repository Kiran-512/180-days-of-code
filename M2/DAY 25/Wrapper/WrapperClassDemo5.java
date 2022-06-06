class WrapperClassDemo5{
	
	static void m1(Integer i){
		//1
		System.out.println("1");
	}
	
	static void m1(Object o){
		//2
		System.out.println("2");
	}
	
	public static void main(String[] args){
		Object o = new Integer(10);
		
		Object o1 = 10;
		m1(o1);
		
		Integer i = new Integer (10);
		m1(i);
		
		Byte b = new Byte((byte)10);
		m1(b);
		
	}
}