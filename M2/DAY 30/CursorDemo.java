import java.util.*;

public class CursorDemo {

  public static void main(String[] args) {
    Vector v = new Vector();

    Enumeration e = v.elements();
    Iterator itr = v.iterator();
    ListIterator litr = v.listIterator();

    ArrayList a = new ArrayList();

    // Enumeration e1 = a.elements();//Enumeration can not be implemented for any class other than legacy classes
    Iterator itr1 = a.iterator();
    ListIterator litr1 = a.listIterator();

    System.out.println(e.getClass().getName());
    System.out.println(itr.getClass().getName());
    System.out.println(litr.getClass().getName());

    // System.out.println(e1.getClass().getName());
    System.out.println(itr1.getClass().getName());
    System.out.println(litr1.getClass().getName());
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 30>javac CursorDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 30>java CursorDemo
java.util.Vector$1
java.util.Vector$Itr
java.util.Vector$ListItr
java.util.ArrayList$Itr
java.util.ArrayList$ListItr

C:\CDAC\Github\180-days-of-code\M2\DAY 30>
*/