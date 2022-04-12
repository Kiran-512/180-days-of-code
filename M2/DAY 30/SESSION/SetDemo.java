import java.util.*;

class SetDemo{
	public static void main(String... args){
		HashSet<Employee> set = new HashSet<Employee>();
		
		Employee e1 = new Employee(1,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(3,"C","Male",20000.0);
		Employee e4 = new Employee(1,"A","Male",10000.0);
		
		
		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e4);
		
		System.out.println(set.size());
		System.out.println(set);
		
	}
}