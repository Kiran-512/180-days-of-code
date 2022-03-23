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
NOTES :

file name can be same as or different than class name but 
1.There should not be the space in between words
2.Ethically file name must be same as class Name
3.We always compile the file and run the class
javac file.java and java class_name

if we compile the file which has different name than class then it will compile but when we will run with the same file name it will give error as unable to load class file_name

Main Method :
    After we run the class JRE search for the main method i.e. public static void main(String[] args){
    }

Java is not pure OOL as it makes the use of primitive data type:
so when we writ int a =10 so dont create object here

==================================================================================================================
1 byte has 8 bit

| 0/1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
 
first bit from left is MSB which decides the sign if 0 the positive and if its 1 then negative

with this byte range is -128 to 127 // ( -2^7 ) to ( 2^7 -1 )
short : - 32768 to 32767 // ( -2^15 ) to ( 2^15 -1 )
int : -2147483648 to 2147483647 // ( -2^31 ) to ( 2^31 -1 )
long : ( -2^63 ) to ( 2^63 -1 ) 

in above range power of 2 is bits for the particular data type:

negative no representation in binary / complemenatry of each bit 
e.g.-10
| o | 0 | 0 | 0 | 1 | 0 | 1 | 0 |
| 1 | 1 | 1 | 1 | o | 1 | 0 | 1 |   // this is second stage to find complementary of bit representation of 10
                              1     // this is third stage is to add 1
----------------------------------- 
| 1 | 1 | 1 | 1 | o | 1 | 1 | 0 |  // this is -10
==================================================================================================================
Type casting:

Implicit
Explicit


Implicit:
- compilers is responsible
- When we assign smaller data type to larger then its implicit typecast
- No loss of information
- widening or upcasting

byte>short>int>long>float>double

chart>int

int x = 'a';
sout(x); // 97 Here Compilers is converting from char to int

double d =10;
sout(d); // 10.00 

Explicit:
- Programmer is responsible
- bigger data type value to smaller data type
- Narrowing or downcasting
- PLP

int x =130;
byte b = x; // CE : PLP Found int required:byte
byte b = (byte) = x; // -126

bit representation of above e.g.:

1000 0010 // this is 130
0111 1101 // this is complementary 
        1 // adding 1 to complementary HERE EXLUSIVE or IS Performed
=========
0111 1110 // this is -126

char is the only unsigned data type in JAVA:

byte b = 100;
int i =130;

b = i; // unable to convert the 32 bit to 8 bit repressentation
b = (byte)i; //forcefully converts i to byte and changes to -126
i = b; // converts 8 bit to 32 bit rrepresentation
float f = i;
double d =i;

bydefault floating point literals are double in java hence we hjave to use f or F as suffix for floating literals in case float data type:

float f =3.14f;
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