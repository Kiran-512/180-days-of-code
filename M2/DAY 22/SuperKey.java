/*
Super is used basically for the calling parents var or method,

In case of method overriding if super is used in child method 
then in that case it will first go the parents method and then on childs method

this will always points to the currently invoked object in the same way,
super will refer to the super class of the currently invoked object.


*/
class GrandP {

  int a = 200;

  void sup() {
 //   System.out.println(super.a);
  }
}

class Parent extends GrandP {

  int a = 100;

  void m1(int a, int b) {
    System.out.println("Parent m1");
  }
}

class Child extends Parent {

  @Override
  void m1(int c, int d) {
    m1(c, d); //this will go in recursion
    super.m1(c, d); //thi will now call the parents m1 method and then it will come the childs m1 mthod at run time
    System.out.println("Child m1");
  }
}

class SuperKey {

  public static void main(String[] args) {
    Parent p1 = new Parent();
    Parent p2 = new Child();
    Child c = new Child();
    p1.m1(10, 20);
    p2.m1(10, 10);
    c.m1(10, 10);
  }
}
