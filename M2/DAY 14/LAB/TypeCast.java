package LAB;

public class TypeCast {
    
    public static void main(String[] args) {
        byte b1 =10;
        byte b2 =10;
        short s1 =20;
        short s2 =20;
        int i1 =10;
        int i2 =10;
        long l1 =10l;// here i isnt mandatory but if int literal excedds 2147483847 then we have add l
        long l2 =10;
        long l3 = 2147483648l;
        float f1 =10;
        float f2 =3.12f;// here f is mandatory
        float f3 =10e4f;// here f is mandatory
        double d1 = 10;
        double d2 =100.23;
        double d3 = 1.7e308;

        byte b3 = 10+10;// we can store this res in byte if its within the range, if it's not then explicitely we must mention 
        //b3 = b1+b2;// value of expression is always integer
        b3 = (byte)(b1+b2);// with the typecasting its converted into the byte

        char ch = 'a';
        char ch1 = '\u0000';
        char ch2 = 'abcd';// not allowed
        char ch3 ="a";









    }

}
