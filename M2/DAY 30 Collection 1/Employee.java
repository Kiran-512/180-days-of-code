public class Employee {

  private Integer EmployeeID;
  private String name;
  private String gender;
  private double salary;

  public Employee(Integer id, String name, String gender, Double salary) {
    this.EmployeeID = id;
    this.name = name;
    this.gender = gender;
    this.salary = salary;
  }

//Why to override the ToString
/*
- toString() of the object class prints the className@HashCode
- If we want to print the Object content (meaningfull message), then wemust override the toString Method of Object class 
*/

  @Override
  public String toString() {
    //   return super.toString();
    return this.EmployeeID + this.name + this.gender + this.salary;
  }

/*
Why to Override the equals();
- equals() of the Object class compare the binary representation and not the content of Objects
- In Collection whenever we use the certains method 
*/

   @Override
   public boolean equals(Object obj) {
     System.out.println("equals invoked");

     if (obj instanceof Employee) {
       Employee e = (Employee) obj;
       if (
         this.EmployeeID.equals(e.EmployeeID) &&
         this.name.equals(e.name) &&
         this.gender.equals(e.gender) &&
         this.salary == e.salary
       ) {
         return true;
       }
     }
     return false;
}

  @Override
   public int hashCode() {
	System.out.println("hashcode invoked");

     int prime = 17;
     prime = prime + prime * EmployeeID.hashCode();
     prime = prime + prime * name.hashCode();
     prime = prime + prime * gender.hashCode();
     prime = prime + (int) (prime * salary);

     return prime;
   // return 10; if we return this value then hashcode for all the objects would be 10
   }
}
