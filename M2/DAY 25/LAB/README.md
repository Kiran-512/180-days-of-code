# Notes for the day

Concrete Class:

Its obligation for the conceret class to implement all the abstract methods of parent abstarct class or parent interface!

===========================

final, fnally, finallise

final:

- class can be final which can not be inherited
- method can be final, which cant be override e.g. If parent class has final method then that method can't be
  overriden in child
- local var can be final : we can not change it later on
- instance variable can be final : we can not change it later on and must be initialised on the same line or in
  init block
- static var can be final : we can not change it later and must be initialised on the same line or in static
  block
- final abstract can not be declared together AS BOTH HAVE opposite meaning
- abstract must override and final can not be chnaged later on

===========================

Method hiding:
As static methods are the part of the class hence we cannot override the static metod and its called as
Method hiding

===========================

IQ:
If any class has all the methods abstract then it is better to make that class as an interafce or else we will
watse our extneds word with its child class and we wont eb able to extend any other class.

===========================

# page no 94 95 96 for IS-A and HAS-A relationship

Garbage Collection:

- Its a background thread with the lowest priority of 1
- JVM will decide when to run GC check point 1 and 2 below, when ever it will run it will try to free memory 100%
- Its method to make heap memory free : eg it takes away the unreachable objects from heap

Garbage Collection thread :
Every thread has priority from 10 to 1 (Highetst to Lowest)
bydefault priority OF any thread created in JAVA in 5.

It works on heap memory

1.Threshoulkd level
When heap reached 80% then 100% GC will work

2.No active threads, then JVM will call GC to collect unreachable Objects

3.As a good programmer make the objects which are used and have no more work left, eligible to JVM for GC
i>nulling a reference
A a = new A();
A a1 = new A();

a = null;
a1 = null;

a=a1=null;

ii>Reassigining a ref variable
A a = new A();
A a1 = new A();
a = a1;

iii>Island of isolation
In this case ref var inside the objects will ref to another object and no ref var from stack will ref to the object so no option available to reach the objects in heap area
===========================

Requesting JVM to run GC threat: using :

1.  System.gc();

- In System class there satic method gc which will when a coder req JVM that time it might run gc as not
  gauranteed that it will run.
- This is deprecated method:

2.  Run time class:

- its singleton class

Runtime rt = Runtime.getRuntime();
rt.gc();

===========================

Singleton class is a class which can be instantiated only ONCE!
private constructor
init block and contructor will be called only once
only one object can be created!

===========================

finallize method:(PAGE NO 254 TO 263 SCJP)

- Its a method of Object class
- Its the method which will be called as per JVM wish before GC collects the unreachable object
- Will override the finalize method to release the aquired resources which are held by the objects
- So ts not good idea to release the resource with this finalize method as this will be called as per
  JVM's wish and do not have the control over it

Funny Defination:
In short When JVM is about to kill the objects which holds the recources, JVM will ask whats his last wish and 
object will ask to run the finalize method of the Object class which we can override in that class and after 
realse the resources GC will take way that Object.

javap java.lang.Object

Called by the garbage collector on an object when garbage collection determines that there are no more 
references to the object. A subclass overrides the finalize method to dispose of system resources or to perform 
other cleanup.

The general contract of finalize is that it is invoked if and when the Java virtual machine has determined that
 there is no longer any means by which this object can be accessed by any thread that has not yet died, except 
 as a result of an action taken by the finalization of some other object or class which is ready to be 
 finalized.
=============================
String class:

- String literals are immutable 
If String s = "Kiran";
    s = "Akshay";
    then String "Kiran" will still exisitng in the pool and its value can not be changed hence its immutable
- String literals are saved in String pull for particular range

String literals are saved in String pull which is part of heap ONLY
Purpose of string class is to reused to string Objects

here s1 == s2; => wil always compare the binary representation
but s1.equals(s2); => method will always compare the content

VIMP:
When String pool overflows GC has nothing to do with the String pool
=========================================
Wrapper Classes:
- Number is the parent class of wraper classes
- Wrapper classes are final so they dont have any child

Various pools when JVM creates as instance when any program runs
Byte,Short,Integer,Long = -128 to 127 (256 Objects are in respective pool)
Character = 0-127
Boolean = true,false



Object=>Number=>Wrapper=>Integer,Short,Byte,Long,Float,Double

=========================================
Assignment:
WAP to create a single ton class:
