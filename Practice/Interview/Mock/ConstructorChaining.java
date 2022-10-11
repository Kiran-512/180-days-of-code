class Person   
{  
    public Person()   
    {  
        System.out.println("Person class constructor called");  
    }  
}  
public class Employee extends Person   
{  
	 public Person()   
    {  
        System.out.println("Person class constructor called");  
    }  //ConstructorChaining.java:10: error: invalid method declaration; return type required


    public Employee()   
    {  
        System.out.println("Employee class constructor called");  
    }  
    public static void main (String args[])  
    {  
        Employee e = new Employee();  
    }  
}
