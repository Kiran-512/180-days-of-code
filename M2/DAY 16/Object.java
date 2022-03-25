class Object{
int a;
int b;

void m1(){
    System.out.println("Instance:M1");
    System.out.println("The sum is "+ (a+b));
}

}
class ObjectDemo{

    public static void main(String[] args) {
    Object d1 = new Object();
    Object d2 = new Object();
        
    System.out.println("default value "+ d1.a);
    System.out.println("default value "+ d1.b);

        d1.a=10;
        d1.b=10;

    System.out.println(d1.a);
    System.out.println(d1.b);

    d1.m1();

    System.out.println("default value " + d2.a);
    System.out.println("default value "+ d2.b);

    d1.a=100;
    d1.b=200;

    System.out.println(d2.a);
    System.out.println(d2.b);

    d2.m1();


    }

}

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 16>javac Object.java

C:\CDAC\Github\180-days-of-code\M2\DAY 16>java ObjectDemo
default value 0
default value 0
10
10
Instance:M1
The sum is 20
default value 0
default value 0
0
0
Instance:M1
The sum is 0

*/