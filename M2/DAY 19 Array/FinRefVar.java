class FinRefVar {

  static int i; // will get the default value
  static final int a; // will not get the default value so we assign value for final static var either in the same line or in static block ONLY

  static final boolean b;

  final int c;
  final int d;

  final int e;
  
  static {
    a = 10;
    b = true;
    // e=300; ERROR as non static members can not be referenced from static area
  }

  {
    c = 10;
    e=300;

  }

  FinRefVar() {
    d = 100;
  }
}

class FinRefVarDemo {

  public static void main(String[] args) {
    FinRefVar fv = new FinRefVar();

    System.out.println(fv.c);
    System.out.println(fv.d);

    System.out.println(FinRefVar.a);
    System.out.println(FinRefVar.b);
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 19>javac FinRefVar.java

C:\CDAC\Github\180-days-of-code\M2\DAY 19>java FinRefVarDemo
10
100
10
true

C:\CDAC\Github\180-days-of-code\M2\DAY 19>
*/
