class MethodLocalIC {

  void m1() {
    int x = 10; // this is final in nature we can not use any other modifier other than
    System.out.println(x);

    class MLIC {

      int y = 20;

      void m1() {
        System.out.println("m1 from MLIC");
        System.out.println(x); // x from m1 of MethodLocalIC can be accessed here but we can not modify the same As it is final in nature
        int x = 100;
      }

      static void m2() {// this m2 we can access outsiode of m1 with the upcasting
        System.out.println("static m2 from MLIC");
      }
    }
    MLIC m = new MLIC();
    m.m1();
    System.out.println(m.y);
  }
}

public class MethodLocalInnerClass {

  public static void main(String[] args) {
    MethodLocalIC mic = new MethodLocalIC();
    mic.m1();
    // MethodLocalIC.MLIC.m2();
  }
}
