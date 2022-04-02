/*
Only upcasted REF VAR can be downcasted WHICH WERE Upcasted

Here type of object will remain the same and type of ref var ONLY will change.

Here, B extends A and C extends B
A
B
C

A a = new C();
B b = (C)a; 
C C = (C)a;
=======================================================

Mostly this concept is used in case of methods having arguments as an ref variables

NOTE: Basically we can not access the methods of child class which is not there in the parent class in case of upcasting 
i.e. Parent p = new Child();
if m1(); is there in the child but not in the parent so we can not access with p.m1();
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
    z.m3();
  }

  static void callMethod3(Object o) {
    //         o.m3();
    //Here we can directly call m3() as it is not there in the Object class but its there in the child of Object class

    //Here we downcasted and the we called m3 which is in the YD class
    YD y = (YD) o;
    y.m3();
  }

  public static void main(String[] args) {
    //upcasting: Assigin object of chiuld class to the rref var of parent class
    PD p = new CD();

    //downcasting :
    CD C = (CD) p;

    XD x1 = new ZD();
    YD y1 = (ZD) x1;
    ZD z1 = (ZD) x1;

    XD x = new YD();
    YD y = (YD) x;
    //  ZD z = (YD)x; CE:CAN NOT DE DOWNCASTED

    // x1.m1();
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
    YD yy = (YD)xx;

  }
}
