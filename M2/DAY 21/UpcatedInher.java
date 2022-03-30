/*
- In upcasted inheritence : 
- Instance variable always resolved on reference variable type // will go upside // compiler will go upside to check the var if not there in the parent
- Instance methods always resolved on object type // compiler will go upside till grandparent and from there on run time it will check if same method is there in the child or not, if yes that will be executed

In below e.g. 
    parent p1 = new child();

Compiler will check the variable in grandPar if not there in the parent class and will check the methods in child class if not there in the parent class

In this case the type of p1 is parent so Compiler will check the method m1 in parent if its not there it will 
check in grandpar  if it's not there it will throw error and if its there then OK and on run time it will check 
if it there in the child of parent and if compilers found m1 there then it will print run method 

NOTE : IT IS MANDATORY TO HAVE THE VARIABLES AND METHODS IN PARENT OR GRANDPARENTS ACCESSED BY THE REFERENCE VARIABLES of parent type IN MAIN THREAD with the object of child class

*/
class GarndPar {
    int a =100;
    int x =100;

  void m2() {
    System.out.println("grandp m2 method");
  }
}

class parent extends GarndPar {

  int a = 10;
  int b = 10;

  void m1() {
    System.out.println("Parent method");
  }
}

class child extends parent {

  int a = 10;
  int x =50;
  int y =50;

  void m1(){
      System.out.println("Child overrided method");
  }

  void m2() {
    System.out.println("child m2 method");
  }

  public static void main(String[] args) {
    parent p1 = new child();
//  p1 = new parent();//possible

    p1.m1();//Child overrided method method
    p1.m2();//child m2 method

    System.out.println(p1.a);//10
    System.out.println(p1.x);//100
//  System.out.println(p1.y);//error: cannot find symbol
  }
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY A>javac UpcatedInher.java

C:\CDAC\Github\180-days-of-code\M2\DAY A>java child
Child overrided method
child m2 method
100

C:\CDAC\Github\180-days-of-code\M2\DAY A>

*/