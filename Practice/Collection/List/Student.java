class Student implements Comparable<Student>{
	
	private Integer sid;
	private String fname,lname,location;
	private Integer age;
	private static String collegName;
	
	static {
		collegName = "Chanakya Engineering College, Mumbai";
	}
	
	//init block
	//{System.out.println("Init Block of Student Class");}
	
	//constructor
	public Student(Integer sid,String fname,String lname,Integer age,String location){
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.location = location;
	}
	
	//Setter methods
	public void setFname(String fname){
		this.fname = fname;  
	}
	
	//Getter Methods 
	public Integer getSid(){
		return this.sid;
	}
	public String getFname(){
		return this.fname;
	}
	public String getLname(){
		return this.lname;
	}
	public String getLocation(){
		return this.location;
	}
	public Integer getAge(){
		return this.age; 
	}
	
	//toString()
	@Override
	public String toString(){return "\n Student : " + this.sid +" "+ this.fname +" " + this.lname +" " + this.location +" " + Student.collegName;}
	
	//equals()
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student s = (Student)obj;
			
			if(
				this.sid.equals(s.sid) &&
				this.fname.equals(s.fname) &&
				this.lname.equals(s.lname) &&
				this.location.equals(s.location) &&
				this.age.equals(s.age) 
			){
				return true;
			}
		}
		return false;
	}
	
	//hashCode()
	@Override
	public int hashCode(){
		int prime = 17;
		prime = prime + prime*sid.hashCode();
		prime = prime + prime*fname.hashCode();
		prime = prime + prime*lname.hashCode();
		prime = prime + prime*location.hashCode();
		prime = prime + prime*age.hashCode();		
		return prime;
	}
	//compareTo
	public int compareTo(Student s){
			return this.sid.compareTo(s.sid); 
	}
}