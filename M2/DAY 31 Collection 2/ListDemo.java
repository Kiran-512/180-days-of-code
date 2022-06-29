import java.util.ArrayList;
import java.util.Collections;
class ListDemo{
	public static void main(String... args){
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(3,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(1,"C","Male",20000.0);
		Employee e4 = new Employee(1,"A","Male",10000.0);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list);//Takes Comparable implementation
		System.out.println("Sorted List : "+list);
		
		//Comparable id
		//NameSort
		//SalarySort
		NameSort ns = new NameSort();
		Collections.sort(list,ns);
		System.out.println("Name Sorted List : "+list);
		
		
		SalarySort ss = new SalarySort();
		Collections.sort(list,ss);
		System.out.println("Salary Sorted List : "+list);
	}
}