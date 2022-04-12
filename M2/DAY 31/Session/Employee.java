class Employee implements Comparable<Employee>{

	private Integer employeeId;
	private String name;
	private String gender;
	private Double salary;
	
	private int age;
	
	public Employee(Integer employeeId, String name, String gender, double salary){
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	//get and set methods
	public Integer getEmployeeId(){
		return this.employeeId;
	}
	public String getName(){
		return this.name;
	}
	public String getGender(){
		return this.gender;
	}
	public Double getSalary(){
		return this.salary;
	}
	
	public void setEmployeeId(Integer employeeId){
		this.employeeId = employeeId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(Double salary){
		this.salary = salary;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	
	//toString
	@Override
	public String toString(){
		return "Employee:"+this.employeeId+", "+this.name+", "+this.gender+", "+this.salary;
	}
	
	
	//equals
	@Override
	public boolean equals(Object o){
		System.out.println("equals invoked!!!!");
		if(o instanceof Employee){ //?
			Employee temp = (Employee)o;  //?
			
			if(this.employeeId.equals(temp.employeeId) &&
				this.name.equals(temp.name) &&
				this.gender.equals(temp.gender)&&
				this.salary.equals (temp.salary)
			){
				return true;
			}
		}
		return false;
	}
	
	
	//hashCode
	@Override
	public int hashCode(){
		System.out.println("hashCode invoked!!!!");
		int prime = 23;
		prime = prime + prime*this.employeeId.hashCode();
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.gender.hashCode();
		prime = prime + prime*this.salary.hashCode();
		
		return prime;
	}
	
	@Override
	public int compareTo(Employee e){
		return this.employeeId.compareTo(e.employeeId);
		//return this.age - e.age; // If primitives are used instead of Wrapper classes
	}
	
}