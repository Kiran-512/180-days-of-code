class StaticVar {

    static byte b;
    static short s;
    static int i;
    static long l;
    static char ch;
    static int c = ch;
    static float f;
    static double d;
    static boolean bl;
    static String nm;

  }
  
  class StaticVarDemo {
  
    static int a = 10;
    public static void main(String[] args) {
      System.out.println(StaticVar.ch);// default value is empty space
      System.out.println(StaticVar.c);//typecasted to int value is 0
      System.out.println(StaticVar.b);
      System.out.println(StaticVar.s);
      System.out.println(StaticVar.i);
      System.out.println(StaticVar.l);
      System.out.println(StaticVar.f);
      System.out.println(StaticVar.d);
      System.out.println(StaticVar.bl);
      System.out.println(StaticVar.nm);
    }
  }

  /*
C:\CDAC\Github\180-days-of-code\M2\DAY 16>javac StaticVar.java

C:\CDAC\Github\180-days-of-code\M2\DAY 16>java StaticVarDemo

0
0
0
0
0
0.0
0.0
false
null

C:\CDAC\Github\180-days-of-code\M2\DAY 16>
  */