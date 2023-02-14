/*Stair Case
Send Feedback
A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
Output format :
Print the total possible number of ways.
 Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1:
4
Sample Output 1:
7
Sample Input 2:
10
Sample Output 2:
274
*/
package MileStone5.DynamicProgramming1;

public class StairCase {


		public static long staircase(int n) {
			//Your code goes here
			long arr[]=new long[n+1];
			for(int i=0;i<arr.length;i++){
				arr[i]=-1;
			}
			return staircase(n,arr);
		}
		public static long staircase(int n,long arr[]){
			if(n==0 || n==1){
				return 1;
			}
			if(n<0){
				return 0;
			}
			// if(arr[n]!=-1){
			// 	return arr[n];
			// }
			long result = staircase(n-1,arr)+staircase(n-2,arr)+staircase(n-3,arr);
			// arr[n]=result;
			return result;
		}
	}






