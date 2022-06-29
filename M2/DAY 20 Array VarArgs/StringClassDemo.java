class StringClassDemo{
  public static void main(String[]args){
   String s = "A,B,C,D";
  //javap java.lang.String  to find all the methods
  System.out.println(s.length()); //here length() is a method
  s= s.toLowerCase();
  System.out.println(s);
   s= s.toUpperCase();
   System.out.println(s);
   int index = s.indexOf("B"); //2
   System.out.println(index);
   
   int ind = s.lastIndexOf("B"); //10
   System.out.println(ind);
   
   String s2 = "   ABCD   ";
   s2 = s2.trim(); //ABCD
   System.out.println(s);
   
   char c = s2.charAt(0);
   System.out.println(c);
   
   for(int i=0;i<s2.length();i++){
     System.out.println(s2.charAt(i));
   }
   
   
   String arr[] = s.split(",") ; //split return an array
   for(String val : arr ){
     System.out.println(val);
   }
   
   s = s.replace("A","XXXX"); // will replace A with XXXX
    System.out.println(s);
  
   //substring
   String hw = "Hello World";
              //012345678910
  String sHw = hw.substring(0);
  // String sHw = hw.substring(0,5) ; // for 0 to 4
  // String sHw = hw.substring(6);
  // String sHw = hw.substring(6,11);
  }

}
