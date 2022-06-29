class StringClass {
    public static void main(String[] args) {

        String s = "A,B,C,D,E,,A,B,C,D,E,F";
        System.out.println(s.length());
        s = s.toLowerCase();
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println(s);

        System.out.println(s.indexOf("A"));//0

        int index= s.indexOf("B");
        System.out.println(index);//2

        int lastIndex = s.lastIndexOf("B");
        System.out.println(lastIndex);//13

        //charAT();
        System.out.println(s.charAt(0));//A

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));//A,B,C,D,E,,A,B,C,D,E,F
        }
        System.out.println();

        //split();
        String[] arr =s.split(",");
        for (String str : arr) {
            System.out.print(str);//ABCDEABCDEF
        } 
/*
Split() - Creats an array
The string "boo:and:foo", for example, yields the following results with these expressions:
Regex	Result
:	`` { "boo", "and", "foo" }}
o	`` { "b", "", ":and:f" }}
*/

        System.out.println("substring");
        String n = "abcd:chdg:dhskh:|,sdhsdsdks,skjhd......a,s:::sd";
        System.out.println(n.split(":|,"));
        String[] arrr = n.split(":|,");
        for(String st :arrr){
            System.out.println(st);
        }

        System.out.println("substring");

        System.out.println();

        // replace();
        System.out.println(s.replace("A","123"));//123,B,C,D,E,,123,B,C,D,E,F

        //substring();
        String hw = "Hello World";
        String sbhw = hw.substring(0,6);
        System.out.println(sbhw);//Hello 

        System.out.println(hw.substring(6));// this will print all the string ahead from 6th index here it world

        StringClass sc = new StringClass();
        StringClass sc1 = new StringClass();

        String Sg = "Kiran";
        String ns = "Kiran";
        System.out.println(Sg.equals(ns));
        System.out.println(sc.equals(sc1));

    }
    
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 20>javac StringClass.java

C:\CDAC\Github\180-days-of-code\M2\DAY 20>java StringClass
22
a,b,c,d,e,,a,b,c,d,e,f
A,B,C,D,E,,A,B,C,D,E,F
0
2
13
A
A,B,C,D,E,,A,B,C,D,E,F
ABCDEABCDEFsubstring
[Ljava.lang.String;@54bedef2
abcd
chdg
dhskh
|
sdhsdsdks
skjhd......a
s


sd
substring

123,B,C,D,E,,123,B,C,D,E,F
Hello 
World
true
false

C:\CDAC\Github\180-days-of-code\M2\DAY 20>
*/