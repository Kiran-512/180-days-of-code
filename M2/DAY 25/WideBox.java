/*
Widening is always prefered over boxing

*/

class WideBox {

       static void m1(int a){System.out.println("1");}
   
       static void m1(Byte a){System.out.println("3");}
   
       public static void main(String[] args) {
           
           byte b =10;
           m1(b);
   
       }
   }
   /*
   OP is 
   1
   */