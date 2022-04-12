import java.io.StringBufferInputStream;
import java.util.*;

 class TreeSetDemo1 {

  public static void main(String[] args) {
    TreeSet t = new TreeSet();
    // TreeSet<String> t = new TreeSet<String>();

    // TreeSet t1 = new TreeSet(c);// c-Comparator

    // TreeSet t2 = new TreeSet(v);// c- Vector Collection // here we can convert any collection into thie treeset

    // TreeSet t3 =new TreeSet(s);// s - SortedSet

    // t.add(null); //For empty treeSet null is allowed as first element, but if we add any other element after null then there will be NPE but from 1.7 version null is not allowed even as the first element
    t.add("A");
    t.add("c");
    t.add("B");
    t.add("b");
    t.add("C");
    t.add("40");
    t.add("3");
    t.add("40");
    t.add("0");
    t.add("a");
    // t.add(10); CCE / SINCE TreeSet is collection of homogeous individual objects
    // t.add(null); NPE

    System.out.println(t);

    TreeSet sb = new TreeSet();
    
    // TreeSet<StringBuffer> sb = new TreeSet<>();// for string buffer the default order is descending order  
    sb.add(new StringBuffer("A"));
    sb.add(new StringBuffer("C"));
    sb.add(new StringBuffer("B"));

    // sb.add(new StringBuffer(100));

    System.out.println(sb);
    System.out.println(sb.comparator());
    // System.out.println(sb.ascendingSet());

  }
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 30>javac TreeSetDemo1.java
Note: TreeSetDemo1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\CDAC\Github\180-days-of-code\M2\DAY 30>java TreeSetDemo1
[0, 3, 40, A, B, C, a, b, c]

C:\CDAC\Github\180-days-of-code\M2\DAY 30>
*/