/*
Various pools when JVM creates as instance when any program runs
Byte,Short,Integer,Long = -128 to 127 (256 Objects are in respective pool)
Character = 0-127
Boolean = true,false
*/

public class WrapDemo {
    public static void main(String[] args) {
        Integer i1 =100;
        Integer i2 =100;

        System.out.println(i1 == i2); // true as both the references pointing to the same object

        //below objects are created in the heap and not in the pool as its beyond the range
        i1=129;
        i2=129;
        System.out.println(i1 == i2);//false, as both the objects are poiting to the diff objects are 129 is beyond the range

        //to check the content of the object we can use the equals(); method
        System.out.println(i1.equals(i2));//true


        i1=100;//this Object is shifted to heap with the line no 16
        Integer i3 = new Integer("100");
        System.out.println(i1.equals(i3));//true
        
        //one Object is pool and other in heap
        Integer i4 = 100;
        System.out.println(i4.equals(i3));//false as both the objects in the diff locations


    }
}
