import java.util.Scanner;

class Node{

	Node link;
	int info;
	public Node(int data){
		this.info=data;
		this.link=null;
	}
}
class LinkedListStack{
	
	private Node top;
	
	LinkedListStack(){
		top=null;
	}
	int size(){
		int size=0;
		if(isEmpty())
			return size;
		Node p = top;
		while(p!=null)
		{
			size++;
			p=p.link;
		}
		return size;	
	}
	boolean isEmpty()
	{
		return top==null;
	}
	void push(int data){
		Node temp = new Node(data);
		temp.link=top;
		top=temp;	
	}
	int pop(){
		if(!isEmpty())
		{
			int data =top.link.info;
			top=top.link;
			return data;
		}
		return -1;
	}
	void display()
	{
		Node p=top;
		if(!isEmpty())
		{
			while(p!=null)
			{
				System.out.print(p.info +" ");
				p=p.link;
			}
		}
		System.out.println();
	}
}
class LinkedListStackDemo
{
	
	public static void main(String... args)
	{
		LinkedListStack stack = new LinkedListStack();
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
	
		stack.display();
		
		stack.pop();
		
		stack.display();
		
		
	}
}