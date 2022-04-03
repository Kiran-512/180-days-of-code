public class WrapperClassDemo {

  public static void main(String[] args) {
    //Boxing:auto-boxing
    //converting primitive to swrapper class object

    Integer i = 10;
    System.out.println(i);

    /*logic
step1:int to Integer
step2:Integer to Integer
    */
    //Unboxing:auto-unboxing
    //converting the wraper class object to primitive

    int i1 = i;
    System.out.println(i1);
/*
1:Integer=> int
2.int=int
*/
    //above conversion was not possible before 1.5 version

    byte b =10;
    Integer i2 =b;//CE :incompatible type
    /*
    byte =>Byte
    Integer = Byte
    */

    short s = 10;
    Integer i3 =s;//CE :incompatible type
    /*
    short => Short
    Integer = Short
    */ 

    int x =10;
    Byte b1 = x;//CE :incompatible type
    /*
    int => Integer
    Byte = Integer // here wrapper class being final can not inherit any other class so the Integer to Byte conversion is not possible
    */



  }
}
