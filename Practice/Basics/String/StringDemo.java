class StringDemo{
	
	
	public static void main(String...  args){
	
		StringBuffer sb = new StringBuffer(20);	
		//sb="";
		sb.append("djasdjkahdjahsjdkahsjdaksd");
		System.out.println(sb);//djasdjkahdjahsjdkahsjdaksd
		System.out.println(sb.capacity()); //42-- (initial capacity +1)*2
		
		StringBuffer sbb = new StringBuffer("Kiran");
		System.out.println(sbb);//Kiran
		System.out.println(sbb.capacity()); // 21 -- ( initial capacity + sbb.length())
	
		StringBuffer s = new StringBuffer();
		s.append("Pi value is ");
		s.append(3.24);
		s.append("and its  ");		
		s.append(true);
		System.out.println(s);//Pi value is 3.24and its  true
		System.out.println(s.capacity());//34
		System.out.println(s.length());//29

		s.insert(3,"somevalueee");
		s.insert(28,234);
		s.insert(1,2.34343);
		s.insert(6,false);		
		
		System.out.println(s);//P2.343false43i somevalueeevalue is 3.24a234nd its  true
		System.out.println(s.capacity());//70
		System.out.println(s.length());//55
		
		
		// Methods available
		/*
		length()
		capacity()// default is 16 and icnremnt is (initial +1)*2
		charAt()
		setCharAt(index, char)
		append(string)//int, boolean, double, float etc.
		insert(index, string)/int, boolean, double, float etc.
		delete(int begin, int end)//delted from begin to (end-1)
		deleteCharAt(int index)
		reverse()
		setLength(int)// it iwll trim the content if leangth is byeyong setLength
		ensureCapacity(int)
		trimToSize()// capacity will be trimmed to actual length length

		*/
		
		//Method chaining -- used when the return type of each method used in method chaining is same!
		
		StringBuffer s1 = new StringBuffer("Some st ring is set to this ");
		s1.append(234).delete(5,11).insert(5,"string").append(s1);
		System.out.println(s1);//Some stringg is set to this 234Some stringg is set to this 234
		System.out.println(s1.length());//62
		System.out.println(s1.capacity());//90
	}
	

}

