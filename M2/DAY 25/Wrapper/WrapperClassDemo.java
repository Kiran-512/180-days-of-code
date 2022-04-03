
class WrapperClassDemo{
	static void m1(byte b){
		
	}
	public static void main(String[] args){
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer i3 = Integer.valueOf("20");
		Integer i4 = Integer.valueOf("1010",2);
		
		System.out.println(i3);
		System.out.println(i4);
		
		Byte b1 = new Byte("10");
		System.out.println(b1);
		
		//Byte b2 = new Byte("abcde");
		//System.out.println(b2);//NFE
		
		byte x = 10;
		//m1(10);
		m1(x);
		
		Byte b3 = new Byte(x);
		b3 = new Byte((byte)10);
		System.out.println(b3);
		
		
		Short s1 = new Short("10");
		Short s2 = new Short((short)10);//CTE
		short s = 10;
		s2 = new Short(s);//CTE
		
		//S->p
		
		int x8 = Integer.parseInt("10");
		double y = Double.parseDouble("10.2");
		
		Integer i8 = new Integer(10);
		
		byte b6 = i8.byteValue();
		long l6 = i8.longValue();
		
		
		Byte b9 = new Byte("10");//10
		int i9 = b9.intValue();
		long l9 = b9.longValue();
		
		
		
	}
}