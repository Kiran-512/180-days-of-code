import java.util.Scanner;

public class WordCount {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s =sc.nextLine();

    System.out.println(s.length());
    int count =0;
    for(int i=0; i<s.length();i++){

        if(s==" " || s=="\n" || s== "\t" || s == "\r"){
            count++;
        }
    }
    System.out.println(count);

    // String[] word = new String[2];
    // int count = 0;

    // for (int i = 0; i < word.length; i++) {
    //   word[i] = sc.next();
    //   count++;
    // }
    // System.out.println(count);
    // System.out.println(word.length);
    // System.out.println(word[0]);
    // System.out.println(word[1]);

  }
}
