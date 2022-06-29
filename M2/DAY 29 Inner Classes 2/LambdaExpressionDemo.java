interface I1 {
  void m2();
  void m3();
}

interface I2 {
  void m2();
}

interface I3 {
  void m2(int a, int b);
}

interface I4 {
  int m2(int a, int b);
}

interface I5 {
  int m5(int c, int a, int b);
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

public class LambdaExpressionDemo {

  public static void main(String[] args) {
    I2 a = () -> {
      System.out.println("Lambda Expression");
    };
    //While passing the arguments to method in labda expr make sure that argment var must not be used for any other purpose in main thread here or else will give CR saying duplicate var found
    I3 b = (x, y) -> { // here in arguments no need to specify the data type for the arguments but if one specified then specifiy for all or else it will give an error
      System.out.println("Lambda Expression");
    };
    I4 c = (p, q) -> p + q; //as the method inside I4 retruns int so we can directly write this as this is the single instruction/statement

    I5 d = (r, s, t) -> r + s + t;

    a.m2();
    b.m2(10, 20);
    System.out.println(c.m2(10, 30));
    System.out.println(d.m5(10, 20, 20));
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 29>javac LambdaExpressionDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 29>java LambdaExpressionDemo
Lambda Expression
Lambda Expression
40
50
*/
