import java.util.HashMap;
import java.util.TreeMap;

class MapDemo4{
//Key,Value
	public static void main(String... args){
		HashMap<Employee,Employee> map = new HashMap<>();
		//put
		Employee e1 = new Employee(1,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(3,"C","Male",20000.0);
		Employee e4 = new Employee(1,"A","Male",10000.0);
		map.put(e1,e1);
		map.put(e2,e2);
		map.put(e3,e3);
		System.out.println(map.size());//3 
		map.put(e4,e4);
		System.out.println(map.size());//3 (Assumption equals & hashCode are overriden in Employee class)
		System.out.println(map); 
		System.out.println("************************************************************"); 
		
		
		NameSort ns = new NameSort();
		//TreeMap<Employee,Employee> map2 = new TreeMap<>(ns);
		TreeMap<Employee,Employee> map2 = new TreeMap<>();
		//put
		
		map2.put(e3,e3);
		map2.put(e1,e1);
		map2.put(e2,e2);
		
		System.out.println(map2.size());//3 
		System.out.println(map2); 
		
	}
}