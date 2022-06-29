//Common implementation share
class MyRunnable implements Runnable{
	
	@Override
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+" -> "+Thread.currentThread().getName());
		}
	}
}

class RunnableDemo1{
	public static void main(String[] args){
		MyRunnable r1 = new MyRunnable();//This is not thread
		
		Thread t1 = new Thread(r1);//new state
		t1.setName("T1");
		Thread t2 = new Thread(r1,"T2");//new state
		
		t1.start();
		t2.start();
		
	}
}