class PassByValue {
  int a;
  int b;

  PassByValue(int a, int b) {
    System.out.println();// this is used just print blank spaces
    System.out.println();
    System.out.println("Constructor invoked");
    this.a = a;
    this.b = b;
  }
  static void m1(PassByValue o1, PassByValue o2) {

    System.out.println();
    System.out.println();
    System.out.println("static m1 executed");

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    o1.a = 100;
    o1.b = 200;
    o2.a = 300;
    o2.b = 400;
    System.out.println("values assigned in m1");
    System.out.println();
    System.out.println();
  }
  void m2(PassByValue o) {
    System.out.println();
    System.out.println();
    System.out.println("instance m2 executed");

    System.out.println(this.a);
    System.out.println(this.b);
    System.out.println(o.a);
    System.out.println(o.b);

    this.a = 1000;
    this.b = 2000;
    o.a = 3000;
    o.b = 4000;
    System.out.println("values assigned in m2");
    System.out.println();
    System.out.println();
  }
}
class PassByValueDemo {

  public static void main(String... args) {
    PassByValue oa1 = new PassByValue(10, 20);
    PassByValue oa2 = new PassByValue(30, 40);

    System.out.println();
    System.out.println();
    System.out.println("oa1.a : " + oa1.a + ", oa1.b : " + oa1.b);
    System.out.println("oa2.a : " + oa2.a + ", oa2.b : " + oa2.b);

    /*
    Here the method m1 is static method so called by using the class name in which is presents in the class PassByValue, 
    we have passed the binary representation of how to reaach the objects oa1 and oa2 as parameter in m1 method here in the 
    main thread as parameter,the arguemnts o1 and o2 in the static method will refer to the content of objects oa1 and oa2 
    respectively and accordingly we can acess the values and alter them. 
    */

    PassByValue.m1(oa1, oa2);

    System.out.println("oa1.a : " + oa1.a + ", oa1.b : " + oa1.b);
    System.out.println("oa2.a : " + oa2.a + ", oa2.b : " + oa2.b);

    /* here the method m2 is instance method and is called by the object oa1 so this keyword will refer to oa1's content and 
    the argument variable in m2 method which is "o" in this case and it would refer to to the content of oa2 object so we can 
    access and alter the values for those objects with the diff references 
    */
    oa1.m2(oa2);
    System.out.println("oa1.a : " + oa1.a + ", oa1.b : " + oa1.b); //1000,2000
    System.out.println("oa2.a : " + oa2.a + ", oa2.b : " + oa2.b); //3000,4000

    /* Here the m1 method is static so called here with the className "PassByValue" and we have passed the two objects Oa2 and Oa1,
     which is the binary represenatation of how to reaach that object (NOT THE PASS BY Reference) so with the arguments variables 
     of m1 method which are  " o1" and "o2" here we can access and alter the values of objects oa1 and oa2 respectively 
     */
    PassByValue.m1(oa2, oa1);
    System.out.println("oa1.a : " + oa1.a + ", oa1.b : " + oa1.b); //300,400
    System.out.println("oa2.a : " + oa2.a + ", oa2.b : " + oa2.b); //100,200

    /*
      Here we have called method m2 with the object oa2 so this keyword will refer to the content of oa2 and we have passed the binary
      representation of how to reach the object oa1 to the method m2 and with the help of argument variable which is "o" in this case 
      is used to access and alter the values of oa1 which is passed in this method as an parameter here in main function  
    */
    oa2.m2(oa1);
    System.out.println("oa1.a : " + oa1.a + ", oa1.b : " + oa1.b); //3000,4000
    System.out.println("oa2.a : " + oa2.a + ", oa2.b : " + oa2.b); //1000,2000
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 18>javac PassByValueDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 18>java PassByValueDemo

Constructor invoked

Constructor invoked
oa1.a : 10, oa1.b : 20
oa2.a : 30, oa2.b : 40

static m1 executed

values assigned in m1

oa1.a : 100, oa1.b : 200
oa2.a : 300, oa2.b : 400

instance m2 executed
100
200
300
400
values assigned in m2

oa1.a : 1000, oa1.b : 2000
oa2.a : 3000, oa2.b : 4000

static m1 executed

values assigned in m1

oa1.a : 300, oa1.b : 400
oa2.a : 100, oa2.b : 200

instance m2 executed
100
200
300
400
values assigned in m2

oa1.a : 3000, oa1.b : 4000
oa2.a : 1000, oa2.b : 2000

C:\CDAC\Github\180-days-of-code\M2\DAY 18>
*/