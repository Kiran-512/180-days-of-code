import java.util.TreeSet;
import java.util.SortedSet;

class TreeSetDemo{
	public static void main(String... args){
		//Sorts data at the time of inserrion
		TreeSet<Integer> set = new TreeSet<Integer>();//Sorted
		set.add(60);
		set.add(50);
		set.add(40);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(10);
		set.add(10);
		//set.add(null); // NPE while sorting
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.comparator()); //
		
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("bs");
		set2.add("as");
		set2.add("ad");
		set2.add("As");
		System.out.println(set2);
		System.out.println(set2.descendingSet());
	}
}