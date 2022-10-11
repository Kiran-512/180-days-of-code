import java.util.*;

class RideAndBounty{
	
	static int findBounty(int[] arr, int size)
	{
		LinkedHashMap<Integer, Integer> ridesCost = new LinkedHashMap<>();
		int[] sum = new int[size];
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(j==i+1)
				continue;
				sum[j]+=arr[j];
				if(j==size-1)
				ridesCost.put(i,sum[i]);
			}
		}
		
		Object[] bountiesSum = ridesCost.values().toArray();
		
		
	}
	
	public static void main(String... args)
	{
	int N =5;
	int[] bounties = {12,44,12,6,5}; 	
	int result = findBounty(bounties,N);	
		
	}

}