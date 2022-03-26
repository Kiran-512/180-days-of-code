class Notes{
  

}
class NotesDemo{
    
    int i = 10;

    void inst(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        
    }

}

/*
===========================================================================================================
Init block:
- written inside the class out of the methods:
- used to initialise the instance variables:
- Init block will be called no of time as the no of object created e.g. if 5 ob created of class A then init 
  block of the class A will be called 5 times:

written simply with the curly braces as
{

    statements;

}



===========================================================================================================
We can access the static var and methods inside the instance methods becasue static var and methods are part of the class and they are already in the memory,
So we can access them

Where as instance var and method are the part of object and they are not in the memory so not able to access directly without object

why instance var can be accessed within the instance method without object?

===========================================================================================================
Every ref var hold three values:
Notes n = new Notes();//Object of the same class;
Notes n = null;
Notes n = new Notescild();//Object of the child class of the type(class) of reference variable in this case child class of Notes class:here class NotesChild extends Notes{};

1.n is of Notes type(class)

When ref var pf particular objects assigned to another ref var of another object, 
then the first object will be collected by the garbage collector

 ObBasics b1 = new ObBasics();
 ObBasics b2 = new ObBasics();

 b1=b2;
 here the object of b2 will be collected by garbage collector

===========================================================================================================

if we take same var name for the both the for local and for instance then compilers wont give any error:
class NotesDemo{
    
    int i = 10;
    public static void main(String[] args) {

    NotesDemo n = new NotesDemo();

    int i = 15;
        System.out.println(i); // 15
        System.out.println(n.i); // 10

    }

}
===========================================================================================================
*/