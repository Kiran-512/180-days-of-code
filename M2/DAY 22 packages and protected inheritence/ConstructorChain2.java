/*
Each time constructor gets invoked first but init block gets executed first 

Bydefault the first line in the contructor is super(); i.e. call to the super class constructor

Here in this eg,
after the line 
    Child c = new Child();
compiler will call construcotr of the child class and then then with super();, it will reach to the parents contructor:

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

  Parent() {
    System.out.println("P Czero");
  }

  Parent(int a) {
      this();
    System.out.println("P Cone");
  }
}

class Child extends Parent {
  {
    System.out.println("Child Init");
  }

  Child() {
      //super(10);
    System.out.println("C Czero");
  }

  Child(int a) {
      //this();
    System.out.println("C Cone");
  }
}

public class ConstructorChain2 {

  public static void main(String[] args) {
    
    Parent p = new Parent();

    //Child c = new Child();
    // Child c1 = new Child(10);
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 22>javac ConstructorChain2.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22>java ConstructorChain2
Init parent
P Czero

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/