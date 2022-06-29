/*
Each time constructor gets invoked first but init block gets executed first 

Bydefault the first line in the contructor is super(); i.e. call to the super class constructor

Here in this eg,
after the line 
    Child c = new Child();
compiler will call constructor of the child class and then then with super();, it will reach to the parents contructor:

if parent class has no GrandP then parent class has object class acts as GrandP and once the object 
class constructor invoked then the constructor chaining is said to got complete

Once constructor chaining gets completed, then which ever class called oject class constructor, init block for that class gets executed

IMPORTANT : 
=> If we explicitely write the contructor with some arguments then Compiler wont provide the default constructor

*/

class Parent {
  {
    System.out.println("Init parent");
  }
  
  Parent(int a) {
    System.out.println("P Cone");
  }
}

class Child extends Parent {
  {
    System.out.println("Child Init");
  }

  Child() { // ERR : Implicit super constructor Parent() is undefined. Must explicitly invoke another constructorJava(134217871)
      //super(10);
    System.out.println("C Czero");
  }

  Child(int a) { // Implicit super constructor Parent() is undefined. Must explicitly invoke another constructorJava(134217871)
      //this();
    System.out.println("C Cone");
  }
}

public class ConstructorChain4 {

  public static void main(String[] args) {
    //Child c = new Child();
    //Parent p = new Parent();

    Child c1 = new Child(10);
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 22>javac ConstructorChain4.java
ConstructorChain4.java:36: error: constructor Parent in class Parent cannot be applied to given types;
  Child() {
          ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
ConstructorChain4.java:41: error: constructor Parent in class Parent cannot be applied to given types;
  Child(int a) {
               ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
2 errors

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/