import java.util.HashSet;


public class HashSetDemo {

    public static void main(String[] args) {
        
        HashSet<Integer> set1 =new HashSet<>(); 

        set1.add(10);
        // set1.add(0,10);// index not allowed
        set1.add(10);// there wont be any error but still set will maintain the uniqueness and wont be added to the list again as already added 
        set1.add(20);
        set1.add(Integer.valueOf(10));
        set1.add(30);
        set1.add(40);
        set1.add(50);
        set1.add(30);
        
        System.out.println(set1.size());//5
        
        // for (int i = 0; i < 20; i++) {
        //     set1.add(i);
        // }
        System.out.println(set1.size());//5

        //it might print in the order might not so its not sure which order it will follow
        System.out.println(set1);//check the order//[0, 1, 2, 3, 4, 5, 6, 7, 40, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 50, 18, 19, 20, 30]

        System.out.println(set1.contains(30));//true

        set1.remove(30);
        System.out.println(set1);

        System.out.println(set1.contains(30));//false

    }
}
