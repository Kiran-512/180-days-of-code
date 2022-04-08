interface I1 {
  void m2();
  void m3();
}

class Parent {

  void m1() {}
}
class Child extends Parent {

    @Override
    void m1() {
        System.out.println("CHILD M1");
    }
  }
class XYZ implements I1{
    public void m2(){

    }
    public void m3(){

    }

}

public class AnonymousInnerClassDemo {

    public static void main(String[] args) {
        
        Parent p = new Parent(){


        };// Syntax of Anonymous Inner class

      I1 i = new I1(){// THIS Anonymous child of interface has got the compulsion to implement both the methods of Interface I1

        @Override
        public void m2(){

            System.out.println("ANONYMOUS INNER CLASS M2");
            
        }
        @Override
        public void m3(){
            System.out.println("ANONYMOUS INNER CLASS M3");
        }
      };

    }
}
