interface I1 {
  void m2();
  void m3();
}

class Parent {

  void m1() {}
}

class Child extends Parent {

  @Override
  void m1() {
    System.out.println("CHILD M1");
  }
}

class XYZ implements I1 {

  public void m2() {}

  public void m3() {}
}

public class AnonymousDemo3 {

  static void m2(I1 i) {
    i.m3(); // this method must be there in Interface I1
  }

  public static void main(String[] args) {
    Thread t = new Thread() {};

    Parent p = new Parent() {}; // Syntax of Anonymous Inner class

    I1 a = new I1() { // THIS Anonymous child of interface has got the compulsion to implement both the methods of Interface I1
      @Override
      public void m2() {
        System.out.println("ANONYMOUS INNER CLASS M2");
      }

      @Override
      public void m3() {
        System.out.println("ANONYMOUS INNER CLASS M3");
      }
    };
    //here even if we pass a, which is ref var for the object of anonymous class or we pass directly the object of anonymous class to the method arguments
    m2(a);

    m2(
      new I1() { // when we are passing the anonymous class which if its the child of Interafce, as an argument to the method it must implement all the methods of interface
        @Override
        public void m3() {
          System.out.println("ANONYMOUS INNER CLASS M3");
        }

        @Override
        public void m2() {
          System.out.println("ANONYMOUS INNER CLASS M2");
        }
      }
    );
  }
}
