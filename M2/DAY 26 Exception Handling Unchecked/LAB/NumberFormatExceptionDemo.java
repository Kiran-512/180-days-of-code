package LAB;

class NumberFormatExceptionDemo{
    public static void main(String[] args) {
        String s="Kiran";
        try{
            Integer i = new Integer(s);
        }
        catch(Exception e){
            System.out.println("catched here");
        }
        //If parent type Exception is passed as an an argument to the catch block then we must remove the child of the passed Parent type, WHICH ARE declared below parent type catch block as that catch block will be unreachable and will not hold any relevance!
        /*catch(NumberFormatException e){

        }
        catch(RuntimeException e){

        }*/
        finally{
            System.out.println("wILL ALWAYS EXECUTE ERROR AYE NA AYE");
        }
    }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 26\LAB>javac NumberFormatExceptionDemo.java
NumberFormatExceptionDemo.java:7: warning: [removal] Integer(String) in Integer has been deprecated and marked for removal
            Integer i = new Integer(s);
                        ^
1 warning

C:\CDAC\Github\180-days-of-code\M2\DAY 26\LAB>java NumberFormatExceptionDemo
Error: Could not find or load main class NumberFormatExceptionDemo
Caused by: java.lang.NoClassDefFoundError: LAB/NumberFormatExceptionDemo (wrong name: NumberFormatExceptionDemo)

C:\CDAC\Github\180-days-of-code\M2\DAY 26\LAB>

*/