class LinkedList1{

	Node head;

	static class Node{
			
			int data;
			Node next;
			
			Node(int d){
				this.data=d;
				next=null;
			}
	}
	
	 void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data + "--->");
			n=n.next;
		}
	}
	
		void insertInTheBegining(int new_data){
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}	
	
	void insertionAfter(Node prev,int new_data){
		if(prev==null){
			System.out.println("Unable to insert");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next=new_node;
	}
	
	
	void append(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new Node(new_data);
			return;
		}
		new_node.next = null; 
		Node n = head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new_node;
		return;		
	}
	
	int reccount(Node n){
		if(n==null)
			return 0;
		return 1+reccount(n.next);
	}
	
	boolean search(Node head, int key){
		Node n = head;
		while(n!=null){
			if(n.data ==key){
				return true;
			}
			n = n.next;
		}
		return false;
	}
	
	public static void main(String... args){
		LinkedList1 l1 = new LinkedList1();
		l1.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		l1.head.next=second;
		second.next=third;
		
		l1.display();		
		System.out.println();
		
		l1.insertInTheBegining(0);
		System.out.println("New list after insertion at the begining");
		l1.display();	
		System.out.println();

		l1.insertionAfter(l1.head.next,100);		
		System.out.println("New list after insertion after first node at any position");		
		l1.display();		
		System.out.println();
		
		
		l1.append(50);
		l1.display();		
		System.out.println();
		
		int count = l1.reccount(l1.head);
		System.out.println(count);//6
		
		if(l1.search(l1.head, 500))
			System.out.println("Element found");	
		else
			System.out.println("Element Not found");
			
	}
	

}
/*
C:\CDAC\Github\180-days-of-code\M3\DAY 37\LAB>javac LinkedList1.java

C:\CDAC\Github\180-days-of-code\M3\DAY 37\LAB>java LinkedList1
10--->20--->30--->
New list after insertion at the begining
0--->10--->20--->30--->
New list after insertion after first node at any position
0--->10--->100--->20--->30--->
0--->10--->100--->20--->30--->50--->
6
Element Not found

C:\CDAC\Github\180-days-of-code\M3\DAY 37\LAB>
*/