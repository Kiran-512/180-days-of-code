/*
In this cdoe, static and instance variables and methods are been called in the main method.
Static are called with the class
Instance are called with the object  
*/

class StatInst {

  static int a = 10;
  static int b = 10;
  int c = 20;

  void m2() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c); // can access static variable without class name

    m1(); // can access static method without class name
  }

  static void m1() {
    StatInst b1 = new StatInst();
    System.out.println(a);
    System.out.println(b);
    //  System.out.println(c); can not acces instacen variable without object
    //m2(); can not acces instance method without abject
    b1.m2();

    StatInstDemo s2 = new StatInstDemo();
    s2.m3();

    StatInstDemo.m4();
  }
}

class StatInstDemo {

  static int d = 50;
  int e = 100;

  void m3() {
    System.out.println("Method in Demo class");
  }

  static void m4() {
    System.out.println("Method in Demo class");
  }

  public static void main(String[] args) {
    StatInst s1 = new StatInst();
    StatInstDemo s2 = new StatInstDemo();

    System.out.println(StatInst.a);
    System.out.println(StatInst.b);

    System.out.println(s1.c);

    StatInst.m1();
    s1.m2();
    //  m3(); can not access instance method wihtout object
    s2.m3();/* method can be called only if it belong to the particular class who's object is created, 
    here s2 is ref var of class StatInstDemo inside which the method m3 is declared*/
    m4();
  }
}
/*
We can call static variables and methods inside the instance method but reverse is not true
*/
