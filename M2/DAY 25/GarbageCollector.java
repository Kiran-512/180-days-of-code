/*
Garbage Colelctor :
======================
- It's a background thread with the lowest priority of 1(Priority low to high => 1-10)
- main thread has priority of 5
- JVM decide whher to run GC or not(We can't give surity)
- GC runs on heap memory area

=> When JVM decides to run GC 100%
	
case 1 : Threshold level reached (% changes java version to version)
- When heap memory is 80% full then JVM will give priority to run GC to free up the space

case 2 : When there is no thread to run 
- JVM will run GC when all threads have finished their work and no active thread is there

As a good programmer its good practice to make object eligible for GC once its use is done and he dont need it anymore!
CASE 1: Nulling a reference
	
	A a = new A();
-- work compledted for a
	a = null;

After this if GC runs then it will collect object created earlier by 'a'.

CASE 2: Reassiging a ref variable
	
		A a1 = new A();
		A a2 = new A();	
	-- work done for a1 and a1 has work with a2 then
		a1 = a2;
	
After this if GC runs then it will collect object created earlier by 'a1'.

CASE 3 : Island of Isolation IS ALWAYS ELIGIBLE FOR GC 



Ways to run GC :
WAY 1:GC METHOD FROM SYSTEM CLASS:

    System.gc(); // Deprecated method, not recommended to use  
    
WAY 2:By using SingleTon class  	
#SingleTonClass is the class which can be instantiated ONLY ONCE, which mean init block, constructor can be called only once

Runtime rt = Runtime.getRuntime();
    rt.gc();

Finallize method :
- It's a method of the Object class 
- We will override this method to release the resources aquired by the object before GC collects them
- E.g. printer pool
- This method will be called by JVM as per its wish on running System.gc(); but it not garuranteed that  jvm will run this method
- finallise will be always called before GC colects unreachable object
- It's like a last wish of the object before GC collect it
*/