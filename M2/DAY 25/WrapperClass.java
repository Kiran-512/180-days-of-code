/*
- SCJP page no 234
- Wrapper classes are final in nature, which can not be inherited 
- Wrapper class literals are immutable
- Collection uses the wrapper classes not the primitive data tyeps
- NuberFormatException

When we pas paramter to the the method or object which accepts arguments of byte then the parameter must be byte ONLY.

e.g.

static void m1(byte b){}

m1(10){}//CE: Can not convert to byte
byte c =10;
m1(c){}
================================
Wrapper class has two contructors and accept one values each first is primitive data type and string 
*/

public class WrapperClass {

  public static void main(String[] args) {
    Integer i2 = new Integer("10");
    Integer i = new Integer("10");
    // Integer istr = new Integer("SBC");//throw RTException:

    System.out.println(i2);
    System.out.println(i);
    // System.out.println(istr);

    Byte bvar = 10;
    Byte b = new Byte((byte) 10);
    Byte b1 = new Byte(bvar);
    Byte b2 = new Byte((byte) 130); //RTException :  radix 10 NumberFormatExcption at run time

    System.out.println(b);
    System.out.println(b1);
    System.out.println(b2);

    Long l = new Long(10); // here 10 is int and there is still not error as int is compatile with the long

    short svar = 10;
    Short s = new Short((short) 10);
    Short s1 = new Short(svar);

    System.out.println(s);
    System.out.println(s1);

    //valueOf(); accepts only string arguments

    Integer i1 = Integer.valueOf("10");
    Short sh1 = Short.valueOf("100");
    Byte bt = Byte.valueOf("120");

    Integer bints = Integer.valueOf("1010", 2); //here in "" we have metnioned number in binary and 2 shows that its a binary number
    Integer oints = Integer.valueOf("10", 8);
    Integer hxints = Integer.valueOf("10", 16);

    System.out.println(bints);
    System.out.println(oints);
    System.out.println(hxints);

    //to convert the wrapper class object values into primitive
    // parseInt();
    int it = Integer.parseInt("10");
    int it1 = Integer.parseInt("a");

    System.out.println(it);
    System.out.println(it1);

    short st = Short.parseShort("32767");
    short st1 = Short.parseShort("a");

    System.out.println(st);
    System.out.println(st1);

    //from integer class to toher primitives
    byte btt = i1.byteValue();
    short stt = i1.shortValue();

    System.out.println(btt);
    System.out.println(stt);
  }
}
