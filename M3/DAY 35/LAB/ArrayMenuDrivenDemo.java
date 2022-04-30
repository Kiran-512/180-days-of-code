import java.util.Scanner;

class ArrayMenuDriven{
		boolean search(int[] arr,int n){
			int i=0;
			for(i=0;i<arr.length;i++){
				if(arr[i]==n)
					break;
			}
			if(i==arr.length)
				return false;
			else 
				return true;
		}
		boolean searchByIndex(int[] arr,int n,int index){
			int i=0;
			for(i=0;i<arr.length;i++){
				if(arr[i]==n)
				{
					if(i==index)
					break;
				}	
			}
			if(i==arr.length)
				return false;
			else 
				if(i==index)
					return true;
				else
				return true;
		}		
		
}
class ArrayMenuDrivenDemo{
	public static void main(String args[]){
		int[] arr = new int[]{7,8,9,10,11,12,13,14};
		int input;
		Scanner sc = new Scanner(System.in);
		
		ArrayMenuDriven ops = new ArrayMenuDriven();
		
		do{
			System.out.println("Enter any of the choice \n 1.Search an Element \n 2.Search an Element at index \n 3. Insert an element \n 4.Delete an element \n 5.Exit"  );
			input =sc.nextInt();
			switch(input){
				case 1: 
				System.out.println("Enter the element to check if its there in the array or not!");
				int n = sc.nextInt();
				boolean res = ops.search(arr,n);
				System.out.println(res);
				break;
				case 2: 
				System.out.println("Enter the element and its index to check if its there in the array or not!");
				int n1 = sc.nextInt();
				int index = sc.nextInt();
				boolean res1 = ops.searchByIndex(arr,n1,index);
				System.out.println(res1);
				break;
				case 3: 
				System.out.println("WIP");
				break;
				case 4: 
				System.out.println("WIP");
				break;
				case 5:break; 
				default :System.out.println("Please enter the valid choice from 1 to 5");
				break;
			}
		}while(input!=5);
	
			sc.close();	
	}
}