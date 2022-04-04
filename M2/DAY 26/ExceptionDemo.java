/*
Error vs Exception:
Errors are related to memory locations and Exceptions are

OutOfMemoryError 

Here in this case, this error will not come easily as JVM will clear the object with GC on reaching threshold

*/

class OOME{

}

class ExceptionDemo{

    public static void main(String[] args) {
      while (true) {
          new OOME();
      }
    }

}

/*
Exception in thread "main" java.lang.StackOverflowError
*/
/*
class ExceptionDemo{

    public static void main(String[] args) {
        main(null);
        System.out.println("Reached here!!");
    }

}*/