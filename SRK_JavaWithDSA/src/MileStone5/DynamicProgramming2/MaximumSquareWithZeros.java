/*Maximum Square Matrix With All Zeros
Send Feedback
Given an NxM matrix that contains only 0s and 1s, find out the size of the maximum square sub-matrix with all 0s. You need to return the size of the square matrix with all 0s.
Input format :
The first line of the test case contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively.

Second-line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith rows constitutes column values separated by a single space (Either 0 or 1).
Output Format:
Print the size of maximum square sub-matrix.
 Constraints :
0 <= N <= 10^4
0 <= M <= 10^4

Time Limit: 1 sec
Sample Input 1:
3 3
1 1 0
1 1 1
1 1 1
Sample Output 1:
1
Sample Input 2:
4 4
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
Sample Output 2:
4
*/
package MileStone5.DynamicProgramming2;

public class MaximumSquareWithZeros {



	

	public static int findMaxSquareWithAllZeros(int[][] input){
        
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
	 if(input.length==0){
		 return 0;
	 }
	 	int max = Integer.MIN_VALUE;
	int newArray[][]=new int[input.length][input[0].length];
	for(int i=0;i<newArray.length;i++){
		for(int j=0;j<newArray[0].length;j++){
			if(i==0){
				if(input[i][j]==0){
					newArray[i][j]=1;
				}
				else{
					newArray[i][j]=0;
				}
			}
			else if(j==0){
				if (input[i][j] == 0) {
					newArray[i][j] = 1;
				} else {
					newArray[i][j] = 0;
				}
			}
			else{
				if(input[i][j]==0){
					newArray[i][j]=1+Math.min(newArray[i-1][j-1],Math.min(
							newArray[i][j-1], newArray[i-1][j]));
				}
				else{
					newArray[i][j]=0;
				}
			}
			if(newArray[i][j]>max){
				max=newArray[i][j];
			}
		}

	}
		return max;
	}

	
}