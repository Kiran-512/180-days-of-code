/*
This program has nothing to do with the stack part of memory it just deals with the static 
box and heap as only static variables and objects ae involed, no local variables used   

Gist of the stat ref var:
Basically sta ref var used to create the object, and as we can use static var anywhere in the class so we get the advantage of accessing the
instamce var content by creating objects with the static ref variables of particular class 

SYNTAX is :
class_Name.SRV.Instance_Var 
e.g.
StaticRefVariable.avar.x = 1000;

Here we are chanding the values of x which is the instance var of class A, 
with the static variable "avar" which is of type(class) A, and its declared in 
the another class so that class name is used before avar. 

with this way we can access and modify the values of instance variables

*/

class B{

    int p;
    int q;

}
class A{

    int x;
    int y;

}

class StaticRefVariable {
    static int i;
    static StaticRefVariable svar;
    static A avar;
        
    int a;
    int b;
    {
        a =500;
        b =500;
    }
	static void m(){
				System.out.println("Static m called");
				svar.a=1000000;
				svar.b=2000000;
		}	
	
    void m1(){
        svar.a=500;
        svar.b=500;
        avar.x=500;
        avar.y=500;
    }
    static void m2(){
        svar.a=1000;
        svar.b=1000;
        avar.x =1000;
        avar.y =1000;
    }
    static void m3(StaticRefVariable o){
        o.a=800;
        o.b=800;
    }
}   
class StaticRefVariableDemo {

    static void m4(){
        StaticRefVariable.svar.a=2000;
        StaticRefVariable.svar.b=2000;
        StaticRefVariable.avar.x =2000;
        StaticRefVariable.avar.y =2000;
    }

    public static void main(String[] args) {
        StaticRefVariable s = new StaticRefVariable();

        StaticRefVariable.i=100;

        StaticRefVariable.svar = new StaticRefVariable();
	
        StaticRefVariable.svar.a = 1000;
        StaticRefVariable.svar.b = 1000;

        /*Here we have also created the object of class A as the avar is the static var of  */
        StaticRefVariable.avar = new A();
        StaticRefVariable.avar.x = 1000;
        StaticRefVariable.avar.y = 1000;
        
        /*
        What is the reason for creating objects with the static ref variables when we can create the objects with the local variables?
        ANS :
        The main advantage is to access the x and y in  the static method directly with the static ref variable without passing object 
        as an arguments see method m2 where in we have directly used static ref var and in m3 we have passed the ref var as an arguments 
        */
		
		StaticRefVariable s1 = new StaticRefVariable();
		
		System.out.println("The value of a thru s1 is " +s1.a);
		System.out.println("The value of b thru s1 is " + s1.b);
		
		
		//Upto here we can not access a and b of s1 in static method 'm' but when we assign s1 to svar then we can acess a and b of s1 in 'm' static method 
		
		//Assigned the binary path of s1 to svar
		StaticRefVariable.svar = s1;
		
		StaticRefVariable.m();	
		
		System.out.println("The value of a thru s1 is after changing thru svar in m static method" +s1.a);
		System.out.println("The value of b thru s1 is after changing thru svar in m static method" + s1.b);
		
		// Or else we can change and access the values direclty aslso with savar here
		StaticRefVariable.svar.a=10;
		StaticRefVariable.svar.b=10;
		
		System.out.println(StaticRefVariable.svar.a);
		System.out.println(StaticRefVariable.svar.b);		
		
		System.out.println("The value of a thru s1 is after changing thru svar" +s1.a);
		System.out.println("The value of b thru s1 is after changing thru svar" + s1.b);

    }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 18>java StaticRefVariableDemo
The value of a thru s1 is 500
The value of b thru s1 is 500
Static m called
The value of a thru s1 is after changing thru svar in m static method 1000000
The value of b thru s1 is after changing thru svar in m static method 2000000
10
10
The value of a thru s1 is after changing thru svar10
The value of b thru s1 is after changing thru svar10

*/












