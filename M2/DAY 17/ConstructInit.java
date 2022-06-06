class Construct{

}
class MathOp{
    int num1;
    int num2;
    static int result;

    {
    System.out.println("Init called");
    System.out.println(num1);
    System.out.println(num1);

    num1 =100;
    num2 =100;
    
    result = 0; // Note the difference static var inside init
    }

    MathOp(int a, int b){
        this.num1 =a;
        this.num2 =b;

        result = 10; // Note the difference static var inside costructor
    }

    void add(){
        result = num1 + num2;
        System.out.println("Addition is  " + result);
    }
    void sub(){
        result = num1 - num2;
        System.out.println("Substraction is  " + result);
    }

}
class ConstructDemo{
    public static void main(String[] args) {
        MathOp mo1 = new MathOp(10,20);
        MathOp mo2 = new MathOp(30,40);
        MathOp mo3 = new MathOp(0,0);

        mo1.add();
        mo2.sub();
        System.out.println("the value of res is " + MathOp.result);
        mo1.add();
        mo2.sub();

        System.out.println("num1 is " + mo3.num1);
        System.out.println("num2 is " + mo3.num2);
}

}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac ConstructInit.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java ConstructDemo
Init called
0
0
Init called
0
0
Init called
0
0
Addition is  30
Substraction is  -10
the value of res is -10
Addition is  30
Substraction is  -10
num1 is 0
num2 is 0
*/