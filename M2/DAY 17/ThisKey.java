class ThisKey {
    
}

class MathOp{
    int num1;
    int num2;
    static int result;
    {
        num1=100;
        num2=200;
    }
    MathOp(int num1, int num2){
      //here by using this keyword we have removed the ambiguity
      this.num1 =num1;
      this.num2 =num2;
      System.out.println(num1);
      System.out.println(num2);
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
        mo1.add();
        System.out.println(mo1.num1);
        System.out.println(mo1.num2);
}

}

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac ThisKey.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java ConstructDemo
10
20
Addition is  30
10
20

C:\CDAC\Github\180-days-of-code\M2\DAY 17>
*/

/*class ThisKey {
    
}

class MathOp{
    int num1;
    int num2;
    static int result;
    {
        num1=100;
        num2=200;
    }
    MathOp(int num1, int num2){
      //Since here name conflict, we havent reached out to our instance variables so we are assigining constructors args to same args only,
      //So to assign values to our instance variables we must use this keyword   
      num1 =num1;
      num2 =num2;
      System.out.println(num1);
      System.out.println(num2);
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
        mo1.add();
        System.out.println(mo1.num1);
        System.out.println(mo1.num2);
}

}

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac ThisKey.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java ConstructDemo
10
20
Addition is  300
100
200

*/
/*
class ThisKey {
    
}

class MathOp{
    int num1;
    int num2;
    static int result;
    {
        num1=100;
        num2=200;
    }
    MathOp(int a, int b){
    // Here diff is args and instace variable names are different, instace variable willget values from construct args
      num1 =a;
      num2 =b;
      System.out.println(num1);
      System.out.println(num2);
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
        mo1.add();
        System.out.println(mo1.num1);
        System.out.println(mo1.num2);
}

}

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac ThisKey.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java ConstructDemo
10
20
Addition is  300
100
200

*/