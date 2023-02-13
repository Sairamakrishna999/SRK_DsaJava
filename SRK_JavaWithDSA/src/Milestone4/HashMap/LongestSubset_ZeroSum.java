/*Longest subset zero sum
Send Feedback
Given an array consisting of positive and negative integers, find the length of the longest subarray whose sum is zero.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format
The first and only line of output contains length of the longest subarray whose sum is zero.
Constraints:
0 <= N <= 10^8
Time Limit: 1 sec
Sample Input 1:
10 
 95 -97 -387 -435 -5 -70 897 127 23 284
Sample Output 1:
5
Explanation:
The five elements that form the longest subarray that sum up to zero are: -387, -435, -5, -70, 897 
*/
package Milestone4.HashMap;

public class LongestSubset_ZeroSum {


		public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
			// Write your code here
			return maxLen(arr,arr.length);
		}


		// Returns length of the largest subarray
		// with 0 sum
		static int maxLen(int arr[], int N)
		{
			int max_len = 0;

			// Pick a starting point
			for (int i = 0; i < N; i++) {
			
				// Initialize curr_sum for every
				// starting point
				int curr_sum = 0;

				// try all subarrays starting with 'i'
				for (int j = i; j < N; j++) {
					curr_sum += arr[j];

					// If curr_sum becomes 0, then update
					// max_len
					if (curr_sum == 0)
						max_len = Math.max(max_len, j - i + 1);
				}
			}
			return max_len;
		}

	}
