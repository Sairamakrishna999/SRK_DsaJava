/*Maximum Subarray Sum
This problem was asked by Amazon.
Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be -1.
Follow up: Do this in O(N) time.
Input Format:
The first line of input contains size of array, which is denoted by N and second line of input contains N space separated integers.
Output Format:
The first and only line of output should print the maximum subarray sum, as described in the description.
*/
package MileStone5.FinalExam.Test1;



	// Java program to print largest contiguous array sum
	import java.io.*;
	import java.util.*;

	class MaxSubArraySum {
		// Driver Code
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(maxSubArraySum(arr));
		}

		// Function Call
		static int maxSubArraySum(int a[])
		{
			int size = a.length;
			int max_so_far = Integer.MIN_VALUE, max_ending_here
												= 0;

			for (int i = 0; i < size; i++) {
				max_ending_here = max_ending_here + a[i];
				if (max_so_far < max_ending_here)
					max_so_far = max_ending_here;
				if (max_ending_here < 0)
					max_ending_here = 0;
			}
			return max_so_far;
		}
	}
