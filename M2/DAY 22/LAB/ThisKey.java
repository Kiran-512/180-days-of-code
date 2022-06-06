/*
Can we override a static method?
No, we cannot override static methods because method overriding is based on dynamic binding at runtime and 
the static methods are bonded using static binding at compile time. So, we cannot override static methods.

The calling of method depends upon the type of object that calls the static method. It means:

If we call a static method by using the parent class object, the original static method will be called from the parent class.
If we call a static method by using the child class object, the static method of the child class will be called.

*/

class Fizz {

  int x;
  int y;
  static int z;
}

class DemoT {

  Fizz fz;
  static int a;
  int b;
  static final int c;
  static DemoT dems;
  DemoT demi;

  static {
    c = 40;
  }

  {
    this.a = 30;
  }

  DemoT() {
    this.a = 20;
  }

  void m1(DemoT c) {
    System.out.println("Instance m2 from parent");
  }

  static void m2() {
    System.out.println("Static m2 in DemoT");
  }
  static void m2(int a) {
    System.out.println("Static m2 in DemoT");
  }
}

class ThisKey extends DemoT {

  static void m2() {
    System.out.println("static m2 from child");
  }

  public static void main(String[] args) {
    DemoT d = new DemoT();
    d.m1(d);
    d.m2();

    DemoT dt = new ThisKey();

    dt.m2();

    ThisKey tk = new ThisKey();
    tk.m2();

    DemoT.dems = new DemoT();

    DemoT.dems.a = 100;
    DemoT.dems.b = 50;

    System.out.println(dems.b);
    System.out.println(dems.a);

    DemoT demi = new DemoT();

    demi.a = 100;
    demi.b = 500;

    System.out.println(demi.b);
    System.out.println(DemoT.a);

    //NOT ALLOWED
    //    DemoT.fz =new Fizz();
    d.fz=new Fizz();

    d.fz.x = 1000;
    d.fz.y = 2000;

    System.out.println(d.fz.x);
    System.out.println(d.fz.y);

  }
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 22\LAB>javac ThisKey.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22\LAB>java ThisKey
Instance m2 from parent
Static m2 in DemoT
Static m2 in DemoT
static m2 from child
50
100
500
100
1000
1000

C:\CDAC\Github\180-days-of-code\M2\DAY 22\LAB>

//
d.fz=new Fizz();
If such object of fizz is not created then below error will occur

Exception in thread "main" java.lang.NullPointerException: Cannot assign field "x" because "<local1>.fz" is null
        at ThisKey.main(ThisKey.java:78)

*/
