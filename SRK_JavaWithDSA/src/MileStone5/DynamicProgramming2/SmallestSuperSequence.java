/*Smallest Super-Sequence
Send Feedback
 Given two strings S and T with lengths M and N. Find and return the length of their shortest 'Super Sequence'.
 The shortest 'Super Sequence' of two strings is defined as the smallest string possible that will have both the given strings as its subsequences.
Note :
If the two strings do not have any common characters, then return the sum of the lengths of the two strings. 
Input Format:
The first only line of input contains a string, that denotes the value of string S. The following line contains a string, that denotes the value of string T.
Output Format:
Length of the smallest super-sequence of given two strings. 
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
ab
ac
Sample Output 1 :
3
Explanation of Sample Output 1 :
Their smallest super sequence can be "abc" which has length = 3.
Sample Input 2 :
pqqrpt
qerepct
Sample Output 2 :
9
*/
package MileStone5.DynamicProgramming2;

public class SmallestSuperSequence {


		public static int smallestSuperSequence(String str1, String str2) {

	        /* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
	        int m = str1.length();
			int n = str2.length();
			int dp[][]=new int[m+1][n+1];
			for(int i=0;i<dp.length;i++){
				for(int j=0;j<dp[0].length;j++){
					if(i==0){
						dp[i][j]=j;
					}
					else if(j==0){
						dp[i][j]=i;
					}
					else if(str1.charAt(i-1)==str2.charAt(j-1)){
						dp[i][j]=1+dp[i-1][j-1];
					}
					else{
						dp[i][j]=1+Math.min(dp[i-1][j],dp[i][j-1]);
					}
				}
			}
			return dp[m][n];
	}
	}