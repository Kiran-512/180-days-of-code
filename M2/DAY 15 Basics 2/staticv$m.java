class staticv$m{

    static int a =10;
    static int y =20;

    static void m1(){}

}

class StaticDemo{

    static int x =10;
    static int y =10;
	static int a =100;
    int z =10;

    static void m1(){

    }   
    static void m2(){

    }   
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
//      System.out.println(z); // here its instance variable 
        System.out.println(staticv$m.a);
        System.out.println(staticv$m.y);

        m1();
        m2();
        m1();
        staticv$m.m1();
    }

}

/*
Once we submit the class having main method to JVM, first instance of the jvm will be created,and then static variables wil beget the memory after 
that main thread will get executed and hence we can access static variabvle without the object as they are the cl;ass level variables and already there in the memory    

But to access the static variables of another class, in this eg class staticv$m , we will have to submit this class to JVM to hence we write the classname.variable_name 
so that this class will also get loaded in the memory and above process will be repeated 

*/