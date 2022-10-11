import java.util.Scanner;

class Fibbonacci{

	public static void main(String... args){
	Scanner sc = new Scanner(System.in);
	int n,a=0,b=1,c;
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
		c=a+b;
		System.out.println(c);
		a=b;//1 
		b=c;//1
	}
	}
	
}