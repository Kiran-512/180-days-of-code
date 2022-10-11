import java.util.Scanner;

class Node{

	Node link;
	int data;
	public Node(int data){
		this.data=data;
		this.link=null;
	}
}

class SingleLinkedList{
	
	private Node start;
	
	SingleLinkedList(){
		start=null;
	}
	
	void createList(){
		int n,i,data;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of nodes : ");
		n=sc.nextInt();
				
		if(n==0)
			return;
		
		for(i=1; i<=n; i++)
		{
			System.out.print("Enter the element to be inserted : ");
			data = sc.nextInt();
			insertAtEnd(data);	
		}
	}
	
	public void insertAtEnd(int data)
	{
		Node p;
		Node temp=new Node(data);
		
		if(start==null)
		{
			start=temp;
			return;
		}
		
		p=start;
		while(p.link!=null)
			p=p.link;
		
		p.link=temp;
	}
	
	void display(){

		if(start==null)
			System.out.println("List is empty!");

		Node p = start;
		System.out.println("ELements are : ");	
		while(p!=null)
		{
		System.out.print(p.data+" ");	
		p=p.link;
		}
		
	}
	
	void reverse(){
		
		Node next,p,prev;
		p=start;
		prev=null;
		while(p!=null)
		{
			next=p.link;
			p.link=prev;
			prev=p;
			p=next;
		}
		start=prev;
		
	}
	boolean isEmpty(){
		return start==null;
	}
	
	int search(int data){

		if(!isEmpty())
		{
		int position=1;
		Node p =start;
		while(p!=null)
		{
			if(p.data==data)
				return position;
			p=p.link;
		}
		}
			return -1;
	}
	void bubbleSort(){
		Node end,p,q;
		for(end=null;end!=start.link;end=p)
		{
			for(p=start;p.link!=end;p=p.link)
			{
				q=p.link;
				if(p.data>q.data)
				{
					int temp = p.data;
					p.data = q.data;
					q.data= temp;
				}
			}	
			
		}	
		
	}
		
}

class SingleLinkedListDemo{

	public static void main(String... args){
	
	SingleLinkedList list = new SingleLinkedList();
	
	list.createList();
	list.display();
	list.reverse();
	list.display();	
	int index=list.search(10);
	System.out.println(index);
	
	list.bubbleSort();
	list.display();
	}
}