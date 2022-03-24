/*
Loan Calculator

You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

Sample Input:
20000

Sample Output:
10628

*/

import java.util.Scanner;

class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		int rem;
		for(int i=0;i<3;i++){
			rem = (amount*10)/100;
			amount = amount - rem;
		} 
		System.out.println(amount);
	}
}