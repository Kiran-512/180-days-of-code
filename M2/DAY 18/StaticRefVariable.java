/*
This program has nothing to do with the stack part of memory it just deals with the static 
box and heap as only static variables and objects ae involed, no local variables used   
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

    }
}
class StaticRefVariableDemo {

    public static void main(String[] args) {
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
        To access the x and y from the 
        */
        A a = new A();

        /*
        
        */


    }
}
