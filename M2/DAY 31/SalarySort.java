//In case salary is float i.e. primitve 

    import java.util.Comparator;

public class SalarySort implements Comparator<Employee>{
    
    public int compare(Employee e1, Employee e2){
        return (int)(e1.getSalary()- e2.getSalary());
    } 
}

