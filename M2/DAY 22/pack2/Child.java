/*
Protected can be accessed outside the class only thru inheritence and that too only inside the inherited 
child class and that too with the inherited class ref variable only
hence there is error on line 
    System.out.println(p.b);
    p.m2();

Also proctedt can be accessed within classes of the same package too!

*/

package pack2;

import pack1.Parent;

public class Child extends Parent {

  public static void main(String[] args) {
    Child c = new Child();
    Parent p = new Child();

    //error on below lines
    //     System.out.println(p.b);
    //      p.m2();

    //here protected var and method access thru the ref type of child of parent that too with the ref
    //variable of child class ONLY
    System.out.println(c.b);
    c.m2();
  }

  public void printParentInstaneVar() {
    System.out.println(a);
    System.out.println(b);
    m2();
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 22>javac pack2\Child.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22>java pack2.Child
30
m2

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/
