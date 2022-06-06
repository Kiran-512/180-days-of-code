import java.util.*;

class ArrayOperationDemo
{
	public static void main(String args[])
	{
		int count=0;
		int search,delete;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[size+1];
		System.out.println("enter value");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array before operation");
		for(int j=0;j<size;j++)
		{
			System.out.println(arr[j]);
		}
		
		//===============================================
		System.out.println("you want to insert element ");
		System.out.println("Enter position");
		int pos=s.nextInt();
		System.out.println("Enter value");
		int value=s.nextInt();
		for(int i=0;i<size+1;i++)
		{
			if(i<pos)
			{
				arr1[i]=arr[i]; 
			}
			else if(i==pos)
			{
				arr1[i]=value;
			}
			else
			{
				arr1[i]=arr[i-1];
			}
			
		}
		System.out.println("After insertion array is ");
		for(int j=0;j<size+1;j++)
		{
			System.out.println(arr1[j]);
		}
		System.out.println("you want to search perticular element ");
		System.out.println("enter element ");
		search=s.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				count++;
			}
			
		}
		if (count>0)
		{
			System.out.println("Element found ");
		}
		else
			System.out.println("element not found");
		System.out.println("you want to delete element ");
		System.out.println("enter element ");
		delete=s.nextInt();
		
				
					for(int j=delete;j<size-1;j++)
					{
						arr[j]=arr[j+1];
					}
			
		System.out.println("after deletion array");
		for(int j=0;j<size;j++)
		{
			System.out.println(arr[j]);
		}
		
		
	}
}