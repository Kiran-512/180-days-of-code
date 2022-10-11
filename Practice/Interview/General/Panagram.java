class Panagram{

	public static void main(String... args)
	{
//		String check ="merko ko bhi fight nai krni h friday k bad";
		String check = "abcd ef g h ij klmn opq r st uvw x y z";
		int[] arr =new int[26];
		boolean isPanagram = true;
		
		for(int i=0;i<check.length();i++)
		{
			if(check.charAt(i) == ' ')
				continue;
			arr[check.charAt(i)-'a']++;
		}
		for(int x:arr)
			System.out.print(x+" ");
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0);
			{
				isPanagram = false;				
			}	
		}
		if(isPanagram)
		System.out.println("yes its panagram!");
		else
		System.out.println("No! its not panagram!");
	}
}