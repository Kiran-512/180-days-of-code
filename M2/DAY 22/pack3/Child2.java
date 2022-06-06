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
		
    }
}
