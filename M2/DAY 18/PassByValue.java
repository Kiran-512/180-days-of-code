/*
passbyvalue and passbyreference example!!
To acces the instance ariables in static methods we can passby reference and can alter the values for the instance variables and play arount it

When we access the instance method with the object and pass another object as an arguments to that method then we can play around with the values of both the objects

We can not call instance method without the object

*/

class PassByValue {
    int a;
    int b;

    PassByValue(int a, int b){
        this.a =a;
        this.b =b;
    }
    
     void add(int c, int d){
        System.out.println("Empty add method");
        this.a=c;
        this.b=d;
    }
    static void m1(PassByValue o){
        o.a=500;
        o.b=500;
    }
}
class PassByValueDemo1 {
    public static void main(String[] args) {
        
        PassByValue ob = new PassByValue(10,20);

        System.out.println("Initial value of ob.a is " + ob.a);
        System.out.println("Initial value of ob.b is " +ob.b);

        PassByValue.m1(ob);

        System.out.println("After calling static m1 value of ob.a is " + ob.a);
        System.out.println("After calling static m1 value of ob.b is " + ob.b);

        System.out.println("Initial value of ob.a is " + ob.a);
        System.out.println("Initial value of ob.b is " +ob.b);

        int x =10; int y =20;
        ob.add(x,y);

        System.out.println("After calling instance method thru object, value of ob.a is " + ob.a);
        System.out.println("After calling instance method thru object, value of ob.b is " + ob.b);

    }
}

/*

C:\CDAC\Github\180-days-of-code\M2\DAY 18>javac PassByValue.java

C:\CDAC\Github\180-days-of-code\M2\DAY 18>java PassByValueDemo
Initial value of ob.a is 10
Initial value of ob.b is 20
500
500
After calling static m1 value of ob.a is 500
After calling static m1 value of ob.b is 500
Initial value of ob.a is 500
Initial value of ob.b is 500
Empty add method
After calling instance method thru object, value of ob.a is 10
After calling instance method thru object, value of ob.b is 20

C:\CDAC\Github\180-days-of-code\M2\DAY 18>
*/