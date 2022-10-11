class ArmStrong{

	public static void main(String... args){

	int n = 153;
	int r,temp =n,sum=0;
	while(n>0){
		r=n%10;
		n=n/10;
		sum+=(r*r*r);
	}
	if(sum== temp)
	{		System.out.println("yesss"); return;}
		System.out.println("No");

	}

}