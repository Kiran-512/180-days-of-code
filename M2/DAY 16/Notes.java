class Notes {

  static int a;
}

class NotesDemo {

  static int a = 10;
  public static void main(String[] args) {
    System.out.println(Notes.a); // 0
    System.out.println(a);// 10

  }
}
/*

Static variable and methopd are also called as class variable and class method too!

Static block:
Will get executed before main method:

Static variables declared above static block will be initialised IN STATIC BLOCK IF ITS BELOW STATIC BLOCK 
Then it wont be initialised in static block which is above that variable
e.g.
    static{
        System.out.println(c);
    }
    static byte c;
Here it error that unable to find symbol 

STATIC BLOCK WILL GET LOADED IN MEMORY ONLY ONCE after which when we call variables from it, it will acess 
it from memory as already its loaded in the memory

Order of execution:
1.Class is loaded in the memory
2.instance of the class will be created
3.Staic var and static methods will be loaded in memory and initialised with the assigned values if no values assigned then JVM will assign the default values
4.static block will be executed irrepective of its position (above or below main method) and loded in memory ONLY ONCE
5.main method execution will start 

stack and heap memory:

local variables and methods(including main method) stored in the stack memory
after completion of execution of methods it will be removed from the stack

stack overflow: :
if any method say m1 calling m2 and if m2 mthod is calling m1 back forth then stack will overflow

Instance var and methods and objects :
When object is created part which is on left side of = is called as reference var and which is on right side is object
reference var will get memory in stack and objects will get memory in heap and we can access instance variable or methods only with the reference variables,which
are in the stack and pointing to the objects which are in the heap


*/
