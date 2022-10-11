import java.util.HashSet;
import java.util.Scanner;

class PanagramDemo{

	public static void main(String... args){
	
	String s = "some things are really good which motivates us!";
	//panaram String
	System.out.println(DemoMethods.isPanaram(s.toLowerCase()));
	
	//anaram string
	String s1 = "sdasdasd";
	String s2 = "Kiran";
	System.out.println(DemoMethods.isAnaram(s1,s2));	
	
	//find intersection of array 
	
		int[] array = DemoMethods.printIntersection(new int[]{1,2,3,4},new int[]{4,5,6,1});
		for(int i =0; i<array.length;i++)
		{	
		if(array[i]!=0)
		System.out.println(array[i]);
		}
	
	//find the longest substring
	s1 = "abcdcfpsklpsa";	
	s = DemoMethods.findLongestSubString(s1);
	System.out.println(s);
	
	
		//stack implementation
	
	StackDemo stack = new StackDemo(10);
	

	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(20);
	
	for(int i=0;i<stack.arr.length;i++)
		System.out.println(stack.arr[i]);
	
	
	//find the occurences:
	Scanner sc = new Scanner(System.in);
	s="Hello World";
	char ch = sc.next().charAt(0);
	
	System.out.println(DemoMethods.occurences(s,ch));
	
	}
	
	//
	
	
}
class DemoMethods{
	
	static int occurences(String s,char ch){
		return s.length() - s.replace("l","").length();	
	}
	
	
	static boolean isPanaram(String s){
		
		if(s.length()<26) return false;
		else{
			
			for(char ch = 'a'; ch<'z';ch++){	
				if(s.indexOf(ch)<0) return false;
			}
		}
		return true;
	}
	
	static boolean isAnaram(String s1,String s2){
		
		int sum1=0,sum2=0;
		for(int i=0;i<s1.length();i++){
			sum1+=s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++){
			sum2+=s2.charAt(i);
		}
		if(sum1 == sum2)return true;
		else return false;
		
	}
	
	static int[] printIntersection(int[] a1,int[] a2){
		
		HashSet<Integer> set = new HashSet<>();

		int[] array = new int[a1.length + a2.length];
		
		for(int i=0;i<a1.length;i++){
			set.add(a1[i]);
		}
		for(int i=0;i<a2.length;i++){
			boolean isAdded = set.add(a2[i]);
			if(!isAdded)
				array[i] = a2[i];
		}
		return array;
	}
	
	static String findLongestSubString(String s){
	
		HashSet<Character> set = new HashSet<>();
		
		String longestTillNow="";
		String longestOverall="";

		for(int i=0;i<s.length();i++){
			
			char ch = s.charAt(i);
			if(set.contains(ch)){
				longestTillNow = "";
				set.clear();
			}
			longestTillNow+=ch;
			set.add(ch);
			
			if(longestTillNow.length()>longestOverall.length()){
				longestOverall = longestTillNow;
			}
			
		}
		return longestOverall;
	}
	
	
	
}

class StackDemo{
	
	int[] arr;
	int top;
	
	StackDemo(){
		arr= new int[100];
		top=-1;
	}
	
	StackDemo(int MAX_SIZE){
		arr= new int[MAX_SIZE];
		top=-1;
	}
	
	boolean isEmpty(){
		if(top==-1) return true;
	return false;
	}
	
	boolean isFull(){
		if(top == arr.length-1) return true;
		return false;
	}
	
	int pop(){
		int i=0;
		if(isEmpty())
			System.out.println("Stack is empty!");
		else
			i = arr[top--];
		return i;
	}
	void push(int x){
		if(isFull())
			throw new StackOverflowError("Stack is emtpy");
		else
			arr[++top]=x;
	}
	
}

class TwoStackDemo{
	
	int[] arr;
	int top1;
	int top2;
	TwoStackDemo(){
		
	}	
	TwoStackDemo(int n){
		arr =new int[n];
		top1=-1;
		top2=n;
	}
	boolean isEmpty(){
		if(top1==-1 && top2 == n)
			return true;
		return false;
	}
	boolean isFull(){
		if(top1+top2=n-1 || top1=n-1 || top2 = -1)
			return true;
		return false;
	}
	int pop1(){
		if(isEmpty())
		{	System.out.println("Stack is empty!")
		return}
		return arr[top1--];
		
	}
	void push1(int x){
		if(isFull())
				throw new StackOverflowError();
		arr[++top1] = x;
	}
	int pop2(){
		if(isEmpty())
		{	System.out.println("Stack is empty!")
		}
		return arr[top1--];
		
	}
	void push2(int x){
		if(isFull())
				throw new StackOverflowError();
		arr[++top1] = x;
	}	
}