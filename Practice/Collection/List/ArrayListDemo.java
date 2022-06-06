import java.util.ArrayList;
import java.util.Collections;

class ArrayListDemo{
	
	public static void main(String... args){
		
		ArrayList<Student> StudentList = new ArrayList<>();
		
		Student s1 = new Student(101,"Kiran","Yadav",25,"Kalamboli");
		Student s2 = new Student(102,"Akshay","Navale",24,"Panvel");
		Student s3 = new Student(103,"Pranit","Jagtap",26,"Karanjade");	
		Student s4 = new Student(104,"Rohan","Shinde",27,"Waduj");
		Student s5 = new Student(105,"Akshay","Mote",23,"Pune");		
		
		Student s6 = new Student(103,"Pranit","Jagtap",26,"Karanjade");			
	
		StudentList.add(s1);
		StudentList.add(1,s2);
		StudentList.add(s3);
		StudentList.add(s4);
		StudentList.add(s5);
		StudentList.add(0,s6);
		
		System.out.println(StudentList);
		//Without toString Output
		//[Student@4617c264, Student@36baf30c, Student@7a81197d, Student@5ca881b5, Student@24d46ca6, Student@4517d9a3]/

		//Without toString but with hasCode
		//[Student@d7301040, Student@7d3c9b30, Student@10043ac0, Student@d7301040, Student@e4afdd00, Student@fc3e2a00]
			
		//with toString overriden 
		/*			
		[
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
		Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai,
		Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai]
		*/
		
		//since we added duplicate student s6 we will remove him but since we didnt overriden the equals method s3 which is similar to s6 wont get deleted
		StudentList.remove(s6); // or StudentList.remove(0);
	
		System.out.println(StudentList);
		/*
		[
		Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
		Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai,
		Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai]
		*/		
	
		//lets add s6 again and override the equals method and then remove it
		StudentList.add(0,s6);
	
		StudentList.remove(s6); 
	
		System.out.println(StudentList);
		/*
		[
		Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
		Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai,
		Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai]
		*/
		//Conclusion : remove method remove only first object it met in the sequence in case of ArrayList
	
	
		//to search for the object which is similar to below object in array list
	
		Student s7 = new Student(104,"Rohan","Shinde",27,"Waduj");
	
		System.out.println(StudentList.contains(s7)); // returns true since we have overridden method equals or else it would have given false
	
		//Sorting in an ArrayList without implementing the comparable 
		Collections.sort(StudentList);
		/*
		ERROR :
		ArrayListDemo.java:81: error: no suitable method found for sort(ArrayList<Student>)
			Collections.sort(StudentList);
		*/
		// Lets implement Comparable in Student class
		Collections.sort(StudentList);
	
		System.out.println(StudentList);
		/*
		[
		Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
		Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai,
		Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai]
		*/
	
		//use of compartor :
		StudentLocationSort loc = new StudentLocationSort();
	
		Collections.sort(StudentList,loc);
	
		System.out.println(StudentList);
		/*
		[
		Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
		Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai,
		Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai]
		*/
	
	// Code to avoid duplicate in ArrayList
	}
}