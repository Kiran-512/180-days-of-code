class DecimalToBinary{


	public static void main(String... args){
	
	int n=10;
	int rem, binary=0,i=1;
	
	while(n!=0){
		rem=n%2;
		n=n/2;
		binary+=(rem*i);
		i=i*10;
	}
	System.out.println(binary);

	}
}