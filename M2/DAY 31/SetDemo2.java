import java.util.HashSet;

class SetDemo2{
	public static void main(String... args){
		
		Employee e1 = new Employee(3,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(1,"C","Male",20000.0);
		
		HashSet<Employee> set = new HashSet<>();
		set.add(e1);// map.put(e1,e1);
		
		set.add(e2);// map.put(e2,e2);
		set.add(e3);// map.put(e3,e3);
		
		System.out.println(set);
		
		//Step 1 : Create duplicate Object
		Employee e4 = new Employee(3,"A","Male",10000.0);
		//Step 2 
		
		set.remove(e4);
		e4.setSalary(20000.0);
		set.add(e4);
		
		
	}
}