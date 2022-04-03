/*
String literals are saved in String pull

here s1 == s2; =>wil always compare the binary representation
but s1.equals(s2); => method will always compare the content

*/

class StringDemo {

  public static void main(String[] args) {
    String s1 = "Kiran";
    String s2 = "Kiran";

    System.out.println(s1);
    System.out.println(s2);

    //Validation of the line : String literals are immutable

    System.out.println(s1 == s2);//true as both the string are in the string pull

    String s3 = new String();
    System.out.println(s3);// blank space

    String s4 = new String("Kiran");
    System.out.println(s1 == s4);//false as s4 is on heap due to use of new and s1 is in the string pull
    System.out.println(s4.equals(s1));//true : this will check the content of the obejcts an not he binary representation i.e. path


    // lietrals are immutable 
    //here after assigning new value to s1, earlier object with the "Kiran" will have no ref var referering to it but we can assign to it if we want  
    s1 = "AKSHAY";
    System.out.println(s1);
    String s5 = "Kiran";

    //Manipulation to be avoided
    String s6 = "Ki"+"ran"; // this will be created on heap and not on the string pull
    System.out.println(s5 == s6); // false as ki and ran are the diff literals
    System.out.println(s6);

    //changes on heap


  }
}