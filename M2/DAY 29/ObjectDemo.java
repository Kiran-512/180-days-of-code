class Employee {

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

//below method overrides the parent method of Object class, in order tp show some understandable message when we print the value of reference variable
  @Override
  public String toString() {
    //   return super.toString();
    return this.EmployeeID +" "+ this.name +" "+ this.gender +" "+ this.salary;
  }

/*We override this method of Object class, basically we do it because equals method of obejct class compares the binary representation instead of content of the object;
String and all the Wrapper classes have overriden this method of Object class, which compares the content instead of binary representation
So for the user defined classes like class Employee when we use this method it will inherit and implement the method of Objet class direclty so
to avoid this we have defined this method here to compare the content of the Objects instead of binary representtation 
*/
  @Override
  public boolean equals(Object obj) {
    //   return super.equals(obj);
    /*
    we used instanceof here because Object being parent class all classe,if we passed the object of another class as an argument to this method it will start comparision
    so to ensure that the object is instanceof Employee type we have wrote below if condition
    */
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

  //   IN COLLECTION to maintains the uniqueness of the object which has the same conent should have the same hashcode
  //do not map hashcode to the memory locations as memory location can never be negative but hashcode can be negative
  @Override
  public int hashCode() {
    // return super.hashCode();

    int prime = 17;
    prime = prime + prime * EmployeeID.hashCode();
    prime = prime + prime * name.hashCode();
    prime = prime + prime * gender.hashCode();
    prime = prime + (int) (prime * salary);

    return prime;
    // return 10; if we return this value then hashcode for all the objects would be 10
  }
}

class DemotToCheckInstace {}

public class ObjectDemo {

  public static void main(String[] args) {
    Employee e1 = new Employee(10, "Kiran", "Male", 80000.0);
    Employee e2 = new Employee(10, "Kiran", "Male", 80000.0);
	Employee e3 = new Employee(11, "Akshay", "Male", 80000.0);
	Employee e4 = null;
    

	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(e4);	//null

/* Below line will give false Unlike the String class equals method as String class has overriden the equal method of object which do not compare the
         content of the two object, instead this method compares the binary representation in Object class
         so String class and Swrapper class has overrideen method of object class but in our userdefined class lets say here in EMmployee class
         to compare th content of the object we must override the object class method
        */
	
    System.out.println(e1.equals(e2));//true
    System.out.println(e1.equals(e3));//false
	
    DemotToCheckInstace i = new DemotToCheckInstace();

    e1.equals(e2);//here we need some voolean variable to store the result or can directly display in the print statement
    e1.equals(i); // this will give ClassCastException in equals method if instanceof operator is not used as unable to cast DemotToCheckInstace Type to Employee Type so to avoid this we used instanceof in equals method while overriding

	System.out.println(e1.equals(i));//false



// HASHCODE

	String s1 = "Krain";
	String s2 = "Krain";
    String s3 = "Rahul";
	
	System.out.println(s1.hashCode()); // 72756831
    System.out.println(s2.hashCode());// 72756831
	System.out.println(s3.hashCode());// 78722128
	
	//Conclusion : String class has overridden the hashCode() METHOD OF THE oBJECT CLASS hence for the String with the same content we are getting the similar hashCode

//Before Overrdiing HashCode() in Employee class
    System.out.println(e1.hashCode()); // 1826771953
    System.out.println(e2.hashCode()); // 1406718218
	
	//Conclusion : Since Employe class has not overrident the HashCode method it will use the HashCode method of the Object class, which generates the unique hashCode for new Object created 
	
//since the method is overriden hashcode will be same now for e1 and e2, which should be different ethically since both are the diff objects 
//but since the content is same we have forceflly overridden the hashcode method of the Obect class
    System.out.println(e1.hashCode());//- 1420539917
    System.out.println(e2.hashCode());//- 1420539917
  
  }
}

/*
Final OUTPUT based on the above code

C:\CDAC\Github\180-days-of-code\M2\DAY 29>java ObjectDemo
10 Kiran Male 80000.0
10 Kiran Male 80000.0
11 Akshay Male 80000.0
null
true
false
false
72756831
72756831
78722128
- 1420539917
- 1420539917
- 1420539917
- 1420539917

C:\CDAC\Github\180-days-of-code\M2\DAY 29>

C:\CDAC\Github\180-days-of-code\M2\DAY 29>

*/
