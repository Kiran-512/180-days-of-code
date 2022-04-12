import java.util.*;

 class listDemo1 {

  public static void main(String[] args) {
    ArrayList <Employee> list = new ArrayList<>();
    Employee e1 = new Employee(10, "Kiran", "Male", 80000.0);
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

    Collections.sort("Sorted list " + list);// By default this will take comprable compareTo method

    //Comparator use
    //When we have to explicitly give some sorting criteri at that time we declare compareTo methods in class that extends the comparator and then by creating the object of that class we will pass that criteria as argument for sort method
    //1. Create the object of particular class that implements the comparator
    NameSort ns = new NameSort();

    Collections.sort(list);//Again thsi will sort on the basis of comparable method implementation
    System.out.println("Sorted list based on the names " + ); Collections.sort(list,ns);// Now, this will osrt based on the method implemented in the NameSort class


  }
}
