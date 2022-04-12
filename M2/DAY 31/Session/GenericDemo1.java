import java.util.ArrayList;


class PP{
	
	
}

class CC extends PP{
	
}

class GenericDemo1{

	
	public static void main(String... args){
		
		
		PP[] arr2 = new PP[10];
		CC[] arr3 = new CC[10];
		arr2 = arr3;// we can assign child array to parent array
		//PP p = new CC();
		
		System.out.println("***********");
		
		ArrayList<PP> list1 = new ArrayList<>();
		ArrayList<CC> list2 = new ArrayList<>();
		ArrayList<CC> list3 = new ArrayList<>();
		//list1 = list2; // we cant assign Child ArrayList to Parent ArrayList
		list2 = list3;
		
		ArrayList<? extends PP> list4 = list2;//Read-Only collection
		ArrayList<? extends CC> list5 = list3;// Assign CC ka arraylist or CC ke chaild ka arraylist
												// but list4 & list5 is read-only collection
												
		//list4.add(new PP());
		//list5.add(new CC());
		
		
		ArrayList<? super CC> list6 = list1;
		ArrayList<? super CC> list7 = list2;
		ArrayList<Object> list8 = new ArrayList<>();
		
		ArrayList<? super CC> list9 = list8;
		list6.add(new CC());
		list7.add(new CC());
		list9.add(new CC());
		//list9.add(new PP());
		
		//1. What type of arrtaylist we can assign
		//2. What objects can be added to collection
		
		ArrayList<? super PP> list10 = list1;
		list10.add(new PP());
		list10.add(new CC());
		//list10.add(new Object());
		
		ArrayList<? super Object> list11 = new ArrayList<Object>();
		//list11.add()
		
		ArrayList<? extends Object> list12 = list1;
		//list12.add(new PP());
		
		ArrayList<?> list13 = list1;//read only. Assign any collection to list13
	}
}

//? extends CLASSNAME

//? super CLASSNAME