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

        StaticRefVariable.svar=new StaticRefVariable();
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


    }
}
