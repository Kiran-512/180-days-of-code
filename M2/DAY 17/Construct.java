class Construct{

}
class MathOp{
    int num1;
    int num2;
    static int result;

    MathOp(int a, int b){
        this.num1 =a;
        this.num2 =b;
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
        
        mo1.add();
        mo2.sub();
        System.out.println("the value of res is " + MathOp.result);
        mo1.add();
        mo2.sub();

}

}
/*class Construct{

}
class MathOp{
    int num1;
    int num2;
    static int result;

    MathOp(int a, int b){
        this.num1 =a;
        this.num2 =b;
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

        //Below Repitative copde will be removed with the constructor
        //mo1.num1 = 10;
        //mo1.num2 = 10;
        //mo2.num1 = 30;
        //mo2.num2 = 40;
        
        mo1.add();
        mo2.sub();
        System.out.println("the value of res is " + MathOp.result);
        mo1.add();
        mo2.sub();

}

}*/
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac Construct.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java ConstructDemo
Addition is  30
Addition is  -10
the value of res is -10
Addition is  30
Addition is  -10

C:\CDAC\Github\180-days-of-code\M2\DAY 17>
*/
/*class Construct{

}
class MathOp{
    int num1;
    int num2;
    static int result;

    void add(){
        result = num1 + num2;
        System.out.println("Addition is  " + result);
    }
    void sub(){
        result = num1 - num2;
        System.out.println("Addition is  " + result);
    }

}
class ConstructDemo{
    public static void main(String[] args) {
        MathOp mo = new MathOp();

        mo.num1 = 10;
        mo.num2 = 10;

        mo.add();

        mo.num1 = 10;
        mo.num2 = 10;

        mo.sub();
    System.out.println("the value of res is " + MathOp.result);
}

}
*/

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac Construct.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java ConstructDemo
Addition is  20
Addition is  0

C:\CDAC\Github\180-days-of-code\M2\DAY 17>
*/

/*
class Construct{

}
class MathOp{
    int num1;
    int num2;
    static int result;

    void add(){
        result = num1 + num2;
        System.out.println("Addition is  " + result);
    }
    void sub(){
        result = num1 - num2;
        System.out.println("Addition is  " + result);
    }

}
class ConstructDemo{
    public static void main(String[] args) {
        MathOp mo1 = new MathOp();
        MathOp mo2 = new MathOp();

        mo1.num1 = 10;
        mo1.num2 = 10;

        mo1.add();

        mo2.num1 = 30;
        mo2.num2 = 40;

        mo2.sub();
    System.out.println("the value of res is " + MathOp.result);

        mo1.add();

}

}
*/