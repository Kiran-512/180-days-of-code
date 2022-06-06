class 

IncreasingDecreasingNumbers{
	
	public static void main(String... args){
		int n = 10;
		NumberPritnt(n);
	}
	
	static void NumberPritnt(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		NumberPritnt(n-1);
		System.out.println(n);
		
	}
	
}

/*
C:\CDAC\Github\180-days-of-code\M3\DAY 37\LAB>javac IncreasingDecreasingNumbers.java

C:\CDAC\Github\180-days-of-code\M3\DAY 37\LAB>java IncreasingDecreasingNumbers
10
9
8
7
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
10

*/