import java.util.Comparator;
class SalarySort implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2){
		System.out.println("compare method invoked!!!");
		return e2.getSalary().compareTo(e1.getSalary());
	}
}