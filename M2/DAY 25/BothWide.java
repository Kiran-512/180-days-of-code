/*
In this case compiler will prefer normal widening and will stop 
*/

public class BothWide {
    
    static void m1(long a){System.out.println("3");}

    static void m1(int a){System.out.println("1");}
   
    public static void main(String[] args) {
        
        byte b =10;
        m1(b);

    }
}