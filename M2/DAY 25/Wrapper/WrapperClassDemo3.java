
//Byte , Short, Integer , Long = -128 to 127 (256 Objects are in respective pool)
//Character = 0-127
//Bollean = true, false

class WrapperClassDemo3{
	
	public static void main(String[] args){
		Integer i1 = 100;
		Integer i2 = 100;
		
		System.out.println(i1 == i2);//true
		
		Byte b1 = 120;
		Byte b2 = 120;
		
		System.out.println(b1 == b2);//true
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i3 == i4);//false
		
		System.out.println(i3.equals(i4));//true
		
		Integer i5 = new Integer(100);
		System.out.println(i1 == i5);//
		System.out.println(i1.equals(i5));//true
		
		
		
	}
	
}