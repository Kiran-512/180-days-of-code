
/*
Why the O/P at line no 38 and 39 is not changed to 1000 and 1000?

*/
class Student {

  int x;
  int y;

    Student() {
        // this(10,20);
       System.out.println("Values for X and Y changed with the default Construct!");
       x=1000;
       y=1000;
       System.out.println("The values for X and Y are " + x + " " + y);
    }
    Student(int x,int y) {
        this();
        this.x = x;
        this.y = y;
    }
    {
        x=100;
        y=200;
    }
  }
  
  class StudentDemo {
  
    public static void main(String[] args) {
      Student s1 = new Student();
      
      System.out.println(s1.x);
      System.out.println(s1.y);
      
      Student s2 = new Student(20,30);

      System.out.println(s2.x);
      System.out.println(s2.y);

      s1=s2;

      System.out.println(s1.x);
      System.out.println(s1.y);

    }
  }

/*
C:\CDAC\Github\180-days-of-code\Practice\Basics>javac ConstructorBasic.java

C:\CDAC\Github\180-days-of-code\Practice\Basics>java StudentDemo
Values for X and Y changed with the default Construct!
The values for X and Y are 1000 1000
1000
1000
Values for X and Y changed with the default Construct!
The values for X and Y are 1000 1000
20
30
20
30

*/

/*class Student {

  String name;
  int id;
  int age;
  String email;
  static String course = "PG-DAC";

  Student() {
    System.out.println(
      "Paramateralised with zero args Executed, not the default ONE!"
    );
  }

  Student(String name, int id, int age, String email) {
    //this();
    this.name = name;
    this.id = id;
    this.age = age;
    this.email = email;
  }

  void setData(String name, int id, int age, String email) {
    //this();// this is the firt statement in the constructor ONLY
    this.name = name;
    this.id = id;
    this.age = age;
    this.email = email;
  }

  void getData() {
    System.out.println(
      this.name + " " + this.id + " " + this.age + " " + this.email
    );
  }
}

class StudentDemo {

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Kiran", 2205203, 25, "kiranyadav267@gmail.com");
    s1.setData("Akshay", 2202304, 25, "akshayshinde@gmail.com");
    s1.getData();
    s2.getData();
  }
}

/*
C:\CDAC\Github\180-days-of-code\Practice\Basics>javac ConstructorBasic.java

C:\CDAC\Github\180-days-of-code\Practice\Basics>java StudentDemo
Paramateralised with zero args Executed, not the default ONE!
Akshay 2202304 25 akshayshinde@gmail.com
Kiran 2205203 25 kiranyadav267@gmail.com

*/