NOTES :
=====================
History of JAVA?
- James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991. The small team of sun engineers called Green Team.
- Initially it was designed for small, embedded systems in electronic appliances like set-top boxes.
- Firstly, it was called "Greentalk" by James Gosling, and the file extension was .gt.
- After that, it was called Oak and was developed as a part of the Green project.

Why Java was named as "Oak"?
- Oak is a symbol of strength and chosen as a national tree of many countries like the U.S.A., France, Germany, Romania, etc.
- In 1995, Oak was renamed as "Java" because it was already a trademark by Oak Technologies.
- Java is an island in Indonesia where the first coffee was produced (called Java coffee). It is a kind of espresso bean. Java name was chosen by James Gosling while having a cup of coffee nearby his office.
- Java is just a name, not an acronym.

===================
Source fiel declarations:

file name can be same as or different than class name but 
1. There should not be the space in between words
2. Ethically file name must be same as class Name
3. We always compile the file and run the class
javac file.java and java class_name
4. There can only be one public class inside the file and in that ase file name must match the public class name


if we compile the file which has different name than class then it will compile but when we will run with the same file name it will give error as unable to load class file_name

Main Method :
    After we run the class JRE search for the main method i.e. public static void main(String[] args){
    }

Java is not pure OOL as it makes the use of primitive data type:
so when we writ int a =10 so don't create object here

===========================================
1 byte has 8 bit

| 0/1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
 
first bit from left is MSB which decides the sign if 0 the positive and if its 1 then negative

with this byte range is -128 to 127 // ( -2^7 ) to ( 2^7 -1 )
short : - 32768 to 32767 // ( -2^15 ) to ( 2^15 -1 )
int : -2147483648 to 2147483647 // ( -2^31 ) to ( 2^31 -1 )
long : ( -2^63 ) to ( 2^63 -1 ) 

char : 0 to 65535

float: ±3.40282347E+38F i.e. 6-7 significant digits
double: ±1.79769313486231570E+308 i.e. 15-16 significant digits

in above range power of 2 is bits for the particular data type:

negative no representation in binary / 2's complemenatry 
e.g.-10
| o | 0 | 0 | 0 | 1 | 0 | 1 | 0 |

| 1 | 1 | 1 | 1 | o | 1 |    0      | 1 |   // this is second stage to find complementary of bit representation of 10
                          1(carry)    1     // this is third stage is to add 1
---------------------------------------- 
| 1 | 1 | 1 | 1 | o | 1 |       1   | 0  |  // this is -10 with 2's complementary // her ops is XOR in whcih 1 and 1 is o with 1 carry
================================================
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
============================
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
=============================