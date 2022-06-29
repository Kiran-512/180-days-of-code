class Fizz{
    int p;
    int q;

}
class Test{
    int x;
    int y;
    Fizz fi;//this is instance ref var of Fizz class
}

class Immutable {
    final int a;
    final int b;
    static int c;
    static Test t;//this is static ref var of Test class

    // final static Test t2;//The blank final field t2 may not have been initializedJava(33554513

    final static Test t1 = new Test();
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

    final Immutable ob1 = new Immutable();//This is the immutable object but its not compulsory that it should be final, check first object ob
 // ob1 = null// not allowed

    System.out.println(Immutable.c);

    //final Immutable.t = new Test(); -- why this is not allowed?
    
    //here created the object with the static ref var
   Immutable.t = new Test();
   
    System.out.println(Immutable.t.x);
    System.out.println(Immutable.t.y);

    Immutable.t.x=100;
    Immutable.t.y=100;

    System.out.println(Immutable.t.x);
    System.out.println(Immutable.t.y);

    Test t=new Test();
    // Test fi = new Fizz();// this cocept is used in case of static ref var
    //final t.fi = new Fizz(); - why can not create the object with the instance ref var with final

    t.fi = new Fizz();

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
0
0
100
100


C:\CDAC\Github\180-days-of-code\M2\DAY 19>
*/