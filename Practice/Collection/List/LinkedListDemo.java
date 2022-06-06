import java.util.LinkedList;
import java.util.Collections;

class LinkedListDemo{
	
		public static void main(String... args){
			
		LinkedList<Student> StudentlinkedList = new LinkedList<>();

		Student s1 = new Student(101,"Kiran","Yadav",25,"Kalamboli");
		Student s2 = new Student(102,"Akshay","Navale",24,"Panvel");
		Student s3 = new Student(103,"Pranit","Jagtap",26,"Karanjade");	
		Student s4 = new Student(104,"Rohan","Shinde",27,"Waduj");
		Student s5 = new Student(105,"Akshay","Mote",23,"Pune");		

		StudentlinkedList.offer(s2);
		StudentlinkedList.addFirst(s1);
		StudentlinkedList.offer(s4);
		StudentlinkedList.add(2,s3);
		StudentlinkedList.addLast(s5);
		
		System.out.println(StudentlinkedList.size());// 5
		
		System.out.println(StudentlinkedList);	
		/*
		[
	Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
	Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
	Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
	Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai,
	Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai]
		*/
//========================================		
		//peek method
		System.out.println(StudentlinkedList.peek());
		// Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai
		
		//peekFirst method	
		System.out.println(StudentlinkedList.peekFirst());
		// Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai
		
		//peekLast method			
		System.out.println(StudentlinkedList.peekLast());
		//Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai

//========================================		
		//getFirst()
		System.out.println(StudentlinkedList.getFirst());
		// Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai
		
		//getLast()
		System.out.println(StudentlinkedList.getLast());
		// Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai
		
		//get(index)
		System.out.println(StudentlinkedList.get(3));
		// Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai
//========================================	Comparable

		//Sorting of the data 
		Collections.sort(StudentlinkedList);

		System.out.println(StudentlinkedList);
		/*
		Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
		Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai,
		Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai]
		*/
//======================================== Comparator

		StudentLocationSort loc = new StudentLocationSort();
		
		Collections.sort(StudentlinkedList,loc);

		System.out.println(StudentlinkedList);
		/*
		Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai,
		Student : 103 Pranit Jagtap Karanjade Chanakya Engineering College, Mumbai,
		Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai,
		Student : 105 Akshay Mote Pune Chanakya Engineering College, Mumbai,
		Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai]
		*/
		
//======================================== Delete the objects from collections  
		
		StudentlinkedList.remove(s3);
		
		System.out.println(StudentlinkedList.poll());
		// Student : 101 Kiran Yadav Kalamboli Chanakya Engineering College, Mumbai
		
		System.out.println(StudentlinkedList.pollFirst());
		// Student : 102 Akshay Navale Panvel Chanakya Engineering College, Mumbai
		
		System.out.println(StudentlinkedList.pollLast());
		// Student : 104 Rohan Shinde Waduj Chanakya Engineering College, Mumbai

		System.out.println(StudentlinkedList.size());// 1
		
//======================================== Delete the objects from collections  

	}
}