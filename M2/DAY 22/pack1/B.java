/*
CONCLUSION:
- Within the same package we can access 
public 
protetced
default 
var's/methods only 

we can not access private anywhere except within the class

*/
package pack1;

public class B {
    
    public static void main(String[] args) {
        A a = new A();
        a.a=20;
        System.out.println(a.a); 
        // Since b private , not visible
        // System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);

        a.m1();
//since pvt not visible here even in the same package private scope is limited to class only
//        a.m2();
        a.m3();
        a.m4();

    }


}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 22>javac pack1\B.java

C:\CDAC\Github\180-days-of-code\M2\DAY 22>java pack1.B
20
30
40
public m1 from A
default m3 from A
protetced m4 from A

C:\CDAC\Github\180-days-of-code\M2\DAY 22>
*/