/*
Java dont provide the support for the multilevel inheritence because of Diamond axis problem OR Ambiguity problem


If class does not have any parent in that case only it willhave Object class as parent class
*/

class Parent1{

    void m1(){
        System.out.println("P1");
    }

}
class Parent2{
    void m1(){
        System.out.println("P2");
        
    }
}
class Child extends Parent1,Parent{//",Parent" is the problem here
    void m1(){
        System.out.println("C");
        
    }


}
class MultipleInheritenceDemo{

public static void main(String[] args) {
    Parent1 P = new Child();
    P.m1();
}
    
}
