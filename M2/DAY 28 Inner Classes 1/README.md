Notes for the day!
==================
Exception:
Incase of checked Exceptions, it is must to have error prone code in try if  we declare any catch block with the checked Type argument:

==================
Inner class:

Coupling : The way by which one class knows about the another class
Loose coupling: In which one class know LESS ABOUT the other class

Cohesion: Whether the class serves the pupoose for which its defined/ how well focused class is 
Tight cohesion : class must serve the purpose nad it must be highly focused

Types:
1.Regular Inner class//Instance Inner class 
.class file name : OuterClass$Innerclass.class
- It's the instance member of the outer class
- ONLY REGULAR inner CLASS CAN HAVE ANY Access modifier
- Only instance var and methods defined inside this class 
- Static var and method can not be defined inside this class
- Regular Inner class can access the instance members of the OuterClass but reverse is not ture!!

2.Method local class
.class file name : OuterClass$1MethodLocalInnerclass.class

- class created inside the local method
- MLIC can only be final, default to hehi
- Before 1.8 for local var in a method one has to declare it as final but that compulson remover later,
	to access the instance var inside the MLIC
- 


3.Anonymous inner class
.class file name : OuterClass$1.class,OuterClass$2.class, etc.

- When we create the child class of Parent class but in this case Child class has no name
- They inherits some imterface or class
- We can not create the constructor as its has no name
- its used ONLY once
- Parent a = new Parent(){

};
- incase of interface I
I i = new I(){

    //This Anonymous class has obligation to implement all the methods of Interface I
};
- Creating the object of anonymous class intself is an upcasting as type of a is Parent and Object is of Anonymous class so we can override the methods and use like upcasting 
- This is the only child class without extends and implements keyword
- With Anonymous class wither we can implement interface or we can extend a class and not the both the things simultanousely
- You can't and does not make sense to declare anonymous class as abstract class as anonymous are used as local class only once.


4.Static inner class
5.Lmabda Expression: // HOT TOPIC FOR THE INTERVIEWS NOW A DAYS //
==================

With the hekp of javap command we will get to know about the innerClasses especially about the AnonymousClass







==================

