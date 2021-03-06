/*
How HashSet and HashMap Works?
- When ever we try to add the element in the HashSet Collection, first INTERNALLY hashCode of that object will be generated, 
	assuming we have overrien the hashCode() such that it will generate unique hashCode for each Object having same the 
	same content, hashCode() of object class gives different hashCode for each Object even thought the Content 
	is same
- After this
CASE 1: If HashCode is different than already present hashCodes of the objects in the collection then equals method(we must override) 
	is not called and Object is directly inserted into Collection
CASE 2: If hashCode is same as any one of the previous Object's hashCode then the equals() is called to checked the content
	of the object to be inserted with the already existing object with the same hashCode
	If the content is same, which means the duplicate Object and it won't be inserted
BUT 
	if the content is different which is unlikely impossible(possible only if there is some bug in the implementation of hashCode and equals method)
	then the object will be inserted on that hashCode in the collection	

For HashSet, both these methods are called on each Objects we are adding	
For HashMap, all these methods (equals AND hashCode) are called only for the KEY and not for the VALUES  

HashMap accepts the null key ONLY ONCE!	

PS : AllWrapper classes and String class has overriden all the three methods of the Object class i.e. toSrting(), equals() and hashCode()

=> Its not necessary for ArrayList to override the HashCode()!
While adding new element equals() in arraylist is not called hence the uniqueness is maintained

IMPORTANT : If we override the hashCode() for Arraylist then, objects with the same content will be having same hashCode 
			and those objects will be stored on the same hashCode, AND while we search for an Object in Arraylist
			HashCode is never internally like SET and MAP called, becasue we have an index in Arraylist with the help of which searching is easy!


*/

import java.util.HashMap;

class MapDemo{
//Key,Value
	public static void main(String... args){
		HashMap<Integer,Employee> map = new HashMap<>();
		//put
		Employee e1 = new Employee(1,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(3,"C","Male",20000.0);
		
		map.put(2, e2);
		map.put(3, e3);
		map.put(1, e1);
		System.out.println(map.size());//3
		
		System.out.println("Before : "+map.get(1));//
		Employee e = map.get(1); //map.get(KEY)
		e.setSalary(30000.0);
		System.out.println("After : "+map.get(1));//toString against e1 will be invoked!!
		
		map.remove(2);
		System.out.println(map.size());//2
		
		System.out.println(map.containsKey(3));//true
		Employee e4 = new Employee(1,"A","Male",10000.0);
		
		System.out.println(map.containsValue(e4));//true HERE THE EQULS METHOD OF THE VALUE i.e. of Employee class is called with iterations 
		System.out.println(map.containsKey(2));//false
		
		System.out.println(map);
		map.put(3,null);
		System.out.println(map);
		System.out.println(map.size());
	}
}

/*
Internal Working of HashMap :
- default size is 16 i.e. 2^4
- load factor is 75%, i.e. after 75% of size gets full on inserting new object HashMap will grow
- Load factor is nothging but when we try to insert the 13th object into the HashMap, it will grow in size to 2^5 i.e. 32

Formaula 
Bucket_index =  hashCode(KEY) & (n-1) 
-- here the index is alwasy in the range of 0-(n-1) where n is the size of the map collection

CASE 1 :if the hasCode is same for all the objects(can be achieved by overrding the hashCode method which return 10 for every object)
		then all the unique Objects will get added into the same bucket having bukcet_index calculated by the above formula
		and will be maintained with the linked List

CASE 2:If the hashCode is different then as per the bucket_index all the obejct will move into the different buckets and when then duplicate object user
		we try to add then equals method(overriden) will be called and content will be cheked and according to the uniqueness is maintained

This will repeat until collection has less than 75% of the total object in the list,
		So when user try to insert the 13th Object into the MAP collection then
- the size of the MAP collection will grow first
- then since the value of n changes to 32 in bucket_index formula again the bucket index will be calculated for all the object inserted
		and their postion is reshuffled as per the new bucket index 

Every bucket has linked list maintained and if the bucket index turn out tpo be same for object added into the MAP 
	then it will get added last in the LinkedList on that particular bukcet_index

*/