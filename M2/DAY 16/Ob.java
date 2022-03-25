class Ob {
    int a;
    int b;

    void m1(){

        System.out.println("Addition of a and b is " + (a+b));

        a = 10;
        b = 10;

        System.out.println("The values of a and b for all objects are now changed to " + a + " " +b);
    }
}
class ObDemo {
    public static void main(String[] args) {
        Ob b1 =new Ob();
        Ob b2 =new Ob();

        System.out.println(b1.a);
        System.out.println(b1.b);

        b1.a=30;
        b1.b=30;

        System.out.println(b1.a);
        System.out.println(b1.b);

        b1.m1();
// ================================================
        System.out.println(b2.a);
        System.out.println(b2.b);

        b2.a=40;
        b2.b=40;

        System.out.println(b2.a);
        System.out.println(b2.b);

        b2.m1();




    }
}
