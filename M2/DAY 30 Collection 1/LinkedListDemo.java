import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList <Character> list = new LinkedList<>();

        list.offer('A');//this will add the element in the next position i.e. in the end of the list
        list.offer('B');
        list.offer('C');
        list.offer('A');
        list.offer('D');
        list.offer('E');
        list.offer('B');

        System.out.println(list);

        list.addFirst('G');
        list.add(0,'K');
        System.out.println(list);

        Character ch = list.peek();//this will only return the first element but wont remove
        System.out.println(ch);
        System.out.println(list);

        ch = list.poll();//this will return and remove the first element from the list   
        System.out.println(ch);
        System.out.println(list);

        ch=list.pollLast();
        System.out.println(ch);
        System.out.println(list);
		
        Collections.sort(list);// We can sorted sirectly as Character Wrapper class has implemented comparable interafce in which sorting method compareTo is written to sort the character objects
        System.out.println(list);

    }
}
