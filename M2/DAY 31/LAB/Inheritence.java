package LAB;

class Parent {

  void m1() {
    System.out.println("Parent m1");
  }

  void m2() {
    System.out.println("Parent m2");
  }
}

class Child extends Parent {

  String name;

  Child(String s) {
    this.name = s;
  }

  void m2() {
    System.out.println("Child m2");
  }
}

public class Inheritence {

  public static void main(String[] args) {
    Child c = new Child("Kiran");
    Child c2 = new Child("Kiran");

    c.m1();
    c.m2();

    String s1 = "Kiran";
    String s2 = "Kiran";
    String s3 = new String("Kiran");
    String s4 = new String("Kiran");

    System.out.println(s1 == s2); //true -- immutable string objects
    System.out.println(s3 == s4); //false -- on heap
    System.out.println(s1.equals(s2)); //true as content is equal and String class has overriden equals method
    System.out.println(s3.equals(s1)); //true as content is equal and String class has overriden equals method

    Integer i1 = Integer.valueOf(10);
    Integer i2 = Integer.valueOf(10);

    System.out.println(i1 == i2); //false
    System.out.println(i1.equals(i2)); //true as content is equal and Integer class has overriden equals method

    System.out.println(c == c2); //false
    System.out.println(c.equals(c2)); //false as her echild class has not overriden the equals method and it will check with the binary representation
    //Object class ka equals check with the binary representaiton only

  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 31>javac LAB\Inheritence.java

C:\CDAC\Github\180-days-of-code\M2\DAY 31>java LAB.Inheritence
Parent m1
Child m2

C:\CDAC\Github\180-days-of-code\M2\DAY 31>
*/
