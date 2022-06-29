
class AddThread extends Thread{
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+" started!!");
		int sum = 0;
		
		for(int i=0;i<20;i++){
			sum = sum + i;
		}
		
		System.out.println("sum : "+sum+"   "+Thread.currentThread().getName()+" ended!!");
	}
}

class MulThread extends Thread{
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+" started!!");
		int res = 1;
		
		for(int i=1;i<=10;i++){
			res *= i;
		}
		
		System.out.println("res : "+res+"   "+Thread.currentThread().getName()+" ended!!");
	}
}



class ThreadDemo2{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+" started!!");
		AddThread at = new AddThread();//new state
		at.setName("Add-Thread");
		
		MulThread mt = new MulThread();// new state
		mt.setName("Mul-Thread");
		
		at.start();
		mt.start();
		
		
		Thread evenAdd = new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName()+" started!!");
				int res = 0;
				for(int i=1;i<=20;i++){
					if(i%2 == 0){
						res += i;
					}
				}	
				System.out.println(res+" "+Thread.currentThread().getName()+" ended!!");
			}
		}; // new state
		evenAdd.setName("Even-Add-Thread");
		evenAdd.start();
		
		Thread oddAdd = new Thread(){
			
			public void run(){
				System.out.println(Thread.currentThread().getName()+" started!!");
				int res = 0;
				for(int i=1;i<=20;i++){
					if(i%2 != 0){
						res += i;
					}
				}	
				System.out.println(res+" "+Thread.currentThread().getName()+" ended!!");
			}
			
		}; // new state
		oddAdd.setName("Odd-Add-Thread");
		oddAdd.start();
		
		System.out.println(Thread.currentThread().getName()+" ended!!");
	}
}