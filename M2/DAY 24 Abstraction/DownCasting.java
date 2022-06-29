/*
Only upcasted REF VAR can be downcasted!

Here type of object will remain the same and type of ref var ONLY will change.

Here,C extends B and B extends A
A
B
C

A a = new C();
B b = (C)a;
C C = (C)a;
=======================================================

Mostly this concept is used in case of methods having arguments as an ref variables, and paramter as Object class ref variable so first it downcasted and then used

NOTE: Basically we can not access the methods of child class which is not there in the parent class in case of upcasting 
i.e. Parent p = new Child();
if m1(); is there in the child but not in the parent so we can not access with p.m1();
We must define in parent class to override the method m1(); in child class OR we downcast the upcated ref var

So here we downcast the ref var (which is upcasted), as
Child C = (Child)p;     

and then we can access C.m1(); with this;
========================================================
,
and 

*/

class PD {}

class CD extends PD {}

class XD {
  void m1() {}
}

class YD extends XD {

  void m2() {}

  void m3() {}
}

class ZD extends YD {

  void m1() {}

  void m2() {}

  void m3() {}
}

class DownCastingDemo {

  static void callMethod(Object o) {
    //         o.m1();
    //with the downcasting
    XD x = (XD) o;
    x.m1();
  }

  static void callMethod2(Object o) {
    //        o.m3();
    ZD z = (ZD) o;
    z.m3();	//OR ((ZD)o).m3();
  }

  static void callMethod3(Object o) {
    // o.m3(); // CE : M3 must be defined for the Object Type
    //Here we can not directly call m3() as it is not there in the Object class but its there in the child of Object class

    //Here we downcasted and then we called m3 which is in the YD class
    YD y = (YD) o;
    y.m3();
  }

  public static void main(String[] args) {
    //upcasting: Assigin object of child class to the rref var of parent class
    PD p = new CD();

    //downcasting :
    CD C = (CD) p;

    XD x1 = new ZD();
    YD y1 = (ZD) x1;
  	YD y2 = (YD) x1;
    ZD z1 = (ZD) x1;

    XD x = new YD();
    YD y = (YD) x;
    //  ZD z = (YD)x; //CE:CAN NOT DE DOWNCASTED

    x1.m1();
    // x1.m2();
    // x1.m3();

    Object o = new XD();

    //    We can not access
    //    O.m1();

    //WITH the downcasting we can use m1
    //(XD)o.m1(); this will give error as paranthesis is not used check below eg
    ((XD) o).m1();

    XD x3 = new XD();
    callMethod3(x3);

    ZD z2 = new ZD();
    callMethod2(z2);

    YD y2 = new YD();
    callMethod3(y2);

    //classCasteException because every ref has ONLY THREE values and here its not there in that list of three
    XD xx = new XD();
    YD yy = (YD) xx;
  }
}
