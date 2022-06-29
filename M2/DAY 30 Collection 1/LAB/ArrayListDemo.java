import java.util.*;

class ArrayListDemo{
    public static void main(String[] args) {
        
        //Non generic collection
        ArrayList list = new ArrayList();

        // list.add(1, 20); AIOOB
        list.add(0, 20);
        list.add(1, null);
        list.add(2, 20);
        list.add(3, 30);
        

        System.out.println(list);


        ArrayList<Integer> list1 = new ArrayList<>();
        // for(int i=0;i<10;i++){
        //      list1.add(i);
        //     //  list1.add(i)=i;//only variable can come ont he left side of the equal to operator and methods are not allowed
        // }
        
        // LinkedList<String> list2 = new LinkedList<>();
        
        
        list1.add(10);
        list1.add(10);
        list1.add(10);
        
         for(Integer ele : list1){
            System.out.println(list1.hashCode());
         }       
/*
39721
39721
39721
*/

    }
}