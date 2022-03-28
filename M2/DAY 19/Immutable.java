class Immutable {
    final int a;
    final int b;
    static int c;
    {
    }
    Immutable(){
        a=100;
        b=100;
        c=300;        
    }
    static{
        c=200;        
    }
}
class ImmutableDemo {

public static void main(String[] args) {
    
    Immutable ob = new Immutable();//This is the immutable object
    System.out.println(ob.a);
    System.out.println(ob.b);
    
//  ob.a = 500;//We can not change the values of a and b which is content of immutable object ob
    System.out.println(ob);
    ob = null;
    System.out.println(ob);

    final Immutable ob1 = new Immutable();//This is the immutable object
 // ob1 = null// not allowed

    System.out.println(Immutable.c);
}    
    
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 19>javac Immutable.java

C:\CDAC\Github\180-days-of-code\M2\DAY 19>java ImmutableDemo
100
100
Immutable@36baf30c
null
300

C:\CDAC\Github\180-days-of-code\M2\DAY 19>
*/