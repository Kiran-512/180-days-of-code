//Bean class
// PoJo class
//Model class
class Employee{

	//data = instance varibale
	private String name;
	private int age;
	private double salary;
	private String gender;
	
	public Employee(String name, int age, double salary, String gender){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	
	// read -> get with return type
	//write -> set
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
}

class EncapsulationDmo{

	public static void main(String[] args){
		Employee e1 = new Employee("A",22,22000.0,"Male");
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
		
		// to modify data , call set methods
		e1.setName("B");
		e1.setAge(23);
		e1.setSalary(52000.0);
		e1.setGender("Female");
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
		
		
		
	}
}