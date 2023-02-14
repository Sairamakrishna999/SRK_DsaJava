/*Magic Grid
Send Feedback
You are given a magic grid A with R rows and C columns. In the cells of the grid, you will either get magic juice, which increases your strength by |A[i][j]| points, or poison, which takes away |A[i][j]| strength points. If at any point of the journey, the strength points become less than or equal to zero, then you will die.
You have to start from the top-left corner cell (1,1) and reach at the bottom-right corner cell (R,C). From a cell (i,j), you can only move either one cell down or right i.e., to cell (i+1,j) or cell (i,j+1) and you can not move outside the magic grid. You have to find the minimum number of strength points with which you will be able to reach the destination cell.
Input format:
The first line contains the number of test cases T. T cases follow. Each test case consists of R C in the first line followed by the description of the grid in R lines, each containing C integers. Rows are numbered 1 to R from top to bottom and columns are numbered 1 to C from left to right. Cells with A[i][j] < 0 contain poison, others contain magic juice.
Output format:
Output T lines, one for each case containing the minimum strength you should start with from the cell (1,1) to have a positive strength through out his journey to the cell (R,C).
Constraints:
1 ≤ T ≤ 5
2 ≤ R, C ≤ 500
-10^3 ≤ A[i][j] ≤ 10^3
A[1][1] = A[R][C] = 0
Time Limit: 1 second
Sample Input 1:
3
2 3
0 1 -3
1 -2 0
2 2
0 1
2 0
3 4
0 -2 -3 1
-1 4 0 -2
1 -2 -3 0
Sample Output 1:
2
1
2
*/
package MileStone5.DynamicProgramming2;

public class MagicGrid {

	    public static int getMinimumStrength(int[][] grid) {
	        
	        /* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
	        if(grid.length==0){
	            return 0;
	        }
	        int m = grid.length;
	        int n = grid[0].length;
	        int dp[][]=new int[m][n];
	       
	        for(int i=m-1;i>=0;i--){
	            for(int j=n-1;j>=0;j--){
	                if(i==m-1 && j==n-1){
	                     dp[i][j]= grid[m-1][n-1]>0 ? 1 : Math.abs(grid[m-1][n-1])+1;
	                }
	                else if(i==m-1){
	                    dp[i][j]=Math.max(dp[i][j+1]-grid[i][j],1);
	                }
	                else if(j==n-1){
	                    dp[i][j]=Math.max(dp[i+1][j]-grid[i][j],1);
	                }
	                else{
	                    int min = Math.min(dp[i+1][j],dp[i][j+1])-grid[i][j];
	                    dp[i][j]=Math.max(min,1);
	                }
	            }
	        }
	        return dp[0][0];

	    }
	}