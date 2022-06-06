/*
Strings are immutable : when wer create the new object with String ti will be new object and when we
try to append the object then also it will create the new object and the existing object will be there
in the string pool

So if we want mutable objects then we must go for String Builder where on appending the existing object new object wont be created rather same object will be appended

String Buffer is used in multithreaded environment where one method is access by diff threads with the same object,
as String buffer has mehod synchronised

Synchronized methods :
In multithreaded environment when the same method is accessed by thye diff threads with the same object then 
in that case the method must be synchronised
or else it would create the trouble and values will be interchanges when particular thread beocomes pre-emptive

String buffers are safe for use by multiple threads. The methods are synchronized where necessary so that all the operations on any particular instance behave as if they occur in some serial order that is consistent with the order of the method calls made by each of the individual threads involved.

The principal operations on a StringBuffer are the append and insert methods, which are overloaded so 
as to accept data of any type. Each effectively converts a given datum to a string and then appends 
or inserts the characters of that string to the string buffer. The append method always adds these 
characters at the end of the buffer; the insert method adds the characters at a specified point.

For example, if z refers to a string buffer object whose current contents are "start", then the method call z.append("le") 
would cause the string buffer to contain "startle", whereas z.insert(4, "le") would alter the string 
buffer to contain "starlet".

In general, if sb refers to an instance of a StringBuffer, then sb.append(x) has the same effect as 
sb.insert(sb.length(), x).

*/

class StringBufferBuilderDemo{
	
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer("ABC");
		
		String s = "abc";
		s = s.concat("def");
		System.out.println(s);
		
		sb1.append("def");
		System.out.println(sb1);
		String s2 = sb1.toString();
		System.out.println(s2);
		
	}
}