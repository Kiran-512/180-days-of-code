import java.util.*;
public class UserMainCode
{
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	static ArrayList<Integer> tmp = new ArrayList<Integer>();
	
	static void findPairs(int n, int left, int k)
	{
		if (k == 0) {
			ans.add(tmp);
			return;
		}
		for (int i = left; i <= n; ++i)
		{
			tmp.add(i);
			findPairs(n, i + 1, k - 1);


			tmp.remove(tmp.size() - 1);
		}
	}

	static ArrayList<ArrayList<Integer>> combinations(int n, int k)
	{
		findPairs(n, 1, k);
		return ans;
	}
	
	static int favours(int n,int k){

		ans = combinations(n, k);
		if(k!=1)
		return ans.size() + n;
		else
		return ans.size();
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		int k = 2;
		int combinations = favours(n,k);
		System.out.println(combinations);
	}
}