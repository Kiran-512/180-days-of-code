
class Sync{
	
	synchronized void m1(){
		System.out.println(Thread.currentThread().getName()+" m1 Started");
		try{Thread.sleep(2*1000);}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" m1 Ended");
	}
	
	synchronized void m2(){
		System.out.println(Thread.currentThread().getName()+" m2 Started");
		try{Thread.sleep(2*1000);}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" m2 Ended");
	}
	
	void m3(){
		System.out.println(Thread.currentThread().getName()+" m3 Started");
		try{Thread.sleep(2*1000);}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" m3 Ended");
	}
	
	synchronized static void m4(){
		System.out.println(Thread.currentThread().getName()+" m4 Started");
		
		try{Thread.sleep(2*1000);}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" m4 Ended");
	}
	
	synchronized static void m5(){
		System.out.println(Thread.currentThread().getName()+" m5 Started");
		
		try{Thread.sleep(2*1000);}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" m5 Ended");
	}
	static void m6(){
		System.out.println(Thread.currentThread().getName()+" m6 Started");
		
		try{Thread.sleep(2*1000);}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" m6 Ended");
	}
}

class SynchronizedDemo{
	public static void main(String[] args){
		Sync s1 = new Sync();
		Sync s2 = new Sync();
		
		Thread t1 = new Thread("T1"){
			public void run(){
				s1.m1();
				// Sync.m4();
			}
		};//new
		Thread t2 = new Thread("T2"){
			public void run(){
				s1.m1();
				// s1.m2();
				//s2.m1();
				//s1.m3();
				//Sync.m4();
				//Sync.m5();
				Sync.m6();
			}
		};//new
		// t1.setName("T1");
		// t2.setName("T2");
		
		t1.start();
		try{Thread.sleep(20);}catch(InterruptedException e){}
		t2.start();
	}
}