/*
if the method is abstract then that class has to be abstract

Child class must provide the implementation of the abstract class

Even if child class is not able to implements those method, then declare the child class also as 
an abstratc class and implement the same method in next child class 


Concrete class : class which is not abstract

Concere class must provide the implementation of the abstract method of parent class, or else that program wont be compiled.

if class is abstract thgen it is not mandatory to have at least one abstract method, 
but if any method is abstract then that class containing abstract method must be abstract!


We can not create the object of the abstract class but we can create the reference variable to create the object of child class if it is concrete class !!!

can we create the constructor of the abstract class? 
YES, becasue we can use it with the constructor chaining for initialising values!

*/

abstract class vehicle {

  // as class vehicle can not answer below methods colution so we just have to define the method and not to open them
  /* void noOfWheels(){

  }*/

  //abstratct methods are those method which can be decalred but can never be defined, we never write the implementations as those belongs to the or answerable from the child class
  abstract void noOfWheels();

  abstract void engineCpacity();
}

abstract class TwoWheeler extends vehicle {

  @Override //used to check if the below method override parents method or not
  void noOfWheels() {
    System.out.println("2 Wheels");
  }

//below method already defined by the parent of Twowheelers hence its not neccesary to rewrite these methods
  //abstract void engineCpacity();

  abstract void engineStroke();
}

abstract class FourWheeler extends vehicle {

  void noOfWheels() {
    System.out.println("4 Wheels");
  }

  //abstract void engineCpacity();
}

class Activa125 extends TwoWheeler {

  void engineCpacity() {
    System.out.println("125CC");
  }

  void engineStroke() {
    System.out.println("4 Stoke");
  }
}

class I20 extends FourWheeler {

  void engineCpacity() {
    System.out.println("800CC");
  }
}

//hee last child can also be declared an an abstract class, but it not of use to
//declare method abstratc evrytime which we will never use!

/*abstract class Activa125 extends TwoWheeler {

    abstract void engineCpacity();

} */

class AbstractDemo {

  public static void main(String[] args) {
    vehicle v1 = new Activa125();
    vehicle v2 = new I20();

    //here v1 benig ref var, at run time will check for the noOfwheels() methods in child class it not there will go up in parents to check if its there or not!
    v1.noOfWheels();
    v2.noOfWheels();

    //since below method is not in the vehicle class we can not access it with the ref variable of vehcile class we will have to use ref var of the class in which it is present
    //         v1.engineStroke();

    //here v1 will ref var, at ruin time will check for the engineCap() method in child class if found will execute the same without going upward
    v1.engineCpacity();
    v2.engineCpacity();

    TwoWheeler twv = new Activa125();
    FourWheeler fv = new I20();

    twv.noOfWheels();
    twv.engineCpacity();

    // since it is abstract and parent of this method is TwoWheeler so we will have to create the ref var of that class and access thru the same
    twv.engineStroke();

    fv.noOfWheels();
    fv.engineCpacity();
  }
}
