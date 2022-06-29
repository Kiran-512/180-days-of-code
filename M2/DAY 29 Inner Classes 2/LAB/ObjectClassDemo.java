class Employee{

	private Integer employeeId;
	private String name;
	private String gender;
	private double salary;
	
	public Employee(Integer employeeId, String name, String gender, double salary){
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	//get and set methods
	
	//toString
	@Override
	public String toString(){
		return this.employeeId+", "+this.name+", "+this.gender+", "+this.salary;
	}
	
	//equals
	@Override
	public boolean equals(Object o){
		if(o instanceof Employee){ //?
			Employee temp = (Employee)o;  //?
			
			if(this.employeeId.equals(temp.employeeId) &&
				this.name.equals(temp.name) &&
				this.gender.equals(temp.gender)&&
				this.salary == temp.salary
			){
				return true;
			}
		}
		return false;
	}
	
	
	//hashCode
	@Override
	public int hashCode(){
		int prime = 17;
		prime = prime + prime*this.employeeId.hashCode();
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.gender.hashCode();
		prime = prime + (int)(prime*salary);
		
		return prime;
	}
	
}
//javap java.lang.Object
class Person{
	
}


class ObjectClassDemo{
	public static void main(String[] args){
		Employee e1 = new Employee(1,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(3,"C","Male",20000.0);
		Employee e4 = new Employee(1,"A","Male",10000.0);
		
		System.out.println(e1); // internally invoked as e1.toString();
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println("e1 == e4"+(e1 == e4));//false
		System.out.println("e1 equals e4"+e1.equals(e4));//false . After overriding equals =  true
		
		String s1 = new String("A");
		String s2 = new String("A");
		
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));// true
		
		
		Person p = new Person();
		System.out.println(e1.equals(p));//ClassCastException // after overriding false
		
		/*
		Employee@15db9742 // 1
		Employee@6d06d69c
		Employee@7852e922
		Employee@4e25154f // 4
		*/
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(e1.hashCode());
		System.out.println(e4.hashCode());
		
		int x = 0x15db9742;
		System.out.println(x);
		//366712642
		//1829164700
		
	}
}
