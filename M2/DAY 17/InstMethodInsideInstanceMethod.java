class InstMethodInsideInstanceMethod {

}

class MathOp {

  int num1;
  int num2;
  static int result;

  MathOp(int a, int b) {
    this.num1 = a;
    this.num2 = b;
  }

  void add() {
    result = num1 + num2;
    System.out.println(" The addition is  " + result);
    sub();
    this.mult();// this can be written as mult(); i.e. without this, but preferable is to use this keyword to represent the current invokation of object
    //can we call the object m2 here ANS is NO because mo2 is the local variable of main method whose scope is limited to that method only
    //If we create the object in the class outside the method then we can use the that object inside any method   

  }

  void sub() {
    result = num1 - num2;
    System.out.println("The sub is " + result);
  }
  void mult(){
    result = num1 * num2;
    System.out.println("The multiplication is " + result);
  }
}

class MathOpDemo {

  public static void main(String[] args) {
    MathOp b = new MathOp(10, 20);
    b.add();
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac InstMethodInsideInstanceMethod.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java MathOpDemo
 The addition is  30
The sub is -10
The multiplication is 200

C:\CDAC\Github\180-days-of-code\M2\DAY 17>
*/
