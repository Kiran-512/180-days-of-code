import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(null);
        set.remove(null);
        set.add(null);
        set.add(1);
        set.add(100);

        System.out.println(set);

    }
    
}

/*
Why to override the equals toString and  hashcode

Its not at all compulsion on any class

But when it comes to the Collections 
ToString :
If we want to give some meaningfull message to the user then we must override the toString method of the Object class which return the className@hashcode

equals:
- When we add all objects of our class in the one collection and during certain operation like 
contains, indexof,remove the equlas method is overriden which check the conten instead the binary representation as in the case of Object class

Hashcode:
Hashcode method of object class generates a unique hashcode for all the objects created
When we override the hashcode then same hashcode will be generated for the objects which  has the same content (which is checked with the equals method) and assuming hashcode as an container, 
those objects will be stored in a singl container
and when ever we search for the object using contains,indexof, remove at that time instead iof iterating thru all the collection list we can directly go on that container which has hashcode eqauls to the hashcode of the object which we want to delete
 



*/
