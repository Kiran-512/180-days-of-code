class MathOperations {

  public static void main(String[] args) {}
}

public class Notes {

  public static void main(String[] args) {
    System.out.println("2");
  }
}
/*
Here File Name is MathOpDemo.java
class MathOperations {

  public static void main(String[] args) {
    System.out.println("1");
  }
}

class MathOpDemo {

  public static void main(String[] args) {
    System.out.println("2");
  }
}
*/
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 15>javac MathOpDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 15>java MathOpDemo
2

C:\CDAC\Github\180-days-of-code\M2\DAY 15>java MathOperations
1

C:\CDAC\Github\180-days-of-code\M2\DAY 15>
*/
/* 
Notes:

Source file declaration:
If main method is not defined then it will throw Run Time Error stating main method is not defined
File name can be diffent than the class names and the file can contains the any no class with any no of main method inside each class(one main inside one class)
If class is public then file name must be same as class name and yet main method must bein that class and it can also be inside another class with the public class /Source file declaration is important for javac and nothing to do with java
Only one class can be public

Identifers Name conventions:
class :

    follows  PascalCase naming convention // Name starts with the capital (Not Compulsion)  
    Name can not begin with the Number or any specialcharacter other than "$" and "_"
    a-z A-Z and & and _ are permistted to use to name identifier
    e.g. class HelloWorld{}, class MathOps{}, etc.

    rest identifiers:
    follows camelCase naming conventions e.g. int nameIsInt = 19;
    a-z A-Z and & and _ are permistted to use to name identifier

Assignment:
invoke add method inside class
with if else check if the a or b is bada and which ever is bada is it divisible by 2 and kitna bada than chota
Print the tables 


break and continue use in loops:

BREAK WILL TERMINATE THE LOOP ON MEETING THE CONDITION

continue will skip the current iteration adn will continue execution till the condition of loop gets false

Literals:

Integer literals:
binary:
  int x = 0b1010;
  sout(x); // o/p is 10
octal:
  int y = 010;
  sout(y); // o/p is 8
hexadecimal:
  int Z = 0X10;
  sout(Z); // o/p is 16

  char literals:
  unicode:
  char ch = '\u000C'; // valid
  char ch = 064770; // Invalid
  char ch = 'cdac'; // Invalid
  char ch = 0xcdac; // Invalid
  char ch = '\ucdac'; // valid int value is 52652

  float f = -343;//valid
  float f = 47e3;// invalid
  float f = 3.14;//invalid
  float f = 5.67f;//valid
  float f = 0x8765;//valid

static variables and static methods:

method:
static keyword comes before return type e.g. static void or static int
pulic static combination can be anythging e.g. public static or static public


When we compile the program and run particular class then in JVM first instance of this code will ve created and then static variables will be loaded in the memory and assigned the values if any after which the main method will be loaded and then main thread generated hence we can directlky access static variables and methods without any reference variable.



*/
