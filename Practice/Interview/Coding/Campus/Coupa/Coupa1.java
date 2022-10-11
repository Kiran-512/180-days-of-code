/*
//Problem 1
5 6
5 4 3 2 1 size of array is N

6 pairs with 5,4/5,3/5,2/4,3/4,2/3,2 
sum is >=K
20+15+10+12+8+6

OP is 6 71 // No of pairs and SUM
*/

import java.util.*;

class Coupa1{

	static void productivePairs(int N, int[] A, int K)
	{

		int count=0, sum=0;
		for(int i=0;i<N-1;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(i!=j && A[i]*A[j]>=6)
				{
					System.out.println(A[i]+" "+A[j]);
					count++;
					sum+=A[i]*A[j];
				}
			}
		}
		System.out.println(sum+"  "+count);
	}
	
	public static void main(String... args)
	{
		int N,K;
		int[] A;
		Scanner sc = new Scanner(System.in);	
		System.out.println();
		System.out.println("Enter the size of an array :");		
		N= sc.nextInt();
		A = new int[N];

		for(int i =0;i<N;i++)
		{
			A[i] =sc.nextInt();
		}

		System.out.println("Enter the value of K : ");		
		K= sc.nextInt();
		productivePairs(N,A,K);
	}


}
