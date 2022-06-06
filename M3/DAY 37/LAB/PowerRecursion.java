class PowerRecursion{
	public static void main(String... args){
		
		int x=5,n=3;
		int pow = powerCalculate(x,n);
		System.out.println(pow);
	}
	static int powerCalculate(int x,int n){
		if(n==0)
			return 1;
		
	int pow = n*powerCalculate(x,n-1);
	int xn = x*pow;
	return xn;
	}
}