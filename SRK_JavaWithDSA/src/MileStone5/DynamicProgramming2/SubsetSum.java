/*Subset Sum
Send Feedback
You are given a set of N integers. You have to return true if there exists a subset that sum up to K, otherwise return false.
Input Format
The first line of the test case contains an integer 'N' representing the total elements in the set.

The second line of the input contains N integers separated by a single space.    

The third line of the input contains a single integer, denoting the value of K.
Output Format
Output Yes if there exists a subset whose sum is k, else output No.
Constraints :
1 <= N <= 10^3
1 <= a[i] <= 10^3, where a[i] denotes an element of the set 
1 <= K <= 10^3

Time Limit: 1 sec
Sample Input 1 :
4
4 3 5 2
13
Sample Output 1 :
No
Sample Input 2 :
5
4 2 5 6 7
14
Sample Output 2 :
Yes
*/
package MileStone5.DynamicProgramming2;

public class SubsetSum {

		   static boolean isSubsetPresent(int set[], int n, int sum)
		    {
		        // The value of subset[i][j] will be
		        // true if there is a subset of
		        // set[0..j-1] with sum equal to i
		        boolean subset[][] = new boolean[sum + 1][n + 1];
		  
		        // If sum is 0, then answer is true
		        for (int i = 0; i <= n; i++)
		            subset[0][i] = true;
		  
		        // If sum is not 0 and set is empty,
		        // then answer is false
		        for (int i = 1; i <= sum; i++)
		            subset[i][0] = false;
		  
		        // Fill the subset table in bottom
		        // up manner
		        for (int i = 1; i <= sum; i++) {
		            for (int j = 1; j <= n; j++) {
		                subset[i][j] = subset[i][j - 1];
		                if (i >= set[j - 1])
		                    subset[i][j]
		                        = subset[i][j]
		                          || subset[i - set[j - 1]][j - 1];
		            }
		        }
		  
		        /* // uncomment this code to print table
		        for (int i = 0; i <= sum; i++)
		        {
		        for (int j = 0; j <= n; j++)
		            System.out.println (subset[i][j]);
		        } */
		  
		        return subset[sum][n];
		    
		    }
		}