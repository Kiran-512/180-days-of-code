
/*
No need to use Collects.sort as treeSet itsel;f used for sorting,
it will sort the objecct of particular type only when that type implements either comparable or comparator 

*/
import java.util.*;
public class TreeSetDemo1 {

  public static void main(String[] args) {
      Employee e1 = new Employee(10, "Kiran", "Male", 80000.0);
      Employee e2 = new Employee(10, "Kiran", "Male", 80000.0);
      Employee e3 = new Employee(11, "Kiran", "Male", 80000.0);
      Employee e4 = new Employee(11, "Akshay", "Male", 80000.0);
    NameSort ns = new NameSort();
    SalarySort ss = new SalarySort();

      TreeSet<Employee> set1 = new TreeSet<>();
      set1.add(e1);
      set1.add(e2);
      set1.add(e3);
      set1.add(e4);

      System.out.println(set1);

      TreeSet<Employee> set2 = new TreeSet<>(ns);
      set2.add(e1);
      set2.add(e2);
      set2.add(e3);
      set2.add(e4);

      System.out.println(set2);

      TreeSet<Employee> set3 = new TreeSet<>(ss);
      set3.add(e1);
      set3.add(e2);
      set3.add(e3);
      set3.add(e4);
      
      System.out.println(set3);


}
}