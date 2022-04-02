
===========================================================

Notes for the day
===========================================================
Abstract class:

if constructor chaining is not completed then code wont be compiled, it will trhow 
compilation error

if vehcile calss has two subclasses TwoWheele{} and FourWheeler{};
then these two classes has to override below methods compulsorily
noOfWheels();
engineCapacity();

in this eg class vehcilce wont answer the above mentioned questions so it will ask to 
check with his child classes so these method we can not define in the parent class:

- abstratct methods are those method which can be decalred but can never be defined, 
  we never write the implementations
- if the method is abstract then that class has to be abstract
- abstract class dont have body
e.g.
abstarct void engeinCapacity();


===========================================================

Interface :
in previous eg if vehcile class only used for the declarations then make such declaration 
classes as an interface  


implements keyword is used

- One class can inherit only one class, but one class can implements many interfaces:
- Interafce is not part of object class heirarchy
- Interfaces do no have constructors
- bydefault interfaces are abstract
- bydefault interface methods are publkic and abstract 
- bydefault interface variables are public static and final
- We can not write the CONCRETE METHODS inside the interafce 
 - We can create the ref variable of interface
 - 


Multiple inheritence IN java 
Using class NO
using interfaces YES

In case of same method in both the parent interaface of any class it woul create the ambigutiy

===========================================================

Downcasting:
Basically we can not access the methods of child class which is not there in the parent class in case of upcasting 
i.e. Parent p = new Child();
if m1(); is there in the child but not in the parent so we can not access with p.m1();
So here we downcast the ref var (which is upcasted), as
Child C = (Child)p;     
and then we can access C.m1(); with this;

Here, B extends A and C extends B
A
B
C

A a = new C();
B b = (C)a; 
C C = (C)a;


classcasteexception:
When we ry to assign the object of parent class to the ref var of child class with the downcasting compiler wont throw error but at run time it will throw classCasteException as we can assign only THREE values to the ref variables
1.null
2.object of the same class
3.object of the child class

===========================================================



