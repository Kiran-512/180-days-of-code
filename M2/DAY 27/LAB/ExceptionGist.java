/*
try-catch-finally:
try{
  error prone code
}
catch(ExceptionType ref_var){
  code to manage the exception
}
finally{
  this will always be executed if if exception is not handled
}
===================================
Important points are:
Checked Exeption:
- Will not propogate automatically so will have to use throws keyword in method signature to mention the type of exception it throws
- Two option compulsarily will have to use in these exceptions to handle or throw exception
1.try-catch
2.throws
or else compiler will force us to do something about the Exceptions as these will be checked by the compiler
- If we handle the exception then it won't propogate neither we have to propogate further

Unchecked Exception:
- Will propogate automatically // hence no need to use throws
- Will have to handle this with try-catch only
*/

package LAB;

import java.io.*;

class A {

  void m1() {
    System.out.println("instance m1 mthod");
  }
}

public class ExceptionGist {

  A a; // DEFAULT VALUE OF instance ref variable => a is null

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    String s = "Kiran";
    ExceptionGist ind = new ExceptionGist(); // note the diff between exception indexoutofbound class and this userdefined class here : keypoint is 's'

    try {
      System.out.println("AIOOB try");
      arr[9] = 5;
      /*Compiler wont reach out to below line as on above line it found an exception and it exited the try block
             SO if there are two exceptions to be checked and handled then we can make the nested try catch inside any of the block try-catch-finally
             Since this exception is handled in next catch block there is not error on the below lines   
            */
      s.charAt(7);
      System.out.println("AIOOB end");
      throw new NullPointerException();// no error at this stage
      //There should not be any explicitly metioned exception with the throw keyword above the excplicitly mentioned exception with the throw if its there in the coding format that is acceptable plase check line no 54
      // throw new ArithmeticException(); // this is the compilation error as we have already declared one exception with the throw keyword
      // throw new FileNotFoundException();// this is CE as this is the checked exception try and catch block OR throws at method level is must for this exception
      // System.out.println("Unreachable code wont get compiled AND this will give CE IF WRITTEN BELOW Throw even if throw catched or not catched but normal this wont give any error if normaly exception found in code");
    } catch (ArrayIndexOutOfBoundsException i) {
      // System.out.println(i.getMessage());
      // i.printStackTrace();
      System.out.println("AIOOB Catched");
      // throw new ArithmeticException();// with this line all line below wont get executed hence there will be CE with below code in unreachable
      //throw i => throw new ArithmeticException();
      try {
        System.out.println("SIOOB Try");
        s.charAt(7);
      } catch (StringIndexOutOfBoundsException str) {
        System.out.println("SIOOB Catched");
      } finally {
        System.out.println("SIOOB Finally");
      }
      try {
        try {
          System.out.println("Checked IOException thrown");
          throw new IOException();
        } catch (Exception e) {
          System.out.println("IOException catched");
          try {
            System.out.println("classnotfound thrown");
            throw new ClassNotFoundException();
          } catch (Exception a) {
            System.out.println("classnotfound also catched");
          } finally {
            System.out.println("classnotfound finally");
          }
        } finally {
          System.out.println("IOException finally");
        }
        ind.a.m1(); // note here all the nested try-catch is written above gets executed this exception or error prone code
      } 
      /*catch(NullPointerException n){}*/ // If the NPOE is catched here then it will aslo execute the line no 97 and 103 and won't show any exception
      finally {
        System.out.println("NPE Finally done");// finally will get executed always even if exception handled or not
      }
      System.out.println("Unreachable code"); // this is the unreachable code as above exception is not handled but finally for this excpetion got executed// notice there is no CE
    } finally {
      System.out.println(
        "main Finally executed as the exception is catched hence below line is also got excuted"
      );
    }
    System.out.println("kiran"); // if the exceptionion is not catched in catch block OR if we only use try-finally then we can not write the code below finally as it will throw CE with the reason as unreachale code, here there is no error we have catched he exception in catch block but code wont run as the NPE is not catched
  }
}
// Since the exception is not handled hence its showing exception in main thread in the end of the OP
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 27>javac LAB\ExceptionGist.java

C:\CDAC\Github\180-days-of-code\M2\DAY 27>java LAB.ExceptionGist
AIOOB try
AIOOB Catched
SIOOB Try
SIOOB Catched
SIOOB Finally
Checked IOException thrown
IOException catched
classnotfound thrown
classnotfound also catched
classnotfound finally
IOException finally
NPE Finally done
main Finally executed as the exception is catched hence below line is also got excuted
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "LAB.A.m1()" because "<local3>.a" is null
        at LAB.ExceptionGist.main(ExceptionGist.java:68)

*/
