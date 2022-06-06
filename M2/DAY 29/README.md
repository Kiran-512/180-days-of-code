Notes for the day
=========================
Multithreading:
JAM will schedule threads 
we can only start threads
=========================
Lambda Expression:
- Workds only on functional INTERFACES
- functional INTERFACES is an interface with Only one abstract Method
- SYNTAX : 
        I2 i = () -> {
            //Code to override the method of the functional interface
            System.out.println("Overridden the method of the FI in the Lambda Expression");
        };

Diff between Anonymous class and Lamda Expression:
- Both are the child classes only but lambda expression dont have the .class file
- Both used for creating the child class at run time
- Anonymous class works on concrete class,abstract class and even on interface too! but Lambda Expr works only on functional INTERFACES i.e. with the lamda expr we are allowed to creat the child class of functional interaface only.

java owned functional interfaces:- 
Runnable
Cloneable

Please ref multithreading and I/O sessions notes for these two FUNCIONAL INETRAFCES

=========================
Object class:
- Every class direclty or indireclty inheriting this class
- 

toString();
We override this method of object class in order to give meaningfull message instead of ClassName@hashcode, when we print the ref_var of particuar Object

=========================
Out calss can not be static :

We can't declare outer (top level) class as static because the static keyword is meant for providing memory and executing logic without creating Objects, a class does not have a value logic directly, so the static keyword is not allowed for outer class.

But inner class can be static:

=========================
Local Inner Class
Why we can not modify the local variable inside the local Inner class?
- When we create the Local inner class the instance variables of the method will go on heap in the object of the local inner class as since instance var of method can be accessed inside the class
Since those variales on the heap we can assign that object to the static REF VAR OF Object class and
can modifty the value of that variables of method outside of that method
which is inethical!! hence JAVA wont allow to alter the value of local variable inside the Local 
inner class and we have to make it final so that it can not be accessed outside of the object
=========================
