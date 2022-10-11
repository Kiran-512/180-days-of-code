class NoAnaramDeletion{


    static int makingAnagrams(String s1, String s2) {
        int values[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            values[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            values[s2.charAt(i) -'a']--;
        }

        int removeChars = 0;
        for (int i = 0; i < values.length; i++) {
            removeChars += Math.abs(values[i]);
        }
        
        return removeChars;
    }


	public static void main(String... args)
	{
		int res = makingAnagrams("abc","abcasdasdasd");
		System.out.println(res);
	}	
}