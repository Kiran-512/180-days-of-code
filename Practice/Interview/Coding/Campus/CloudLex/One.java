interface I1{
	default void m1(int i){
		System.out.println(i);
	}
}

interface I2{
	default void m1(int i){
		System.out.println(i+10);
	}
}


class One implements I1,I2{
	
	public void m1(int j){
		
			I1.super.m1(49);
			I2.super.m1(49);
		}

		
	public static void main(String[] args){
			
		new One().m1(20);
	}
}