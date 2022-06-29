class PD {}

class CD extends PD {}

class XD {

  void m1() {}
}

class YD extends XD {

  void m1() {}

  void m2() {}
}

class ZD extends YD {

  void m1() {}

  void m2() {}

  void m3() {}
}

class DownCastingDemo {

  static void callMethod(Object o) {
    XD x = (XD) o;
    x.m1();
  }

  static void callMethod2(Object o) {
    //o.m3();
    ZD z = (ZD) o;
    z.m3();
  }

  static void callMethod3(Object o) {
    ((YD) o).m2();
  }

  public static void main(String... args) {
    PD p = new CD();
    CD c = (CD) p;

    XD x = new ZD();
    YD y = (YD) x;
    ZD z = (ZD) x;

    x.m1();
    //x.m2();
    //x.m3();
    y.m1();
    y.m2();
    //y.m3();

    z.m1();
    z.m2();
    z.m3();

    Object o = new XD();
    ((XD) o).m1();

    XD x2 = (XD) o;
    x2.m1();

    XD x3 = new XD();
    callMethod(x3);

    ZD z2 = new ZD();
    callMethod2(z2);

    YD y3 = new YD();
    callMethod3(y3);
  }
}
