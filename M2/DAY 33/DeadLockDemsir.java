
class DeadLockDemo{
	static DeadLockDemo d3 = new DeadLockDemo();
	static DeadLockDemo d4 = new DeadLockDemo();
	synchronized void m1(){
		System.out.println("m1()");
		try{Thread.sleep(50);}catch(InterruptedException e){}
		//d4.m2();
		
		synchronized(d4){
			System.out.println("Got d4 ka lock");
		}
	}
	
	synchronized void m2(){
		System.out.println("m2()");
		try{Thread.sleep(50);}catch(InterruptedException e){}
		//d3.m1();
		synchronized(d3){
			System.out.println("Got d3 ka lock");
		}
	}
	public static void main(String[] args){
		DeadLockDemo d1 = new DeadLockDemo();
		DeadLockDemo d2 = new DeadLockDemo();
		
		Thread t1 = new Thread(){
			/*public void run(){
				
				synchronized(d1){
					System.out.println("Got d1 ka lock");
					try{Thread.sleep(50);}catch(InterruptedException e){}
					System.out.println("waiting for d2 ka lock");
					synchronized(d2){
						System.out.println("D2 ka lock mil gaya");
					}
				}
				
			}*/
			public void run(){
				d3.m1();
			}
		};
		
		Thread t2 = new Thread(){
			/*public void run(){
				synchronized(d2){
					System.out.println("Got d2 ka lock");
					try{Thread.sleep(50);}catch(InterruptedException e){}
					System.out.println("waiting for d1 ka lock");
					synchronized(d1){
						System.out.println("d1 ka lock mil gaya");
					}
				}
			}*/
			public void run(){
				d4.m2();
			}
		};
		
		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t2.start();
	}
}