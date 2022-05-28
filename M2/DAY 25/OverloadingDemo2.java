public class OverloadingDemo2 {
    
    static void m1(long a){System.out.println("3");}

    static void m1(byte a){System.out.println("1");}
   
    public static void main(String[] args) {
        
        short b =10;
        m1(b);

    }
}