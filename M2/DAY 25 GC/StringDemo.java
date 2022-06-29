/*
String literals are stored in String pull which is part of heap ONLY
Purpose of string pool is to reuse the string Objects if created again

here s1 == s2; => wil always compare the binary representation
but s1.equals(s2); => method will always compare the content


*/

class StringDemo {

  public static void main(String[] args) {
    String s1 = "Kiran";
    String s2 = "Kiran";

    System.out.println(s1);
    System.out.println(s2);

    //Validation of the line : String literals are immutable

    System.out.println(s1 == s2); //true as both the strings are in the string pull

    String s3 = new String();
    System.out.println(s3); // blank space as toString() method is overriden in the String class or else it would have printed the className@hashcode

    String s4 = new String("Kiran");
    System.out.println(s1 == s4); //false as s4 is on heap due to use of new and s1 is in the string pull
    System.out.println(s4.equals(s1)); //true : this will check the content of the obejcts an not he binary representation i.e. path even if one string is in the string pool and another in heap 

    // lietrals are immutable
    //here after assigning new value to s1, earlier object with the "Kiran" will have no ref var referering to it but we can assign to it if we want
    s1 = "AKSHAY";
    System.out.println(s1);
    String s5 = "Kiran";

    //Manipulation to be avoided
    String s6 = "Ki" + "ran"; // this will be created on the string pull
    System.out.println(s5 == s6); // true 
    System.out.println(s6);
	
	String s7 = "Ki";
	String s8 ="ran";
	String s9 = s7 + s8;// this will be created on heap and not in the string pool
	System.out.println(s5 == s9); // false as ki and ran are the diff literals
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 25>java StringDemo
Kiran
Kiran
true

false
true
AKSHAY
true
Kiran
false

C:\CDAC\Github\180-days-of-code\M2\DAY 25>

*/ 