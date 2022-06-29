 class StaticInnerClass {
    static int x =10;

    static void m1(){

    }
    static class InnerClass{
        int y =20;
        static int z;

        void m(){

        }
        static void m2(){

        }

    }
}

 class StaticInnerClassDemo {

     public static void main(String[] args) {
         
        StaticInnerClass.InnerClass i = new StaticInnerClass.InnerClass();

        i.m();
        StaticInnerClass.InnerClass.m2();
        i.y=100;

        System.out.println(StaticInnerClass.InnerClass.z);//0, default value of static variable

     }
    
}
