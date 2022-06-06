/*
In this case compiler wont forced coder to write handler code for exception and program gets terminated after exception line and next line s of code wont get exceuted

handler code:
try{
    Error prone code
}
catch(className ref_var){
    EXCEPTION HANDLING CODE
}
finally{

}

It is mandatory to write either catch or finally with the try
If all three used then it must be in a sequence try-catch()-finally

catch() => Handler
*/

class A{

}
class B extends A{

}

public class ClassCasteExceptionDemo {
    
    public static void main(String[] args) {
        System.out.println("Before");
        A a = new A();

        //B b = (B)a;

        try{
        B b = (B)a;

        }
        catch(ClassCastException e){
            System.out.println(e.getMessage());// used to show the message of exception
            e.printStackTrace();//this should not be written inside print statement
            System.out.println("Invalid Downcasting");
            System.out.println("Ref var can hold the object of the same class or child class or null");
        }

        System.out.println("After");

    }
}

// O/P Without handler
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 26>javac classCasteExceptionDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 26>java classCasteExceptionDemo
Before
Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
        at classCasteExceptionDemo.main(classCasteExceptionDemo.java:20)

*/

//O/P With handler code
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 26>javac classCasteExceptionDemo.java

C:\CDAC\Github\180-days-of-code\M2\DAY 26>java classCasteExceptionDemo
Before
class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
        at classCasteExceptionDemo.main(classCasteExceptionDemo.java:37)
Invalid Downcasting
Ref var can hold the object of the same class or child class or null
After

C:\CDAC\Github\180-days-of-code\M2\DAY 26>
*/