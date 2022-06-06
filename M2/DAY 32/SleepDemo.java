class MyThread6 extends Thread{

	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+" -> "+Thread.currentThread().getName());//
		}
		System.out.println(Thread.currentThread().getName()+" sleeping");//
		try{Thread.sleep(15*1000);}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" awake and done");//
	}
}

class SleepDemo{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+" Started");//Main or main
		MyThread6 t1 = new MyThread6();
		MyThread6 t2 = new MyThread6();
		MyThread6 t3 = new MyThread6();
		MyThread6 t4 = new MyThread6();
		
		t1.start();
		try{Thread.sleep(10*1000);}catch(InterruptedException e){}//MAIN WILL SLEEP
		t2.start();
		try{Thread.sleep(10*1000);}catch(InterruptedException e){}//MAIN WILL SLEEP
		t3.start();
		try{Thread.sleep(10*1000);}catch(InterruptedException e){}//MAIN WILL SLEEP
		t4.start();
		try{Thread.sleep(10*1000);}catch(InterruptedException e){}//MAIN WILL SLEEP
		System.out.println(Thread.currentThread().getName()+" Ended");//Main or main
	}
}