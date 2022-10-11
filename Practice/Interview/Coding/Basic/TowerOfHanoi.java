import java.util.Scanner;

class TowerOfHanoi{

public static void main(String... args){
	
	
	int n,t1,t2,t3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of disk!");
	n=sc.nextInt();
	
	System.out.println("Enter the tower no's : ");
	t1=sc.nextInt();
	t2=sc.nextInt();
	t3=sc.nextInt();
	
	toh(n, t1,t2,t3);

}
	static void toh(int n, int t1, int t2, int t3){

	if(n==0)return;
		
	toh(n-1, t1,t3,t2);
	System.out.println(n+" moved from "+ t1 +" to "+ t2);
	toh(n-1, t3,t2,t1);	
	}
	
}