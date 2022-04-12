/*

*/

import java.util.Vector;

public class VectorDeno {

  public static void main(String[] args) {
    Vector<String> list3 = new Vector<>();

    list3.add("Kiran");
    list3.add("A");
    list3.add("B");
    list3.add("Kiran");
    list3.add("B");
    list3.add(3, "B");
    list3.add("F");
    list3.add("F");

    // list3.add(30,"B");//RTE as no such index available

    System.out.println(list3);

    // remove()
    list3.remove(2);
    list3.remove("B");
    list3.remove(String.valueOf("Kiran"));

    System.out.println(list3);

    System.out.println(list3.indexOf("F")); //3
    System.out.println(list3.lastIndexOf("F")); //4

    for (String s : list3) {
      System.out.println(s + " ");
    }
  }
}
