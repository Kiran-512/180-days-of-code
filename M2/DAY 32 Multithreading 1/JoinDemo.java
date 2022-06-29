class MyThread5 extends Thread{

	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+" -> "+Thread.currentThread().getName());//
		}
	}
}

class JoinDemo{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+" Started");//Main or main
		MyThread5 t1 = new MyThread5();
		MyThread5 t2 = new MyThread5();
		MyThread5 t3 = new MyThread5();
		MyThread5 t4 = new MyThread5();
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t4.setName("T4");
		
		t1.start();
		//try{t1.join();}catch(InterruptedException e){}
		t2.start();
		//try{t2.join();}catch(InterruptedException e){}
		t3.start();
		try{t3.join();}catch(InterruptedException e){}//
		t4.start();
		//try{t4.join();}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" Ended");//Main or main
	}
}