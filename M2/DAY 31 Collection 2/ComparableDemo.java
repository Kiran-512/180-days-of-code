import java.util.*;
class listDemo1 {
public static void main(String[] args) {
    ArrayList<Employee> list = new ArrayList<>();
    Employee e1 = new Employee(9, "Kiran", "Male", 80000.0);
    Employee e2 = new Employee(10, "Kiran", "Male", 80000.0);
    Employee e3 = new Employee(11, "Kiran", "Male", 80000.0);
    Employee e4 = new Employee(11, "Akshay", "Male", 80000.0);

    list.add(e1);
    list.add(e3);
    list.add(e4);
    list.add(e2);

    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println(e4);

    System.out.println(list + " ");

    Collections.sort(list);// By default this will take comprable's, compareTo method

    System.out.println("Sorted list based on ID METHOD MENTION IN COMPARABLE" + list );

    //Comparator use
    //When we have to explicitly give some sorting criteria at that time we declare compare method in class that extends the comparator and then by creating the object of that class we will pass that criteria as argument for sort method
    //1. Create the object of particular class that implements the comparator
    NameSort ns = new NameSort();

    Collections.sort(list);//Again this will sort on the basis of comparable's compareTo method implementation
    System.out.println("Again Sorted list based on ID METHOD MENTION IN COMPARABLE" + list);

    System.out.println("Sorted list based on the names " ); 
    Collections.sort(list,ns);// Now, this will osrt based on the method implemented in the NameSort class
    System.out.println(list);

    System.out.println("The final sorting based on last applied sorting method i.e. names here "+list);
  }
}
/*
COMPARABEL :
- present in java.lang package
- compareTo method aceept only one argument as objects
- functional interface (We can write the lambda expression for this)
- gives the default sorting order for collection objects
- All wrapper classes and String class have already implemented this comparable interface hence we can use 
	the sort() of Collections class directly on these classes Objects in Collection
- Also we can use TreeSet and TreeMap direclty since these classes have implemented the Comparable interface and 
	overriden the compareTo method and has given some sorting order 
- Some the other predefined classes which do not implement the comparable interface for those we can not use Sort() method and also
	TreeSet and TreeMap
	So to given some sorting order for these class we can go with the comparator	
- Also userDefined classes also need to implement the comparbale interafce and give some natural/ default sorting order then ONLY
	we can use sort() of Collections class and TreeSet and TreeMap
*/
	
/*
Comparator :
- belongs to java.util package
- compare method accept the two objects
- used to have the alternate sorting orders other than comparable
- We will create seperate class which implements this operator and in type we willmention the class for which we want the sorting orders
*/