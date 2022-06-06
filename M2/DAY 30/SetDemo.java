import java.util.*;

public class SetDemo{

  public static void main(String[] args) {
    HashSet<Employee> list = new HashSet<>();
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

    //both the below methods call equals methods and they must override equal method of Objec class so that it can compare the content of the object instead of  ref variables
    System.out.println(list.contains(e3));
    // System.out.println(list.indexOf(e3));
    /*
        In case of Set: to maintain the uniqueness
        If lets say there are 30000 objects of employee class and we add them in a list and if we compare the contenet of any object with the object which is at the 
        index of 29999 then it will take longer for equals method to compare with the content of each object and then to display the result if there exit some other object or not
        so this time can be reduced with the use of hashcode() method,
        But java bydefault give diff hashcode to each object so to avoid this we will override this hashcode method
        In this we will assign unique hashcode to the each object and then will comapre if there exit the object with the same hashcode or not!

        IN SET COLLECTIONS FIRST HASHCODE WILL BE CALLED TO MAINTAIN THE UNIQUNESS

        Hashcode will tell us where to go and then with the equals method it will compare if the object is same or not,
        if its same set wont accept that object as its already exist and if its not there then it will get into that bucket
        */

  }
}
