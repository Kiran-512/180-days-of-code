
Notes for the day
=========================================
final class
We can not inherit final class in another class

=========================================
final, fnally, finallise

final:
class can be final which can not be inherited
method can be final which cant be override
local var can be final : we can not change it later on
instance variable can be final : we can not change it later on and must be initialised on the same line or in init block
static var can be final : we can not change it later and must be initialised on the same line or in static block
final abstract can not be declared together AS BOTH HAVE opposite meaning
abstract must override and final can not be chnaged later on

=========================================
Method hiding:
As static methods are the part of the class hence we canot override the static metod and its called as Method hiding

=========================================
IQ: 
If any class has all the methods abstract then it is better to make that class as an interafce or else will watse our extneds word with its child class and we wont eb able to extend any other class.  

=========================================
page no 94 95 96 for IS-A and HAS-A relationship
=========================================
Garbage Collection:
Its a background thread with the lowest priority of 1
JVM will decide when to run GC check point 1 and 2 below
Its method to make memory free : eg it takes away the unreachable objects from heap  

Garbage Collection thread :
Every thread has priority from 10 to 1 (Highetst to Lowest)
bydefault priority OF any thread created in JAVA in 5.

It works on heap memory

1.Threshoulkd level
When heap reached 80% then 100% GC will work

2.No threads then JVM will call GC 

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



=========================================
Requesting JVM to run GC threat: using : 
1.
System.gc();
In System class there satic method gc which will when a coder req JVM that time it might run gc as not gauranteed that it will run.

This is deprecated method:

2.
Run time class:
- its singleton class

Runtime rt = Runtime.getRuntime();
rt.gc();

=========================================

Singleton class is a class which can be instantiated only ONCE!
private constructor
init block and contructor will be called only once
only one object ca be created!

=========================================
finallize method:(PAGE NO 254 TO 263 SCJP)

- Its a method of Object class
- Its the method which will be called as per JVM wish before GC collects the unreachable object 
- Will override the finalize method to release the aquired resources which are held by the objects
-  So ts not good idea to release the resource with this finalize method

Funny Defination:
In short When JVM is about to kill the objects which holds the recources, JVM will ask whats his last wish and object will ask to run the finalize method of the Object class which we can override in that class and after realse the resources GC will take way that Object. 

javap java.lang.Object

=========================================
String class:

- String literals are immutable 
- String literals are saved in String pull for particular range

=========================================
Wrapper Classes:
Number is the parent class of wraper classes and as Wrapper classes are final so they dont have any child

Object=>Number=>Wrapper=>Integer,Short,Byte,Long,Float,Double

=========================================
Assignment:
WAP to create a single ton class:
