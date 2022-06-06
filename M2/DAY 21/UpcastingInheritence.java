/*
- In upcasted inheritence : 
- Instance variable always resolved on reference variable type // will go upside // 
	Compiler will print the varaible if present in the REFERENCE TYPE if not then
	compiler will go upside to check the var in grandparent, If its there then compiler will prin that variable or else if its not there then its CError
- Instance methods always resolved on Object type // compiler will go upside till grandparent to check 
	if the method prent in the parent classes at Compile time, If found then Okay if not found then Comp Error 
and 
	from there at run time it will check if same method is there in the child or not, 
	if yes that will be executed and if NOT then parent class method will get executed

In below e.g. 
    parent p1 = new child();

Compiler will check the variable in grandPar if not there in the parent class and will check the methods in child class if not there in the parent class

In this case the type of p1 is parent so Compiler will check the method m1 in parent if its not there it will 
check in grandpar  if it's not there it will throw error and if its there then OK and on run time it will check 
if it there in the child of parent and if compilers found m1 there then it will print the method and if not found then parent class mthod will be printed 

NOTE : IT IS MANDATORY TO HAVE THE VARIABLES AND METHODS IN PARENT OR GRANDPARENTS ACCESSED BY 
	THE REFERENCE VARIABLES of parent type IN MAIN THREAD with the object of child class

In nutshell,those method which are there in the parent irrespective they are present or not in the 
	child will get executed and YES if its there in the child then child wala method will be executed
*/
class GarndPar {
    int a =100;
    int x =100;

  void m1() {
    System.out.println("GrandPar m1 method");
  }

  void m2() {
    System.out.println("GrandPar m2 method");
  }

  void m4() {
    System.out.println("GrandPar m4 method");
  }

  void m5() {
    System.out.println("GrandPar m5 method");
  }  

  void m6() {
    System.out.println("GrandPar m6 method");
  }  
  void m8() {
    System.out.println("GrandPar m8 method");
  }      
  
}

class parent extends GarndPar {

  int a = 10;
  int b = 10;

  void m1() {
    System.out.println("Parent m1 method");
  }
  
  void m5() {
    System.out.println("Parent m5 method");
  }    
}

class child extends parent {

  int a =10;
  int x =50;
  int y =50;

  void m1(){
      System.out.println("Child m1 method");
  }

  void m2() {
    System.out.println("child m2 method");
  }
 
 void m3() {
    System.out.println("child m3 method");
  }

  void m7() {
    System.out.println("Child m7 method");
  }    

  void m8() {
    System.out.println("Child m8 method");
  }    
  
}
class UpcastingInheritence{
	
	public static void main(String[] args) {
    parent p1 = new child();
//  p1 = new parent();//possible
//  p1 = new GarndPar();//Impossible

    p1.m1();//Child m1 method
    p1.m2();//child m2 method
	//p1.m3();// ERROR : UpcastingInheritence.java:74: error: cannot find symbol
	p1.m4();
	p1.m5();// M5 is not in the child but its there in parent and garandpar too! at run time parents m5 will get executed
    
	System.out.println(p1.a);//10
    System.out.println(p1.x);//100
//  System.out.println(p1.y);//error: cannot find symbol
  
  //Important thing
	parent p = new parent();
	p.m6();  
	//p.m7();  // Error as object is of Parent type and m7 is not there in Parent class and not there even in GrandPar class WHICH IS PARENT CLASS of types of P
	p.m8();  //NOTE: M8 is also present in the Child class
  }
}

/*

O/P =>
C:\CDAC\Github\180-days-of-code\M2\DAY 21>javac UpcastingInheritence.java

C:\CDAC\Github\180-days-of-code\M2\DAY 21>java UpcastingInheritence
Child m1 method
child m2 method
GrandPar m4 method
Parent m5 method
10
100
GrandPar m6 method
GrandPar m8 method
*/