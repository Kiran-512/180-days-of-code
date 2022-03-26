/*
In this cdoe, static and instance variables and methods are been called in the main method.
Static are called with the class
Instance are called with the object  
*/

class StatInst {

  static int a = 10;
  static int b = 10;
  int c = 20;

  static void m1() {
    StatInst b1 = new StatInst();
    //Static method can directly access static var and static method of the same class
    System.out.println(a);
    System.out.println(b);

    m6();

    //Static method can not access instance var AND Instance method of the same class direclty, obj is needed
    //System.out.println(c); CE :
    System.out.println(b1.c);
    //m2(); CE: can not acces instance method without abject
    b1.m2();

    //Static method can not access instance var AND Instance method of another class direclty, obj is needed
    StatInstDemo s2 = new StatInstDemo();
    System.out.println(s2.e);
    s2.m3();

    //Static method can directly access static var and static methds of another class with the class name
    StatInstDemo.d = 100;
    StatInstDemo.m4();

    System.out.println(StatInstDemo.d);
    //  System.out.println(StatInstDemo.e); CE:
    System.out.println(s2.e);
  }

  void m2() {
    //Instance method can access static variable without class name
    System.out.println(a);
    System.out.println(b);

    //Instance Method can access instance var and methods of same class
    System.out.println(c);
    m5();

    //Instance Method can access static method without class name as m1 belongs to the same class
    m1();

    //Instance Method can access static var and methods of demo class
    StatInstDemo.m4();
    StatInstDemo.d = 100;

    //Instance Method can access instance var and methods of demo class
    StatInstDemo s3 = new StatInstDemo();
    s3.e = 100;
    s3.m3();

    //System.out.println(StatInstDemo.e);// can not make static ref to the non static-var
  }

  void m5() {
    System.out.println("Instance Method 5");
  }

  static void m6() {
    System.out.println("Static Method 6");
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

V IMP ::: Static var and methods are the part of the class so we can use them anywhere in the particular class wihtout class_name
In case we are using it in another class then we can use it with class_name.stat_var, class_name.stat_method and they are the part of the class,
becasue its already present in the memory! 

But for instance var and method we need object compulsorily to call them anywhere in the program

Hence we can use static var and methods in instance method too but vice a versa is not true!

*/
