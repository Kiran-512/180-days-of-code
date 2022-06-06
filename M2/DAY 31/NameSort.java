import java.util.Comparator;

/*
If WE DO NOT SPECIFY THIS TYPE INSIDE THE <> then method must have the Object class argument 
instead of Employee and then we will have to downcast the Object class first and then will have to 
check the instace of particular type and then we would have compared 
    
*/
public class NameSort implements Comparator<Employee>{


    public int compare(Employee e1, Employee e2){
        return e1.getName().compareTo(e2.getName());
    } 
}
