class Factorial{
	public static void main(String... args){
		int n = 5;
		int fact = FactorialRecurse(n);
		
		System.out.println(fact);
		
	}	
	static int FactorialRecurse(int n){
		if(n==1)
			return 1;
		int fmn1 = FactorialRecurse(n-1);
		int fn = n*fmn1;
		return fn;
	}
	
}