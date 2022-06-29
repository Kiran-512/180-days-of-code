/*

Incase of arrayList equals and hashcode method wont be called as uniqueness is not maintained so in this case the hashcode will be the same for the objects which has same content and objects with the same hashcode will be in the same bucket 
But in case of set and map uniqueness is maintained hence first hascode is called to reach the bucket and then if any object inside that bucket then 
equals will be called to check the content

And as ethically in java, if content of two object is same then there hashcode will also be same!
*/

/*
Why hashcode and equals methods not called at the time of insersion as in the case of set and map?
*/

import java.util.*;

class ListDemo{

  public static void main(String[] args) {
    ArrayList<Employee> list = new ArrayList<>();
    Employee e1 = new Employee(10, "Kiran", "Male", 80000.0);
    Employee e2 = new Employee(10, "Kiran", "Male", 80000.0);
    Employee e3 = new Employee(11, "Kiran", "Male", 80000.0);
    Employee e4 = new Employee(11, "Akshay", "Male", 80000.0);

    list.add(e1);
    list.add(e3);
    list.add(e4);
    list.add(e2);//Uniqueness is not maintained, so this wont call the hashcode method or equals method here yet we override these methods in Employee Type

    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println(e4);

    System.out.println(list + " ");

    // below methods will call the equls methods first  and iterates in the list right from the first Object to check the the objects is present or not and returns the o/p as defined in source code
    System.out.println(list.contains(e4));
    System.out.println(list.indexOf(e4));
    System.out.println(list.remove(e4));
    
  }
}
