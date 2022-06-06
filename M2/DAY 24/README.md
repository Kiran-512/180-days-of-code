# Notes for the day

Flow of execution in inheritence:
When we write class B extends A{}, in this case class A will be loaded first and then class B
so the static A then static B and if the object of B is created then init and constructr of A and B respectively

Very important concept of inheritance is constructor chaining as every class must have constructor with the zero args to complete the constructor chaining
if constructor chaining is not completed then code wont be compiled, it will trhow
compilation error

=========================
Abstract class:

Important : Abstract class is part of Object hierachy(part of constructor chaining) but can not be instantiated/ Have constructor / no objects / Parent class of top Abstract class is Obejct class

An abstract class is a class that is declared abstract —it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed. When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.

- If any method can not be implemented by the parent class and that method will overriden by the child class then that method must be declared as abstract in parent class
- For child class its and obligation toprovide the implementation, If child class also don't provide the implementation of the abstract method then that class also must be declared an an abstract

Syntax: abstract void method();

Note : We neve define abstract method we just declare it in abstract class!

if vehcile calss has two subclasses TwoWheele{} and FourWheeler{};
then these two classes has to override below methods compulsorily which are specified inside parent class
noOfWheels();
engineCapacity();

In this eg class vehicle wont answer the above mentioned questions so it will ask to
check with his child classes so these method we can not define in the parent class:

- abstratct methods are those method which can be decalred but can never be defined,
  we never write the implementations
- if the method is abstract then that class has to be abstract
- abstract class dont have body
  e.g.
  abstarct void engeinCapacity();

=========================

Interface :

VIMP :- Interafce is not part of object class heirarchy / NO CONSTRUCTOR / NO Object and the class which implements the interface will have object class as parent class and parent interface as the interface which it inherits

- 100% abstract class
- Interfaces specify what a class must do and not how. It is the blueprint of the class.
- A class that implements an interface must implement all of the non-default methods described in the interface, or be an abstract class.
- The interface body can contain abstract methods, default methods, and static methods.
- One class can inherit only one class, but one class can implements many interfaces:
- Interfaces do no have constructors
- bydefault interfaces are abstract
- bydefault interface methods are public and abstract
- bydefault interface variables are public static final
- We can not write the CONCRETE METHODS inside the interafce
- We can create the ref variable of interface
- "implements" keyword is used to inherit the interface

Syntax:
abstract interface interface_name{}
OR
interface interface_name{} // interfaces are bydefault abstract

In previous eg if vehcile class only used for the declarations then make such declaration
classes as an interface

- static void m1(){} // static method implemetation is allowed inside the interface
- public void m2(){} //public method implementation is not allowed inside the interface
- public void m2();// this method is bydefault abstract

NOTE for overriding method in case of Interafces: class which inherits from particular interface, must have
have acess modifier as public for the method which it would override becasue bydefault the methods in
interafces are public abstract.  

===========================
Multiple inheritence IN java

Using class NO
using interfaces YES

Exceptional case in multiple inheritence in case of interface:
In case of same method in both the parent interaface of any class it would create the ambigutiy

=========================
Downcasting:

Basically we can not access the methods of child class if it's is not there in the parent class in case of
upcasting
i.e. Parent p = new Child();
if m1(); is there in the child but not in the parent so we can not access it with p.m1();We must defined in
parent class to override the method m1(); in child class OR downcast the upcated ref var to access that method
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
=========================
classCasteException:
When we ry to assign the object of parent class to the ref var of child class with the downcasting compiler
wont throw error but at run time it will throw classCasteException as we can assign only THREE values to the
ref variables
1.null
2.object of the same class
3.object of the child class

=========================
