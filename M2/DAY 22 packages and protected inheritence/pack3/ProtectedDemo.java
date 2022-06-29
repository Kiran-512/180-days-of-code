package pack3;
import pack2.Child;

public class ProtectedDemo {
    public static void main(String[] args) {
        
        Child c1 = new Child();
        Child2 c2 = new Child2();

        //We can not direclty access protected variable and method of Parent class here as   this class(ProtectedDemo) is not inherited directly from parent
//        System.out.println(c1.b); -- ERROR asb is protected variable
//        c1.m2(); The method m2() from the type Parent is not visibleJava(67108965)

//        System.out.println(c2.b); //The field Parent.b is not visibleJava(33554503)
//        c2.m2(); The method m2() from the type Parent is not visibleJava(67108965)

        //indirect way to access protected in the class which in not the child of parent
        //yet we can access the method which is public in the child of parent and that method can contains the protetced var and methods
        
		c1.printParentInstaneVar();
    	
		c2.printParentfromChild2();
	}
    
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 22>javac pack3\ProtectedDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22>java pack3.ProtectedDemo
10
30
m2
10
30
m2

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/