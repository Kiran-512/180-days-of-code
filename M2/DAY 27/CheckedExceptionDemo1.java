/*
As this is the checked exceptiuon so even if file is there or not there irrespective of this thing compiler will stop to do something about the possibly coming exception of filenotfoundexception and do something about ti in advance

*/

import java.io.*;

public class CheckedExceptionDemo1 {

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Main start");
    // to get teh file
    File f = new File("abcd.txt");// abc.txt is present here 
    //to read the file
    FileReader fr = new FileReader(f); //thow new FileNotFoundException();
    /* here CE with checked exception=> Error : CheckedExceptionDemo1.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        Here. Comp is telling that there might be error at runtime so it is forcing coder to write handler or do somehting about future happening exception
        COMPILER IS NOT THROWING THE ERROR,its just informing us to do something about the exception which might occur  

        Something is of below two types:
        try-catch => 
        throws => (is written at method level) used to declare the exception at method level / used t propogate the exception

        */

    //With try catch
    /*
        try{
        FileReader fr = new FileReader(f);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Release the resources");
        }
        */

    // with the throws: with this method exception wont be handle its just thrown out of that method and ignore os the next code after the exception line wont get executed

    // main method is declared with the throws keyword
    /*
        public static void main(String[] args) throws Exception_Name{
            error prone code goes inside this method;
            some other code // this wont get executed as exception is thown instead of handling here  
        }
        */
    System.out.println("main ends");
  }
}

// If abc.txt is present inside this directory 
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac CheckedExceptionDemo1.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java CheckedExceptionDemo1
Main start
main ends

C:\CDAC\Github\180-days-of-code\M2\DAY 27>

*/
// If abcd.txt is not present inside this directory and exception is not handled

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac CheckedExceptionDemo1.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java CheckedExceptionDemo1
Main start
Exception in thread "main" java.io.FileNotFoundException: abcd.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileReader.<init>(FileReader.java:75)
        at CheckedExceptionDemo1.main(CheckedExceptionDemo1.java:15)

C:\CDAC\Github\180-days-of-code\M2\DAY 27>

*/