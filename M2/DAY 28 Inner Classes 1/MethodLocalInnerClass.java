class MethodLocalIC {
	
		static Object o;

  void m1() {
    int x = 10; // this is final in nature we can not use any other modifier other than final
    System.out.println(x);

    class MLIC {
 
      int y = 20;

      void m1() {
        System.out.println("m1 from MLIC");
        System.out.println(x); // x from m1 of MethodLocalIC can be accessed here but we can not modify the same As it is final in nature
         //x = 100;
      }

      static void m2() {// this m2 we can access outsiode of m1 with the upcasting
        System.out.println("static m2 from MLIC");
      }
    }
    MLIC m = new MLIC();
    m.m1();
    System.out.println(m.y);
	o = mlic;//With this its possible that after this methods get killed after calling o will be still pointing at the object of mlic and we could ahve changed the value of x outside the method hence local variable of method having MLIC are final in natuyre we can not change them in MLIC 
  }
}

public class MethodLocalInnerClass {

  public static void main(String[] args) {
    MethodLocalIC mic = new MethodLocalIC();
    mic.m1();
    // MethodLocalIC.MLIC.m2();
  }
}
