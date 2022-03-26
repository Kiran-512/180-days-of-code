class Notes{
  

}
class NotesDemo{
    

    void inst(){
      
    }
    public static void main(String[] args) {
        
    }

}

/*

===========================================================================================================
Path of Binary representation for how to reach the  variables:


===========================================================================================================

this keyword:

- this keyword is only accessible only instance block:e.g. init block,constructor and the instance method
- its reference variable available ONLY inside the instance bock and not inside the static block
- this will always represent the currently invoked object
- if this is not used then instance variables stil hold the initial values if there is name conflict 

e.g.
    int num1;
    int num2;
    MathOp(int num1, int num2){
      num1 =num1;
      num2 =num2;
    }
in this case the values for our instance variables are still zero due to ambiguity in the names
to correct this error;

    int num1;
    int num2;
    MathOp(int num1, int num2){
      this.num1 =num1;
      this.num2 =num2;
    }
===========================================================================================================
Constructor:
- used to enhance readability of the code
- used to initialise the values
- must have name same as class name
- constructor will be called after init block always 
- if constructor is not created then there will be default constructor with the zero argument
- if we are creating constructor then we must pass the values in object as specified in the contruct arguments!

===========================================================================================================
Init block:
- written inside the class out of the methods:
- used to initialise the instance variables:
- Init block will be called no of time as the no of object created e.g. if 5 ob created of class A then init 
  block of the class A will be called 5 times:
-  Since no arguments can be passed so we can not initiase the var inside the init block dynamically like constructor

written simply with the curly braces as

{
    statements;
}
===========================================================================================================
We can access the static var and methods inside the instance methods becasue static var and methods are part of the 
class and they are already in the memory,
So we can access them

Where as instance var and method are the part of object and they are not in the memory so not able to access directly 
without object

why instance var and methods can be accessed within the instance method without object?
Since this keyword always refer to point to the current invoked object hence we can call one instance method from another Instance method.

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