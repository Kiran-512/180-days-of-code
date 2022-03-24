class staticv$m{

    static int a =10;
    static int y =10;

    static void m1(){}

}

class StaticDemo{

    static int x =10;
    static int y =10;
    int z =10;

    static void m1(){

    }   
    static void m2(){

    }   
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
//      System.out.println(z); // here its instace variable 
        System.out.println(staticv$m.a);
        System.out.println(staticv$m.y);

        m1();
        m2();
        m1();
        staticv$m.m1();
    }

}

/*
When we compile the program and run particular class then in JVM first instance of this code will ve created and then static variables will be loaded in the memory and assigned the values if any after which the main method will be loaded and then main thread generated hence we can directlky access static variables and methods without any reference variable.
*/