/*
At line no 29,  a.m1(); in the background object of classs NPE will be created with the "throw new NullPointerException"
And if it is trhown then it must be catched by catch block and the ref variable in the catch arguments could be of the same class or of any of the parent class i.e. of RuntimeException or Throwable or Object

      catch(NullPointerException n){}
      catch(RuntimeException n){}
      catch(Throwable n){}
      catch(Object n){}
      






*/
class ANME {

  void m1() {}
}

class NullPointerExceptionDemo{

  public static void main(String[] args) {
    ANME a = new ANME();
    a = null;

    //    a.m1();

    try{
        a.m1();
      } 
      catch(NullPointerException n){
        System.out.println(n.getMessage());
        n.printStackTrace();
        System.out.println("ABBE NULL KA Method ASSIGN MAT KR RE ");
      }
      System.out.println("After");
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 26>javac NullPointerException.java

C:\CDAC\Github\180-days-of-code\M2\DAY 26>java NullPointerExceptionDemo
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ANME.m1()" because "<local1>" is null
        at NullPointerExceptionDemo.main(NullPointerException.java:12)

C:\CDAC\Github\180-days-of-code\M2\DAY 26>

*/
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 26>javac NullPointerExceptionDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 26>java NullPointerExceptionDemo
Cannot invoke "ANME.m1()" because "<local1>" is null
java.lang.NullPointerException: Cannot invoke "ANME.m1()" because "<local1>" is null
        at NullPointerExceptionDemo.main(NullPointerExceptionDemo.java:15)
ABBE NULL KA Method ASSIGN MAT KR RE
After

C:\CDAC\Github\180-days-of-code\M2\DAY 26>

*/
