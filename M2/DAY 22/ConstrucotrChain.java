/*
Bydefault the first line in the contructor is super();

Here in this eg,
after the line 
    Child c = new Child();
comp will call construcotr of the child class and then then with super();, it will reach to the parents contructor:

if parent class has no GrandP then parent class has object class acts as GrandP and once the object 
class constructor invoked then the constructor chaining is said to got complete


If we explicitely write the contructor with some arguments then Compiler wont provide the default constructor

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
      super(10);
    System.out.println("C Czero");
  }

  Child(int a) {
      this();
    System.out.println("C Cone");
  }
}

public class ConstrucotrChain {

  public static void main(String[] args) {
    // Child c = new Child();
    // Parent p = new Parent();

    Child c1 = new Child(10);
  }
}
