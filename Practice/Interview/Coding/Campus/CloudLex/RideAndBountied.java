class RideAndBountied{


public static int maximiseProfit(int m, int n, int[][] grid) {
        int profit = 0;
        return helper(grid, 0, 0,m,n,profit);
    }

    public static int helper(int[][]grid, int row, int col, int m, int n, int profit){

        if(row == m && col == n) return profit; // this is the exit of the recursion
        if(grid[row][col] != -1 && grid[row][col] != 0) {
            profit += grid[row][col];
            grid[row][col] = 0;
        }
        if(row == m) return grid[row][col] + helper(grid, row, col - 1,m,n,profit);
        if(col == n) return profit + helper(grid, row - 1, col,m,n,profit);
        profit += helper(grid,row,col+1,m,n,profit);
        profit += helper(grid,row+1,col+1,m,n,profit);
//        return grid[row][col] + Math.max(helper(grid, row - 1, col,m,n,profit), helper(grid, row, col - 1,m,n,profit));
        return profit;
    }
	
	public static void main(String... args)
	{
		int[][] arr= {{0,2,3},{-1,1,1},{6,1,2}};
		
		int result = maximiseProfit(3,3,arr);
		System.out.println(result);
		
	}
}