/*
public class java.util.ArrayList<E> extends java.util.AbstractList<E> implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {
  transient java.lang.Object[] elementData;
  public java.util.ArrayList(int);
  public java.util.ArrayList();
  public java.util.ArrayList(java.util.Collection<? extends E>);
  public void trimToSize();
  public void ensureCapacity(int);
  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public int indexOf(java.lang.Object);
  int indexOfRange(java.lang.Object, int, int);
  public int lastIndexOf(java.lang.Object);
  int lastIndexOfRange(java.lang.Object, int, int);
  public java.lang.Object clone();
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  E elementData(int);
  static <E> E elementAt(java.lang.Object[], int);
  public E get(int);
  public E set(int, E);
  public boolean add(E);
  public void add(int, E);
  public E remove(int);
  public boolean equals(java.lang.Object);
  boolean equalsRange(java.util.List<?>, int, int);
  public int hashCode();
  int hashCodeRange(int, int);
  public boolean remove(java.lang.Object);
  public void clear();
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
  protected void removeRange(int, int);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  boolean batchRemove(java.util.Collection<?>, boolean, int, int);
  public java.util.ListIterator<E> listIterator(int);
  public java.util.ListIterator<E> listIterator();
  public java.util.Iterator<E> iterator();
  public java.util.List<E> subList(int, int);
  public void forEach(java.util.function.Consumer<? super E>);
  public java.util.Spliterator<E> spliterator();
  public boolean removeIf(java.util.function.Predicate<? super E>);
  boolean removeIf(java.util.function.Predicate<? super E>, int, int);
  public void replaceAll(java.util.function.UnaryOperator<E>);
  public void sort(java.util.Comparator<? super E>);
  void checkInvariants();
  static {};
}
*/



import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList list = new ArrayList(); //Non-Generic Collections

    list.add(10); //1
    list.add(Integer.valueOf(10)); //2
    list.add(0, 10); //3
    list.add(new Integer(10)); //4
    list.add(null); //5

    System.out.println(list.size());
    System.out.println(list.get(0));

//We can not make collection of int primitives we will have to use theWrapper Classes

    ArrayList<Integer> list2 = new ArrayList<Integer>();
    // ArrayList list2 = new ArrayList<Integer>(); // after 1.6 ver this is acceptable
    // ArrayList<Integer> list3 = new ArrayList<>();// this is also allowed

    //add(Object) and add(index,Object)

    list2.add(10);//O
    list2.add(30);//1
    list2.add(Integer.valueOf(40));//2
    list2.add(10);//3
    list2.add(50);//4
    list2.add(5,60); // allowed

    System.out.println( "Hashcode is "+ list2.get(0).hashCode());
    System.out.println( "Hashcode is "+ list2.get(3).hashCode());
    System.out.println(list2.get(0).equals(list2.get(3)));
    System.out.println(list2.get(0).equals(list2.get(2)));

    /*.IndexOutOfBoundsExceptioN We can not used the Index which is not specified in array list and When we add
     at particular index it will shift the object at that palce to the next index and so on and so forth 
    We can add the upcoming index but not beyond that
    */
    // list2.add(6,10);//RTE : IOOBE
    System.out.println(list2);

    // remove(index); and remove(Object);

    // list2.remove(0);
    System.out.println(list2);
    // list2.remove(50);//this will trhow RunTimeException as 5o is index which is not here in ou arraylist
    list2.remove(Integer.valueOf(50));//accpted over the new Interger(50);
    System.out.println(list2);
    list2.remove(new Integer(10));//this will remove the object first the sequence in case of duplicate
    System.out.println("After removing object with the value 10 "+ list2);


    //contains(Object); will return true or false// will search if object exits in the list of not

    boolean cont = list2.contains(40);
    System.out.println(cont);
    boolean cont1 = list2.contains(Integer.valueOf(10));
    System.out.println(cont1);

    //set(index,element)

    list2.set(0, 30);
    System.out.println(list2);


    for (int i = 0; i < list2.size(); i++) {
        System.out.print(list2.get(i)+" ");
    }

    System.out.println();//new line

    for (Integer val : list2) {
        System.out.print(val + " ");
    }
    System.out.println();

    System.out.println("Contains " + list2.contains(30));

ArrayList <String> list3 = new ArrayList<>();

    list3.add("Kiran");
    list3.add("A");
    list3.add("B");
    list3.add("Kiran");
    list3.add("B");
    list3.add(3,"B");
    list3.add("F");
    list3.add("F");

    // list3.add(30,"B");//RTE as no such index available

    System.out.println(list3);

    // remove()
    list3.remove(2);
    list3.remove("B");
    list3.remove(String.valueOf("Kiran"));

    System.out.println(list3);

    System.out.println(list3.indexOf("F"));//3
    System.out.println(list3.lastIndexOf("F"));//4

    for (String s : list3) {
        System.out.println(s + " ");
    }

  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 30>javac ArrayListDemo.java
ArrayListDemo.java:12: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
    list.add(new Integer(10)); //4
             ^
ArrayListDemo.java:47: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
    list2.remove(new Integer(10));//this will remove the object first the sequence in case of duplicate
                 ^
Note: ArrayListDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
2 warnings

C:\CDAC\Github\180-days-of-code\M2\DAY 30>java ArrayListDemo
5
10
[10, 30, 40, 10, 50, 60]
[10, 30, 40, 10, 50, 60]
[10, 30, 40, 10, 60]
After removing object with the value 10 [30, 40, 10, 60]
true
true
[30, 40, 10, 60]
30 40 10 60
30 40 10 60 [Kiran, A, B, B, Kiran, B, F, F]
[A, Kiran, B, F, F]
3
4
A
Kiran
B
F
F

*/