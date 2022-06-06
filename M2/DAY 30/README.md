Notes for the day
=====================

For interview perspective must know at least 6 methods of Object class with their implementation

If we are not able to answer the metho then tell IO that with the help of javap we can check these things and use it but do not quit try for diff approcahes

=====================
Collection and Generics

When we do not specify the name for the collection then its non generic collection and if we named it then it becomes the Generic collection 

Uniqueness :
As per java, if two objects are equal with the equals method then their hashcode must also be same its called as Uniquenes

Collections come in four basic flavors:
■ Lists Lists of things (classes that implement List).
■ Sets Unique things (classes that implement Set).
■ Maps Things with a unique ID (classes that implement Map).
■ Queues Things arranged by the order in which they are to be processed. 

List (interface) (Ordered list)
- ArrayList 
- LinkedList
- Vector

Set (interface)
 - Hashset => Linkedhashset(AssestClass)
 - sortedSet(interface) => NagigableSet(interface) => TreeSet

Map (interface)
 - HashMap => LinkedhashMap(AssestClass)
 - sortedMap(interface) => NagigableMap (interface) => TreeMap
 - HashTable

========================

List:
- Only this type deals with the index, we will not get the idex in map and set!

Collection is devided into four types:
1.Ordered :
- iF WE GET THE DATA In the same ordered as we inserted

2.Unordered
- iF WE GET THE DATA In the diff ordered than we inserted

3.Sorted
- If we get the data sorted with some type(ascending/descending etc) than we inserted

4.Unsorted
- If we do not get the data sorted with some type(ascending/descending etc) than we inserted

===========================
List (interface) (Ordered list)
- Only collection that works on Index

=> ArrayList 
- If retrieval is the require,emt then arraylist is the best choice
- if removal or the insertion is the freq operation then array list is the worst choice
- diff between array and arraylist is that array';s size is fixed but for arraylist size is not fixed
- prefered for faster iteration
- prefered where the random insertions and deletion is not the requirement
e.g.
Lets say when we add elements in a sequence like in case of array so the every element will be added at last index and loop will continue

=> LinkedList
- This has different nodes and if suppose we want to add in between the tow nodes then LinkesList is prefered
- To insert in between below steps:
1.Create new node 
2.The previous node will point to the created node 
3.Then created no will point to the next node

=> Vector
- In multithreaded environment in order to access the collection in a synchronised way then this type is prefered
(Synchronised way - Access one at a time, without creating disturbance)
- 
===========================
Set (interface) // (Uniqueness)
 => Hashset  (class)
  - uniqueness : YES
  - Order :  No

 => Linkedhashset(Class)
  - Uniqueness : YES
  - Order :  NO

  => TreeSet (class) 
  - Uniqueness : YES
  - Order :  NO
===========================
=>Map:
UNIQUENESS : YES
===========================
Except the TreeSet AND TreeMap, all other collection classes can accept the heterogenous elements!
===========================
Colelction belongs to java.util package:

=>Collection interface methods:
add(Object)
remove(Object)// this removes based on object and not based on the index
contains(Object)
size(Object)


=> Array List Methods
Methods of collection interface + below
add(index,Object) = used to add ramdomly
remove(index) = 
get(index) => to get teh value at index
indexOf(Object) => to get the index of particular object // if bject is not present then it will return -1
lastindexOf(Object) => this will return the index if the object is repeated twice so it will return the last index at which it occured

=> Linked List Methods
Methods of collection interface + below
peek() // used to retrieve the data // will give elemtn but not return too
poll() // will give element and will remove that ob too (here We use => get()+remove())
offer(Object) // adds to the list in the end 
pollFirst(),pollLast();
peekFirst(); peekLast(), 
addFirst(Object),addLast(Object) //add(0,Obj)
removeFirst();removeLast()
getFirst()getLast();

These behaviours will find in LinkedList and not in ArrayList:
stack behaviour :LIFO
Queue behaviour :FIFO 
=============================
When we remove the element from the arrayList it will be removed and the next element will shift to that place
In case of LinkedList we just connects the nodes of the previous element to the node of the next element by skipping the inbetween element:    

Vector and ArraList is similiar its just that vector works in Synchonised way

=============================
=> Set (interface)
 - Hashset(class) => Linkedhashset(AssestClass)
 - sortedSet(interface) => NagigableSet(interface) => TreeSet(class)

=============================
MAX_HEAP and MIN_HEAP to check the heap size


=============================
We use collection to hold and transfer the objects from one location to another location(container), 
to provide such support every collection class by default implements serialisable and cloneable 
interfaces

=============================
A marker interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information about the object. A marker interface is also called a tagging interface.

Random Access is the marker interafce available in java.util package: 
=============================
Cursor:

NOTE : All cursor are interfaces so how can we create the obejct for interafces?
ANS : Basically anonymous inner classes implements these interafces and we ae creating the objects of anonymous inner classes  

ListIterator:
WITH ENUMERATOR AND ITERATORS WE CAN NOT MOVE BACKWARD Hence to overcomet his thing son comes with the new cursor:

This has total 9 method including 3 methods of parent:
public boolean hasNext();
public object next();
public void remove();

public boolean hasPrevious();
public object previous();
public int previousIndex();

public void remove();//current object will be removed
public void add(Object o)//current object will be added
public void set(Obj o)//current object will be set

=============================

Assignments:
- To impleemtn stack and queue using arraylist and linkedlist methods
- WAP to create an ArrayList of unique Objects
