import java.util.LinkedList;

class LinkedListDemo{

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.offer("A");
        list.offer("A");
        list.offer("A");
        list.offer(null);
        list.offer(null);

            System.out.println(list);

    }
}