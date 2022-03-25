class StaticBlock {

  static byte b;

  static {
    System.out.println("Value of b before static block " + b);
    b = 100;
    System.out.println("Value of b after assiinig in static block is " + b);
    //System.out.println(c); it error here as c must be specified above static block to acces in it
  }

  static byte c;

  static {
    System.out.println(c);
  }
}

class StaticBlockDemo {

  static int i;

  static {
    System.out.println("SB:1");
    System.out.println(i);
  }

  public static void main(String[] args) {
    System.out.println("Main Method");
    System.out.println(StaticBlock.b);
    System.out.println(StaticBlock.c);
    System.out.println(c);

    StaticBlock.c = 20;
    System.out.println(
      "The value of c in StaticBlock class after changin is " + StaticBlock.c
    );

    Demo1.m1(); // called m1 from Demo1 class in main method we can achive this
  }

  static {
    System.out.println("SB:2");
  }

  /*

    static{
        System.out.println(c);
    }
 */

  static byte c = 10;
}

class Demo1 {

  static void m1() {
    System.out.println(StaticBlock.c);
  }
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 16>javac StaticBlock.java

C:\CDAC\Github\180-days-of-code\M2\DAY 16>java StaticBlockDemo
SB:1
0
SB:2
Main Method
Value of b before static block 0
Value of b after assiinig in static block is 100
0
100
0
10
The value of c in StaticBlock class after changin is 20
20

C:\CDAC\Github\180-days-of-code\M2\DAY 16>
*/
