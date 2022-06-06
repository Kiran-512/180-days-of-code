/*
In belwo eg all the three objects re unreachable and is is referering internally on heap but no such ref var refers to any of the three objects
*/

public class Island {
    Island is;
    int x;
    
 public static void main(String[] args) {

    Island i1 =new Island();
    Island i2 =new Island();
    Island i3 =new Island();

    i1.is = i3;
    i2.is = i1;
    i3.is = i2;

    i1=i2=i3=null;


 }   
}
