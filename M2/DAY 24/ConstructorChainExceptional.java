/*Verp Important conept:
As when we declare the parameterized constructor compiler wont privde any default constructor so that time there will be CE as constructor chaining wopnt get completed
as We must defined the Parent class constructor with the zero args


Constructor chaining is said to be completed when it reached the constructor of object class

*/

class Parent {

  Parent() {} // this is must to avoid CE

  Parent(int a) {}
}

class Child1 extends Parent {

  Child1(int a) {}
}

class Child2 extends Parent {}

class Child11 extends Child1 {
  // here is error as Child1 has no construtor with the zero args, erro due to incmplement constructor chaining

}

public class ConstructorChainExceptional {

  public static void main(String[] args) {
    Parent p1 = new Child1(10);
    Parent p2 = new Child2();
    Child1 c = new Child11();
  }
}
