abstract class myThread implements Runnable{}


class LambdaDemo{

public static void main(String... args){
	
myThread t = new myThread(){
		@Override
		public void run(){
		int sum =0;

		for(int i=0;i<=10;i++){
			sum+=i;
		}

		System.out.println("sum is "+sum);
		
	}
};
	
	Thread t1 = new Thread(t);
	t1.start();
	
	
	Runnable r = ()->{
		
		int sum =0;
		
		for(int i=0;i<=10;i++){
			sum+=i;
		}
		
		System.out.println("sum is "+sum);
	};
	
	Thread t2 = new Thread(t);
	t2.start();
}

}
/*
C:\CDAC\Github\180-days-of-code\Practice\Basics\String>javac LambdaDemo.java

C:\CDAC\Github\180-days-of-code\Practice\Basics\String>java LambdaDemo
sum is 55
sum is 55

C:\CDAC\Github\180-days-of-code\Practice\Basics\String>
*/


/*
interface PQR{
	int add(int a, int b);
}
PQR p = (a,b)->a+b;
*/