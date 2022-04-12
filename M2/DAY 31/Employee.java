
/*
We have to sort the objects of employee class so we have to implements the comparable interfaces 
which is functional interface and based on the variables used inside the comparable interface compraeTo method, we will sort the data

*/
public class Employee implements Comparable<Employee>{//if <Type> is not mentioned here then we have to make changes in method argument below as public int compareTo(Object o){ //here will have to downcast it first to employee type}

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

  //get set methods
  public Integer getID(){
    return this.EmployeeID;
  }
  public String getName(){
    return this.name;
  }
  public String getGender(){
    return this.gender;
  }
  public double getSalary(){
    return this.salary;
  }



  @Override
  public String toString() {
    //   return super.toString();
    return this.EmployeeID + this.name + this.gender + this.salary;
  }

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

@Override
public int compareTo(Employee e){
  return this.EmployeeID.compareTo(e.EmployeeID);

  /*
  In this method when two objects compares
  1.If both the objects are similar then it will return 0
  2.If this.object is greater then it will return -ve value
  3.If this.Object is smaller then it will return +ve value 
  */
  // return this.EmployeeID-e.EmployeeID); if this int is used instead of Integer

}

}
