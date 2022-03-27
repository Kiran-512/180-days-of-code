class A{

    int x;
    int y;
    static int z;
    {
        x=10;
        y=10;
    }
    A(int p, int q){
        this.x=p;
        this.y=q;
    }
     void m1(int a, int b){
      this.x = a;  
      this.y = a;  
    }
	
    void m2(A ovar){
        ovar.x=500;
        ovar.y=500;
    }
	
    static void m3(int a, int b){
/* in this block we can not change the values of x and y, thats where the we pass the binary representation of how to reach object 
	OR ELSE
		We can use the concept of static referenece variable
 */
    }
	    static void m4(A ob){
        ob.x=100;
        ob.y=100;
		
    }
}

class AbasicDemo{
    public static void main(String[] args) {
        A a1 = new A(5,5);
		A a2 = new A(50,50);
		
        System.out.println("The values of X is " + a1.x);
        System.out.println("The values of Y is " + a1.y);
		
		System.out.println("The values of X is " + a2.x);
        System.out.println("The values of Y is " + a2.y);


        a1.m1(20,20);
		System.out.println("The values of a1.X after m1 is " + a1.x);
        System.out.println("The values of a1.Y after m1 is " + a1.y);
		
		a1.m2(a2);
		System.out.println("The values of a1.X after m2 is " + a1.x);
        System.out.println("The values of a1.Y after m2 is " + a1.y);
		
		System.out.println("The values of a2.X after m2 is " + a2.x);
        System.out.println("The values of a2.Y after m2 is " + a2.y);
		
		A.m4(a1);
		System.out.println("The values of a1.X after m4 is " + a1.x);
        System.out.println("The values of a1.Y after m4 is " + a1.y);		

    }


}