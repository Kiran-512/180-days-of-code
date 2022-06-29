class ConstructBas{
    static double result1;
    static double result2;

    int a;
    int b;
    ConstructBas(int a, int b){
        System.out.println("Int construct called");
        this.a = a;
        this.b = b;
    }

    double c;
    double d;

    ConstructBas(double c, double d){
       // this(50.0d,50.0d); // CE: ConstructBas.java:16: error: recursive constructor invocation ConstructBas(double c, double d) -> 
        System.out.println("Double construct called");
        this.c = c;
        this.d = d;    
    }
    void m1(){
        result1 = this.a + this.b;
        result2 = this.c + this.d;
        System.out.println(result1);
        System.out.println(result2);
    }
    void m2(){

    }

}
class ConstructBasDemo{
        public static void main(String[] args) {
            ConstructBas ob1 = new ConstructBas(10,20);
            ob1.m1();
            ob1.m2();

            ConstructBas ob2 = new ConstructBas(100.0,200.0);
            ob2.m1();
            ob2.m2();
        }
}
/*
Int construct called
30.0
0.0
Double construct called
0.0
300.0
*/