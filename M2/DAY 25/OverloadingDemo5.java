/*
Boxing is prefered over var args
*/

public class OverloadingDemo5{

    static void m1(byte... a){System.out.println("1");}
   
    static void m1(Byte a){System.out.println("2");}

    public static void main(String[] args) {
        
        byte b =10;
        m1(b);

    }
}

// O/P is 2