class Employee{

	private Integer employeeId;
	private String name;
	private String gender;
	private Double salary;
	
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
	
}