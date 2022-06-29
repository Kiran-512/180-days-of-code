==========
Comparable: Functional Interface
Comparator: 
Yes, Comparator is a functional interface. The equals is an abstract method overriding one of the public methods of java.

-both the interfaces used to sort the data
============
We have to sort the objects of employee class so we have to implements the comparable interfaces 
which is functional interface and based on the variables used inside the comparable interface compraeTo method, we will sort the data


We CAN WRITE ONLY ONE SORTING CRITERIA in comparable but in cmparator we can provide the multiple sorting criteria:


Since every default class in java implements these comparable and comparaor interfaces:
So for the user defined class like employee we will have to implement these interfaces and will have to override the methods of those interfaces


If WE DO NOT SPECIFY THIS TYPE INSIDE THE <> after comparable, then method must have the Object class argument 
instead of Employee and then we will have to downcast the Object class first and then will have to 
check the instace of particular type and then we would have compared 

=====================
When we make the TreeSet then for sorting at the time of sorting it will find the comparable or comparator interfaces methods to compare the objects
But in case if We didn't implements these interfaces then it will throw ClassCastException at Run time
, So we will have to implement the 

=====================

Set vs Map :

if both mantains the uniquesness then why set why not Map ?
- 

=====================
Map:

- Set internal used map collection to maintain the uniqueness
- Map maintains the uniquness on the basis of key and not the value!
- Equals and hashcode will be called of key type
- 

HashMap<Key,value> var = new HashMap<>();
Methods:
var.put(KeyObject,ValueObject);
e.g.
var.put(3,e1);

Employee e = map.get(3);
e.setSalary(20000.00);

NOTE: get()// such method is not available in set collection

TreeMap :
- Sorting will be done based on the key type 
- key type must override the hashcode and equals of Object


============================================
HashMap :
default size is 16 i.e. 2^4
load factor is .75 => it decide when the size will grow

to identify the bucket : 
bucket index = hashcode(key)&(size-1)
above formula used to get the index in which object will go

When 75% objects filled then the size will get double and the objects which are arranged will reaarranged as per the bucket index formula.

Bucket Theory:
In order to maintain uniqueness in set and map we override the hashcode and equals methods and at the time of object insersion in the collection first hashcode gets invoked and then object will reach out to the particular bucket and then  it will check if any other object exist there,
If yes then it will invoke the equlas method
If no then object will be stored in that bucket


============================================
=> Backed collections:
- used wioth the only TreeSet and TreeMap
- headMap(a); // here new backed collection wil be created which is less than a excluding a
- tailMap(a)// here new backed collection wil be created which is greater than a including a
- subMap(a,b)// here new backed collection wil be created whichincluded the objected which are greater than a, including a and smaller than b

in TreeSet it will be sorted based on the object type
in TreeMap it will be sorted based on the Key Type

SortedSet<Integer, Employee> set1 = map.headSet(2);
SortedMap<Integer, Employee> map1 = map.headMap(2);

============================================

What is an Iterator ? What differences exist between Iterator and ListIterator ?
- An Iterator is one of the Java cursors. 
- Java Iterator is an interface that is practiced in order to iterate over a collection of Java     
object components entirety one by one. 
- It is free to use in the Java programming language since the Java 1.2 Collection framework. 
- It belongs to java.util package.

- The Java Iterator is also known as the universal cursor of Java as it is appropriate for all the classes of the Collection framework. 
- The Java Iterator also helps in the operations like READ and REMOVE. When we compare the Java Iterator interface with the enumeration iterator interface, we can say that the names of the methods available in Java Iterator are more precise and straightforward to use.

1.hasNext();
2.Next();

But in case of Ierator we can move only in forward direction i.e. single direction cursor
Also we can perform the addition or replacement ops with this cursor

ListIterator:
- Child Interface of Iterator
- The limitations of the iterators were overcomed with the ListIterator
- This has 9 methods:
hasNext();
next();
nextIndex();

hasPrevious();
previous();
previousIndex();

remove();
set(Object new)
add(Object new)
============================================

Q7. Why Collection doesn’t extend Cloneable and Serializable interfaces ?
We are not really meant to use Collection directly, so there's no need to clone or serialize it.
Unable to find the topic
============================================

Q8. What are the basic interfaces of Java Collections Framework ?
=> Collection(I)
1.List (I)
    1.1 ArrayList
    1.2 LinkList
    1.3 Vector
        1.3.1 stack
2.Set (I)
    2.1 HashSet
        2.1.1 LinkedHashSet
    2.2 SortedSet (I)
        2.2.1 NavigableSet(I)
            2.2.1.1 TreeSet
=> Map
    1 HashMap
        1.1 LinkedHashSet
    2 SortedSet (I)
        2.1 NavigableSet(I)
            2.1.1 TreeSet
============================================
Q9. What is the importance of hashCode() and equals() methods ?
=> Both are the methods of the Object class
public int hashCode();
public boolean equals();

- hasCode method will return the specific unique code in hexadecimal format for each Object we creat on heap
- equals method will compare the binary representation of how to reach objects and will return true and false accordingly

For all wrapper classes and String class these methods are overriden:
- When the content of the both the objects is equal then equals() will return true irrespective of the binary path is different
- When the content is equal and then hascode is be equal for that object in String and Wrapper classes as methods are overriden

Ethically in java, if equals method return true with the equals method then hashCode will also be true in that case 

When we create the user defiined class so we have to override the methods so else it will give the o/p as per the methods in Object class

=============================================

Q10. What is difference between Array and ArrayList ? When will you use Array over ArrayList ?
- An array is a basic functionality provided by Java, whereas ArrayList is a class of Java Collections framework. It belongs to java.util package.
- An array is a dynamically-created object. It serves as a container that holds the constant number of values of the same type. It has a contiguous memory location. Once an array is created, we cannot change its size
int arr[]=new int[3];

- In Java, ArrayList is a class of Collections framework. It implements List<E>, Collection<E>, Iterable<E>, Cloneable, Serializable, and RandomAccess interfaces. It extends AbstractList<E> class.
ArrayList<Type> arrayList=new ArrayList<Type>();

- Array can deal with the pimitives and Objects but aray list can not as it deals with only Objects

- Arrays fixed in size and its collection of homogenous data members whereas ArrayList is the collection Heterogenous members and at the same time size is also growable


We will use array List when the size is not know also if the mebers are not of the same Type
=======================================

Q11. What is difference between ArrayList and LinkedList ?

ArrayList:
When the retrieval opearation is the priority at that time arrayList is used

LinkedList:
When insersion and deletion is the priority then LinkedList wil be used

======================================================
Q12. What is Comparable and Comparator interface ? List their differences.
- Both are the function Interafces

Comparable : When we implement the comparable interface We can implement only one sorting method based on one condition 

Comparator: With the comparator Interface we can give multiple sorting methods we can create the multiple classes which implements the Comparator interface and then by creating the objects of those classes we can give sorting prefernces based on the method declared inside those classes 

======================================================

Q13. What is the purpose of garbage collection in Java, and when is it used ?
To free the memory we use garbage collectors in java, When the object becomes unreachable after it use then at that time it remains on the heap and if this kept repeating then heap will get full so to free the heap memory we use GC.

Java provides two methods System.gc() and Runtime.gc() that sends request to the JVM for garbage collection. Remember, it is not necessary that garbage collection will happen.

GC will run mandatorily in the below two cases:
1. When heap is 80% occu[ied then JVM will run the GC
2. When there is no any active thread so at that time GC which has least priority of 1 will run and try to clear the memory

Programmer also makes the objects eligible for GC once its use is finished
1. by nulling reference
2.The object also becomes eligible if it is created inside a block and the reference goes out of the scope once control exit from the block.
2. by refering the object by another ref var
3. island of objects when the instacne ref var point to the objects check the eg code for this

======================================================



