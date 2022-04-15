import java.util.TreeMap;

class MapDemo3{
//Key,Value
	public static void main(String... args){
		TreeMap<Integer,Employee> map = new TreeMap<>();
		//put
		Employee e1 = new Employee(3,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(1,"C","Male",20000.0);
		
		map.put(3, e1);
		map.put(2, e2);
		map.put(1, e3);
		
		System.out.println(map);//3
		
	}
}