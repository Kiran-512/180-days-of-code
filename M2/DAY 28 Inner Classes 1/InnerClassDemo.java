class OuterClass {

  int x = 100;
  int a = 100;

  void m1() {
    System.out.println("Outer class m1");
    // this line gives CE:
    // System.out.println("We can not access the instance mebers of the inner class in outer class" +y);

   OuterClass.InnerClass i = new OuterClass.new InnerClass(); 
   OuterClass.InnerClass i1 = new InnerClass(); 
   InnerClass i3 = this.new InnerClass(); 
   InnerClass i2 = new InnerClass(); // this is acceptable inside the instance method but if we create the object of inner class in static method then we must write as per the first statement on line no 11

   i.m1();// Inner m1


  }

  /* We can assign all access modifiers like methods and variable to this inner class too!
    Inner class have its own instance variables and methods like normal class

  */
  class InnerClass {

    // Regular Inner class can access the instance members of the OuterClass but reverse is not ture!!

    int y;
    int a = 300;

    public void m1() {
      System.out.println("Inner m1");
    }

    void m2() {
      System.out.println("Inner class m2");
      System.out.println("The value of x from outer class is " + x);
      m1();
      System.out.println("The value of a is  " + a); // this will print var a from inner class
      System.out.println("The value of a is  " + this.a); // this will also print var a from inner class
      System.out.println("The value of a is  " + OuterClass.this.a); // Now this will print var a from Outer class

      m1();
      this.m1();
      OuterClass.this.m1();
      // OuterClass.m1();// this will give Compiler error

    }
  }

  class InnerClass2 {

    void m2() {
      System.out.println("m2 rom Inner2");
    }
  }
}

class RegularInnerClass {

  public static void main(String[] args) {
    OuterClass oc = new OuterClass();
    System.out.println(oc.x);
    oc.m1();

    OuterClass.InnerClass inrefvar = oc.new InnerClass();

    System.out.println(inrefvar.y);

    inrefvar.m2();

    OuterClass.InnerClass2 inner1 = oc.new InnerClass2();

    inner1.m2();
  }
}
/*

*/
