/*
TWO WAY's of creating threads:

1.exteding the Thread class (Thread also implements Runnable)
2.implementing the Runnable interface (Recommended)

*/

// Common task share 
class MyThread extends Thread{
	
	MyThread(String name){
		super(name);
	}
	
	MyThread(){}// since we created constructor with parameter hence we have to create the constructor with the zero args

	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+" -> "+Thread.currentThread().getName());//
		}
	}

	//We can ddefine and implement other method but those methodswill have to call explicitely unlike run() which will be called aumatically
}

class ThreadDemo1{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+" Started");//Main or main
		
		MyThread t1 = new MyThread();//new state
		t1.setName("T1");
		MyThread t2 = new MyThread();//new state
		t2.setName("T2");
		MyThread t3 = new MyThread();//new state
		t3.setName("T3");
		MyThread t4 = new MyThread("T4");//new state
		System.out.println(Thread.currentThread().getName()+" Starting Threads");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		/*while(true){
			System.out.println(Thread.currentThread().getName()+" still alive!!");//Main or main
		}*/
		System.out.println(Thread.currentThread().getName()+" Ended");//Main or main
	}
}
/*
=> Multithreading porocess states : TLC / Thread Life Cycle 
- When thread is created it will be in the NEW state
- with the start(), we will bring that thread into the RUNNABEL or READY stage
- one thread is in the READY stage we can not call the same thread with the start(), it wil give CE
- LTS will plan the execution of the thread in the ready stage to move into RUNNING stage and thread will start its execution
	the starting point of the thread is run(), same as main() in main thread,
	if we do not override the run() of thread class or Runnable interface then run method of the thread class will be called
	which is empty and exectuion will complete with no processing!	
- In the multithreading environment, thread will get preempt after certain time quntum with the yeild(), and will go back in READY state
	and other thread will move ahead in RUNNING state and it will start its execution	
- Its not sure which thread will get the chance to move ahead its all dependent on the Long Term Scheduler
- If the thread completes it work then stop() will be called internally and it moves the the STOP stage

- Assuming thread T1 has aquiued the printer resource
-sleep(), wait() will bring the thread inot the WAIT state
- with the sleep(), after certain time interval thread goes back into the READY state
- wait() is used insynchronised atomoshphere and is called on the ref variable(Object) due to which thread moves inot the WAIT state
	if any other thread has aquired the lock on that ref variable 
- When that thread which has aquired lock on the ref var will finish its work then it will notify() to that thread or notifyAll() the threads
	which all are waiting for the lock on that ref variable

=> join()
- instance methiod of Thread class
- whichever thread calls this method, in that case there becomes a contract between the executing thread and the thread which calls join()
	that executing thread will stop until that thread which called join() completes its execution
e.g.
if main thread executes t1.join(), then there forms the contract between main and t1 that main wont proceed until t1 gets killed

=> sleep()
- STATIC method of Thread class
- whichever executing Thread calls this method will go in WAIT state for the certain time
Thread.sleep(1000); //here 1000 is in ms and its 1 second
10 second = 10,000 ms
20 seconds = 20,000 ms


=> Thread theory :
- main thread is the parent of all the thread
- until and unless all the child thread dies the parent thread never kills himself
- If any thread inside the main thread has any loops which runs infinite then the main thread wont get killed
	since its child would be still active

=> Why multithreading ?
- Assuming that our CPU has 4 cores, and if we are running only main thread in our code then only one core will be utiulised
- Instead IF we have multi threads assume 3 threads and 1 main thread,then that same load will ge devided into the various cores and all four core will be utilised
- so multithreading helps to distribute the load

=> stack status :
- Each thread has seperate stack
- and each stack frame has three things 
1.Local Variable arary
2.Operands
3.Other characters

- Thread has different stack and pc registeres but the code and data would be the same across all the threads unlike processes


Deamon Thread :
- service thread running in the background e.g. GC thread
- setDeamonThread() - to set the thread as deamon thread and its must be done before we start() thread
- main thread can never be set Deamon
- isDeamonThread() - used to checkif the thread is deamon or NOT

*/

//=> OUTPUT 
/*
main Started
main Starting Threads
main Ended
0 -> T4
1 -> T4
2 -> T4
0 -> T1
0 -> T2
1 -> T1
3 -> T4
2 -> T1
0 -> T3
1 -> T2
1 -> T3
3 -> T1
4 -> T4
4 -> T1
2 -> T3
2 -> T2
3 -> T3
5 -> T1
5 -> T4
6 -> T4
4 -> T3
5 -> T3
3 -> T2
6 -> T3
7 -> T4
6 -> T1
8 -> T4
7 -> T3
4 -> T2
8 -> T3
9 -> T4
7 -> T1
10 -> T4
11 -> T4
9 -> T3
10 -> T3
11 -> T3
12 -> T3
5 -> T2
6 -> T2
13 -> T3
12 -> T4
8 -> T1
13 -> T4
14 -> T3
7 -> T2
8 -> T2
15 -> T3
14 -> T4
9 -> T1
15 -> T4
16 -> T3
9 -> T2
17 -> T3
16 -> T4
17 -> T4
10 -> T1
11 -> T1
18 -> T4
18 -> T3
19 -> T3
10 -> T2
19 -> T4
12 -> T1
13 -> T1
14 -> T1
11 -> T2
15 -> T1
12 -> T2
16 -> T1
13 -> T2
17 -> T1
14 -> T2
18 -> T1
15 -> T2
16 -> T2
19 -> T1
17 -> T2
18 -> T2
19 -> T2
*/
