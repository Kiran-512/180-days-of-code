/*
Widening have high precedence than normal data types but var agrs have more precedence than noraml type

in case of both the method having ags data type of larger size than the parameter then first method will be called

{

    static m1(int a)
    static m1(long a)

    short s=10;
    m1(s)

}

Widening is always prefered over boxing

IMPORTANT :

#Overloading
- Method with the same type of datatype is always preferred widening
- if two widenings are there then first in the sequence will be prefered e.g. if arguments is of type byte and two methods with the long and int parameter then method with ht eint parameter will be prefered 
- widening is always prefered over boxing and var_args
- Boxing is always prefered over var_args
- varargs always gets the last prefeering in method overloading


*/

public class Wrap {
 /*   static void m1(){System.out.println("1");}

    static void m1(byte a){System.out.println("2");}
    */
    static void m1(int a){System.out.println("1");}

    static void m1(byte a){System.out.println("2");}

/*    static void m1(int a){System.out.println("1");}

    static void m1(byte... a){System.out.println("2");}*/

    public static void main(String[] args) {
        
        byte b =10;
        m1(b);

    }
}
