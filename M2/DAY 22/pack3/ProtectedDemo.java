package pack3;
import pack2.Child;

public class ProtectedDemo {
    public static void main(String[] args) {
        
        Child p = new Child();

        //We can not direclty access protected here as this class(ProtectedDemo) is not inherited directly from parent
//        System.out.println(p.b);

        //indirect way to access protected in the class which in not the child of parent
        //yet we can access the method which is public in the child of parent and that method can contains the protetced var and methods
        p.printParentInstaneVar();


    }
    
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 22>javac pack3\ProtectedDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22>java pack3.ProtectedDemo
10
30
m2

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/