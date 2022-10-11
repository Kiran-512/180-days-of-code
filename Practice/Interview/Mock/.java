class Person {
	
	static void m1(String[] arr, int a){
	

			System.out.println(arr);//[Ljava.lang.String;@5acf9800			
			System.out.println(arr.length);//		0	
	
	}

	static void m2(String[] arr, int a){
	

			System.out.println(arr);//[Ljava.lang.String;@5acf9800			
			System.out.println(arr.length);//NPE		0	
	
	}	
	public static void main(String... args){

			System.out.println(args.length);//		0
			System.out.println(args);//[Ljava.lang.String;@5acf9800
			//System.out.println(args[0]);//	ArrayIndexOutOfBoundsException			
			System.out.println("Hello.........");
			String[] arr= new String[1];			
			m1(arr, 9);
			//null.m2(null,11);//cannot be dereferenced
			m2(null,1);
			

//			System.out.println(arr.length);//		0
//			System.out.println(arr);//[Ljava.lang.String;@5acf9800			
			

	}
}

/*
0
[Ljava.lang.String;@5acf9800
Hello.........
[Ljava.lang.String;@4617c264
1
null
Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<parameter1>" is null
        at Person.m2(.java:15)
        at Person.main(.java:30)

C:\CDAC\Github\180-days-of-code\Practice\Interview\Mock>

*/