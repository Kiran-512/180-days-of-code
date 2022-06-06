package pack.pack1;
import pack.pack1.B;

class A{

public static void main(String[] args) {
    
    //same package
    B b = new B();
    System.out.println(b.x);
//System.out.println(b.y);
    System.out.println(b.z);
    System.out.println(b.w);

    b.m1();
  //  b.m2();
    b.m3();
    b.m4();

    //diff package

}

}