/*
Conclusions:
to access the var and methods ouside of the package it must be
- public
- protected

NOTE:protected can only be accessed thru the inheritance

*/

package pack2;

import static pack1.A.e; // here this e must be public

import pack1.A;

public class C {

  public static void main(String[] args) {
    A a = new A();

    System.out.println(a.a);

    //private var canbe not accessed anywhere outside the class
    // System.out.println(a.b);
    //default variables can not be accessed outside of the package
    //System.out.println(a.c);
    //protetced can be accessed only thru the inheritence
    //System.out.println(a.d);

    
    //static var is accessed with the class(priority) or object name
    System.out.println(a.e);
    System.out.println(A.e);

    //SINCE WE HAVE IMORTED THIS Static var then also we can use it directly wihtout the class name
    System.out.println(e);

    //  public method can only be accessed outside of the package
    a.m1();


    //private,default and protected of another package can not be accessed in this way
    /*a.m2();
    a.m3();
    a.m4();
    */

  }
}
