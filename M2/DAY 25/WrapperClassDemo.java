public class WrapperClassDemo {

  public static void main(String[] args) {
    //Boxing:auto-boxing
    //converting primitive to wrapper class object

    Integer i = 10;
    System.out.println(i);

    /*logic
step1:int to Integer
step2:Integer to Integer
    */
    //Unboxing:auto-unboxing
    //converting the Wraper class object to primitive

    int i1 = i;
    System.out.println(i1);
    /*
1:Integer=> int
2.int=int
*/
    //above conversion was not possible before 1.5 version

    byte b = 10;
    // Integer i2 = b; //CE :incompatible type
    Byte b1 = b;
    /*
    byte =>Byte
    Integer = Byte
    */

    System.out.println(b1);

    short s = 10;
    // Integer i3 = s; //CE :incompatible type
    Short s1 =s;
    /*
    short => Short
    Integer = Short
    */
    System.out.println(s1);

    int x = 10;
    // Byte b1 = x; //CE :incompatible type
    Integer x1=x;
    /*
    int => Integer
    Byte = Integer // here wrapper class being final can not inherit any other class so the Integer to Byte conversion is not possible
    */
    System.out.println(x1);

  }
}
/*
[Running] cd "c:\CDAC\Github\180-days-of-code\M2\DAY 25\" && javac WrapperClassDemo.java && java WrapperClassDemo
10
10
10
10
10

*/