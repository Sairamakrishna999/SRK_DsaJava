/*Minimum Number Of Squares
Send Feedback
Given an integer N, find and return the count of minimum numbers required to represent N as a sum of squares.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. The output will be 1, as 1 is the minimum count of numbers required to represent N as sum of squares.
Input format :
The first and the only line of input contains an integer value, 'N'.
 Output format :
Print the minimum count of numbers required.
Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1 :
12
Sample Output 1 :
3
Explanation of Sample Output 1 :
12 can be represented as : 
A) (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2)

B) (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2)  + (2 ^ 2)

C) (1^2) + (1^2) + (1^2) + (1^2) + (2 ^ 2) + (2 ^ 2)

D) (2 ^ 2) + (2 ^ 2) + (2 ^ 2)

As we can see, the output should be 3.
Sample Input 2 :
9
Sample Output 2 :
1
*/
package MileStone5.DynamicProgramming1;

public class MinimumNoOf_Squares {

		public static int minCount(int n) {
			//Your code goes here
			int arr[]=new int[n+1];
			for(int i=0;i<arr.length;i++){
				arr[i]=-1;
			}
			return minCount(n,arr);
		}
		public static int minCount(int n,int arr[]){
			if(n==0){
				return 0;
			}
			if(n==1){
				return 1;
			}
			int min = Integer.MAX_VALUE;
			for(int i=1;n-i*i>=0;i++){
				int current;
				if(arr[n-i*i]==-1){
					current = minCount(n-i*i,arr);
					arr[n-i*i]=current;
				}
				else{
					current = arr[n-i*i];
				}
				min = Math.min(current,min);
			}
			return arr[n];
		}

	}