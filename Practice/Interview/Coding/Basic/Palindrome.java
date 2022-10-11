class Palindrome{

public static void main(String... args){
	
	String s ="racecar";
	
	boolean res = isPlaindrome(s);
	System.out.println(res);
}
	
	static boolean isPlaindrome(String s){
		if(s.length()==0 || s.length()==1)
		{
						return true;
		}
		
		if(s.charAt(0)==s.charAt(s.length()-1)){
			return isPlaindrome(s.substring(1,s.length()-1));
		}
		return false;
		
		
	}

}