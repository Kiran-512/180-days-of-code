/*public class VargBox {
    static void m1(int... a){System.out.println("1");}
   
    static void m1(byte... a){System.out.println("2");}

    public static void main(String[] args) {
        
        byte b =10;
        m1(b);

    }
}*/
//O/P is 2 it means 
public class OverloadingDemo4{
    static void m1(int... a){System.out.println("1");}
   
    static void m1(Byte... a){System.out.println("2");}

    public static void main(String[] args) {
        
        byte b =10;
        m1(b);

    }
}
//THIS CREATES THE ambiguity hence such code wont compile