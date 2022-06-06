class A{
    int i;
    A avar;
}

class Problem {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
   
        System.out.println(a1.i);
        System.out.println(a2.i);
        System.out.println(a3.i);
        System.out.println(a1.avar);
        System.out.println(a2.avar);
        System.out.println(a3.avar);
   
        a1.avar = a3;     
        a3.avar = a2;     
        a2.avar = a1;     

        

    }
}