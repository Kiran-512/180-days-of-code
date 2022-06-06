//Command Line arguments:


/*
Flow of execution:
Identification of static block
execute static block and var
check for main method if yes ok! if No, RE: 
*/

/*class MainMDemo {
    static{
        System.out.println("Static method");
        System.exit(0);
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
*/
/*
C:\CDAC\Github\180-days-of-code\Practice\Basics>javac MainM.java

C:\CDAC\Github\180-days-of-code\Practice\Basics>java MainMDemo
Static method

C:\CDAC\Github\180-days-of-code\Practice\Basics>
*/

/*class MainMDemo {
    static{
        System.out.println("Static method");
        System.exit(0);
    }
}*/
/*
C:\CDAC\Github\180-days-of-code\Practice\Basics>javac MainM.java

C:\CDAC\Github\180-days-of-code\Practice\Basics>java MainMDemo
Error: Main method not found in class MainMDemo, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

*/
/*class MainMDemo {
    static{
        System.out.println("Static method");
    }
}*/
/*
C:\CDAC\Github\180-days-of-code\Practice\Basics>javac MainM.java

C:\CDAC\Github\180-days-of-code\Practice\Basics>java MainMDemo
Error: Main method not found in class MainMDemo, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/

/*
class MainMDemo {
    public static void main(String[] args) {
        System.out.println("Str[]");
    }
    public static void main(int[] args) {
        System.out.println("Int[]");
    }
}
*/
/*
C:\CDAC\Github\180-days-of-code\Practice\Basics>javac MainM.java

C:\CDAC\Github\180-days-of-code\Practice\Basics>java MainMDemo
Str[]
*/