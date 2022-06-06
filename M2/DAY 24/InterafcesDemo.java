/*
Here in case of interface, the parent of TwoWheeler class has got two parents and constructor chaining will get completed with the object class being another parent class 
*/

interface vehicle {
  //Variables in interafces are bydefault are public static final
  int x = 10; // public static final int x =10;

  //Methods in interafces are bydefault are public abstarct
  void noOfWheels(); // abstarct public void noOfWheels();

  void engineCpacity(); // abstarct public void  engineCapacity();

  static void m1() {} // static method implemetation is allowed inside the interface
  // public void m2(){} //public method implementation is not allowed inside the interface

  // public void m2();// this method is bydefault abstract

}

abstract class TwoWheeler implements vehicle {

  @Override //used to check if the below method override parents method or not
  //since method noOfWheels inherited from interafce vehicle in which this method has access modifiers as public and abstartc so this method must have the aceess modifier less retrictive in order to override
  public void noOfWheels() {
    System.out.println("2 Wheels");
  }

  public abstract void engineCpacity();

  abstract void engineStroke();
}

abstract class FourWheeler implements vehicle {

  public void noOfWheels() {
    System.out.println("4 Wheels");
  }

  public abstract void engineCpacity();
}

class Activa125 extends TwoWheeler {

  public void engineCpacity() {
    System.out.println("125CC");
  }

  // here this method is not made public as this is not inside the interface but inside the abstarct class TwoWheeler
  void engineStroke() {
    System.out.println("4 Stoke");
  }
}

class I20 extends FourWheeler {

  public void engineCpacity() {
    System.out.println("800CC");
  }
}

class InterafcesDemo {

  public static void main(String[] args) {
    vehicle v = new Activa125();
    v.noOfWheels();
  }
}
