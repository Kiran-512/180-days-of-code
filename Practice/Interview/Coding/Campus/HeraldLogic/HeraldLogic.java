/*
N - No of Books
R - binary string - 1 -to read and 0 not to read
K - binary string - 1 to keep and 0 forget

if Ri = 1 then read or else dont read
if Ki = 0 then don't keep or else keep! 

3
111
110

*/

import java.util.*;
import java.io.*;
import java.lang.Math;

class Main
{
	
  public static String recentBooks(int TotalBooks,String ToReadOrNot,String ToKeepOrNot)
  {
    //this is default OUTPUT. You can change it.
    String result ="";
    int recentlyReadIndex=0;
    int[] array = new int[TotalBooks];
    int arrayIndex=0;
    array[arrayIndex]=-1;
	
    //write your Logic here :
      for(int i=0;i<TotalBooks;i++)
      {
        if(ToReadOrNot.charAt(i) == '1' && ToKeepOrNot.charAt(i)=='1')
        {
			recentlyReadIndex=i;
			array[++arrayIndex]=recentlyReadIndex;
        }else if(ToReadOrNot.charAt(i)!='1')
        {
          continue;
        }
        else if(ToReadOrNot.charAt(i) == '1' && ToKeepOrNot.charAt(i)=='0'){
            array[arrayIndex]=recentlyReadIndex-1;
        }
      }

      for(int i=0;i<array.length;i++)
      {
        result+=(array[i]+" ");
      }

      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt ();

    String R = sc.next ();
    String K = sc.next ();
    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(recentBooks(N,R,K));
  }
}
/*
C:\CDAC\Github\180-days-of-code\Practice\Interview\Coding\Campus\HeraldLogic>java Main
3
111
110
-1 0 0
C:\CDAC\Github\180-days-of-code\Practice\Interview\Coding\Campus\HeraldLogic>
*/