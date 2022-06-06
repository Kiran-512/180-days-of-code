import java.util.*;

class StackwithLL{

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(list.size());

        for (int i = 0; i <= list.size(); i++){
            if (list.isEmpty()) {
                list.add(0,29);
            }
        }
        list.offer(40);
        list.addFirst(10);
        list.add(50);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(00);
        list.add(40);

        System.out.println(list);

        // list.pollLast();
        // list.pollLast();
        // list.pollLast();
        // list.pollLast();
        // list.pollLast();
        // list.pollLast();
        // list.peekLast();
        
        System.out.println(list);

    }
}