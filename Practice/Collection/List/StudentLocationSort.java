import java.util.Comparator;

class StudentLocationSort implements Comparator<Student> {

	public int compare(Student s1, Student s2){
		return s1.getLocation().compareTo(s2.getLocation());
	}
}