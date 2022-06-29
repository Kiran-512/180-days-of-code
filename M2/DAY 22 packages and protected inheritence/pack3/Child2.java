package pack3;

import pack1.Parent;
import pack2.Child;


public class Child2 extends Child{
    
	public void printParentfromChild2(){
		System.out.println(a);
		System.out.println(b);
		m2();
	}
	
    public static void main(String[] args) {
        Child2 c2 = new Child2();
		System.out.println(c2.b);

		c2.m2();
		
    }
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 22 packages and protected inheritence>javac pack3/Child2.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22 packages and protected inheritence>java pack3.Child2
30
m2

C:\CDAC\Github\180-days-of-code\M2\DAY 22 packages and protected inheritence>

*/