class Demo{
static int countDistinct(int a[], int n, int l, int r)      //Function Definition
{
   int i, j, count = 0,count1=0;

   for(i = l-1; i <=r-1; i++)      //8 6 3 8 4 4 4 9 // 2 - 6 
   {
      for (j = i; j <=r-1; j++)
      {
		System.out.println("insidee..");		  
		
		if (i == j)
		{
			continue;
		}
		
		if (a[i] != a[j])   
        {
			System.out.println(i+"  "+j +"  counted...........");
			count1++;
        }
      }
	  if(count1!=0)
	  {	
		count++;
	  }
		count1=0;

   }
   return (r-1)/2 + count;
}
public static void main(String... args){

int[] arr ={8 ,6, 3 ,8 ,4 ,4, 4, 9};

	System.out.println(countDistinct(arr,arr.length,2,6));
  
}
}