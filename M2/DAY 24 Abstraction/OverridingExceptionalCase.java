/*
In overriding if parent method is private then there will be CE : Parents method is not visible
*/

class Parent {

  private void m1() {
    System.out.println("Parents Private method");
  }
}

class Child extends Parent {

  void m1() {
    System.out.println("Child method");
  }
}

public class OverridingExceptionalCase {

  public static void main(String[] args) {
    Parent p = new Child();
    p.m1(); //CE : PARENT's method is not visible to child
  }
}
