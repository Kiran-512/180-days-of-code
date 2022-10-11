class WrapperDemo{

	public static void main(String... args){
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(false);
		Boolean b3 = new Boolean("Some random string");
		Boolean b4 = new Boolean("TrUe");

		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//false
		System.out.println(b4);//true
		
	}
}