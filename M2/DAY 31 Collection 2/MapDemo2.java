import java.util.LinkedHashMap;

class MapDemo2{
//Key,Value
	public static void main(String... args){
		LinkedHashMap<Integer,Employee> map = new LinkedHashMap<>();
		//put
		Employee e1 = new Employee(1,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(3,"C","Male",20000.0);
		
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		System.out.println(map.size());//3
		
		System.out.println("Before : "+map.get(1));//
		Employee e = map.get(1); //map.get(KEY)
		e.setSalary(30000.0);
		System.out.println("After : "+map.get(1));//toString against e1 will be invoked!!
		
		map.remove(2);
		System.out.println(map.size());//2
		
		System.out.println(map.containsKey(3));//true
		Employee e4 = new Employee(1,"A","Male",30000.0);
		
		System.out.println(map.containsValue(e4));//true
		System.out.println(map.containsKey(2));//false
		
		System.out.println(map);
		map.put(3,null);
		System.out.println(map);
		System.out.println(map.size());
	}
}