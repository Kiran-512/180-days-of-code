class Basics{
    public static void main(String[] args) {
        System.out.println("system set-up,basics of java code,data types and typecasting");
    }
} 

/*class HelloWorld{

    static byte x =100;
    public static void main(String[] args){
   
        byte b = (byte)130; 
        System.out.println(b); // o/p is -126 with the typecast
         byte b = 130; //CE error : Incompatible type 
        System.out.println((int)(char)(byte)-2); // 65534
        System.out.println((int)(char)(byte)130); // 65410 
        System.out.println((char)(int)(byte)-2); /* ? as this pc ka terminalsupports only 256 ASCII characters   

   }   
   }*/
/*==================================================================================================================*/
//CDOE 
/*class HelloWorld{

 public static void main(String[] args){

    System.out.println("Hellow World!");
    System.out.print("print(not println) will display the o/p on the same line"); 
    System.out.println(" Hellow World!");
}   
}
*/
/*
O/P:

C:\CDAC\Github\180-days-of-code\M2\DAY 14>javac HW.java

C:\CDAC\Github\180-days-of-code\M2\DAY 14>java HelloWorld
Hellow World!
print(not println) will display the o/p on the same line Hellow World!

NOTE :  File name and class name is different!

*/
/*==================================================================================================================*/
// here file name is HW./java
//CODE :
/*

class HelloWorld{

    
}
class A{

}
class b{
    
}
*/
/*
O/P:
C:\CDAC\Github\180-days-of-code\M2\DAY 14>javac HW.java

C:\CDAC\Github\180-days-of-code\M2\DAY 14>java A
Error: Main method not found in class A, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\CDAC\Github\180-days-of-code\M2\DAY 14>

*/

/*
==================================================================================================================
at f =3.14f;
float pi =3.14F;

float f = 3.14 // PLP will convert to double

int x = 10L; // CE : Incompatible type
int x = (int)10l; // O/P will be 10
int x = (int)2147483648l; // O/P will be -2147483648

float b;
short c =13;
b=c;
System.out.println(b); // o/p will be 13 

float b = (float)12.34;
System.out.println(b); // op is 12.34

*/