/*
- Both instance synchronised and static synchronised behaves differently

Scenario No 1 :
- Lets Say Thread t1 and t2 calling m1 with s1
- with sleep lets say we gave thread t1 priority and when m1 will be called in T1 by s1 at tha time m1 being 
	synchronised lock on s1  will be aquired by thread 1 and if after lock aquiring t1 gets premptive (Scheduler can do anything) and came 
	back to READY state
- now t2 will get the chance to go ahead any will try to invoke m1 whiuch is being synchronised, t2 will aslo try to aquirre the lock 
	on s1 as m1 is being invoked by s1 in this case BUT since the lock on s1 is already aquired by the t1 so t2 will go in WAIT state
- Once t1 finsihes his work on m1 by s1 at that time s1 will notify the t2 to come out of the WAIT state


*/
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

/*
In ncase of instance method called by threads, threa will aquire lock on the reference varibles which calls the synchoronised method

In case of static methdo called by threads, thread will aquired lock on the object of the class Class created to store the meta data of our class which we can see with javap command

*/