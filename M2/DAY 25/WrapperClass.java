/*
- SCJP page no 234
- Wrapper classes are final in nature, which can not be inherited 
- Wrapper class literals are immutable
- Collection uses the wrapper classes not the primitive data tyeps
- NuberFormatException : While creating the object of the wrapper class we can pass the values in string fromat but we can not pass 
the string. In that case if we pass the string like "ABC" instead of nunbers then NumberFormatException will occur
Also if the value we pass an an paramter for partiular method ins tring if its beyond the range of primitives then it will
thropw an Run time exception i.e. NumberFormatException
=======================
  When we pass paramter to the the method or object which accepts arguments of byte then the parameter must be byte ONLY.

e.g.

static void m1(byte b){}

m1(10){}//CE: Can not convert to byte
byte c = 10;
m1(c){}
=========================
Wrapper class has two contructors and accept one values each first is primitive data type and string 
*/

public class WrapperClass {

  public static void main(String[] args) {
    Integer i2 = new Integer(10);
    Integer i = new Integer("10");
    // Integer istr = new Integer("SBC");//throw RTException: NFE

    System.out.println(i2); //10
    System.out.println(i); //10
    // System.out.println(istr);

    Byte bvar = 10;
    Byte b = new Byte((byte) 10);
    Byte b1 = new Byte(bvar);
    Byte b2 = new Byte((byte) 130); //RTException :  radix 10 NumberFormatExcption at run time

    System.out.println(b); //10
    System.out.println(b1); //10
    System.out.println(b2); //-126

    Long l = new Long(10); // here 10 is int and there is still not error as int is compatile with the long

    short svar = 10;
    Short s = new Short((short) 10);
    Short s1 = new Short(svar);

    System.out.println(s); //10
    System.out.println(s1); //10

    //valueOf(); accepts only string arguments , this method returns the Wrapper types values
    // this method is accepted to initialise values for wrapper classes types over the constructor method which is deprecated
    // public static java.lang.Integer valueOf(java.lang.String, int) throws java.lang.NumberFormatException;
    // public static java.lang.Integer valueOf(java.lang.String) throws java.lang.NumberFormatException;
    // public static java.lang.Integer valueOf(int);
    // Integer iv1 = Integer.valueOf("12345678901"); //NFE at run time
    // Integer iv2 = Integer.valueOf(12345678901);//The literal 12345678901 of type int is out of range Java(536871066) hence if we can pas this in string format then it will accept it but will throw an NumberFormat Exception at runtime
    Integer iv3 = Integer.valueOf("1010", 2); // this is in binary format
    Integer iv4 = Integer.valueOf(18901); // if we are passing value without string then it must be within the range
    Integer iv5 = Integer.valueOf("0111111111111111111", 2);
    System.out.println("iv5 value is "+ iv5);

    Integer i1 = Integer.valueOf(10);

    // Short sh1 = Short.valueOf(100);// this is CE as we are passing int value in a method which is expecting short value
    // same for this too either we can pass the value with the typecast of by declaring it with the string or proper short value by declaring in variable

    Short sv1 = Short.valueOf("01111111111", 2);
    System.out.println("Sv1 value is " + sv1);

    // public static java.lang.Byte valueOf(byte);
    Byte bt = Byte.valueOf("120"); //here as an args we can pass either string or byte value and not an int value
    Byte bt1 = Byte.valueOf((byte) 130); //since this value is out of range of byte hence we have typecase it to byte

    System.out.println(i1); //10
    // System.out.println(sh1); //100
    System.out.println(bt); //120
    System.out.println(bt1); //-126

    //here in "" we have metnioned number in binary and 2(Radix) shows that its a binary number
    Integer bints = Integer.valueOf("1010", 2); //10
    Integer oints = Integer.valueOf("10", 8); //8
    Integer hxints = Integer.valueOf("10", 16); //16

    System.out.println(bints);
    System.out.println(oints);
    System.out.println(hxints);

    //to convert the wrapper class object values into primitive even if its bveyond the range
    // parseInt();
    int it = Integer.parseInt("10");
    // int it1 = Integer.parseInt("a");its NPE

    System.out.println(it);
    // System.out.println(it1);

    short st = Short.parseShort("32767");
    // short st1 = Short.parseShort("a");//its NFE

    System.out.println(st); //32767
    // System.out.println(st1);

    //below methods used for converting from Wrapper class to the all primitves as per the method used
    //from integer class to the primitives
    byte btt = i1.byteValue();
    short stt = i1.shortValue();

    System.out.println(btt); //10
    System.out.println(stt); //10

    System.out.println(i1.hashCode()); //10
    // System.out.println(stt.hashCode());// there is no any hashcode for primitives

  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 25>java WrapperClass
10
10
10
10
-126
10
10
10
100
120
-126
10
8
16
10
32767
10
10

C:\CDAC\Github\180-days-of-code\M2\DAY 25>
*/
