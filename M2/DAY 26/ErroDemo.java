/*
Error 
Errors are related to memory locations 

OutOfMemoryError 
StackOverflowError

Normally we do not write the handler for ERROR's but if we want we can write try catch finally for ERROR's too!

*/

class OOME{

}

class ErroDemo{

    public static void main(String[] args) {
      while (true) {
          new OOME(); // Here in this case, this error will not come easily as JVM will clear the object with GC on reaching threshold
      }
    }

}

/*
Exception in thread "main" java.lang.StackOverflowError
*/
/*
class ErroDemo{

    public static void main(String[] args) {
        main(null);
        System.out.println("Reached here!!");// wont reach here as to run this code there wont be any space and stakc will overflow before compiler comes on this line
    }

}*/