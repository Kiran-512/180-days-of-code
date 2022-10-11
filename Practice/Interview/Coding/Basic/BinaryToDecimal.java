class BinaryToDecimal{

	public static void main(String... args){

	int decimal=0,weight=1,rem,binary = 1101;
	
	while(binary!=0){
		
		res=binary%10;
		decimal+=rem*weight;
		binary=binary/10;
		weight=weight*2;
	}
	}
}