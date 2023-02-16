/*Possible Combinations
You are given N integers (12<N<20) in sorted order and your task is to print all the possible combinations of the numbers that can be used to choose 12 numbers out of the given N numbers in sorted order.
Input Format:
First line contains N - (Integer)
Second line contains N spaced integers which are player Id of players. Note that, all the N integers are given in sorted order.
Output Format:
Print the space separated combinations in N lines
Constraints
12<= N <= 20
1 <= Ai <=1000
Sample Input :
13
1 2 3 4 5 6 7 8 9 10 11 12 13
Sample Output :
1 2 3 4 5 6 7 8 9 10 11 12
1 2 3 4 5 6 7 8 9 10 11 13 
1 2 3 4 5 6 7 8 9 10 12 13 
1 2 3 4 5 6 7 8 9 11 12 13 
1 2 3 4 5 6 7 8 10 11 12 13 
1 2 3 4 5 6 7 9 10 11 12 13 
1 2 3 4 5 6 8 9 10 11 12 13 
1 2 3 4 5 7 8 9 10 11 12 13 
1 2 3 4 6 7 8 9 10 11 12 13 
1 2 3 5 6 7 8 9 10 11 12 13 
1 2 4 5 6 7 8 9 10 11 12 13 
1 3 4 5 6 7 8 9 10 11 12 13 
2 3 4 5 6 7 8 9 10 11 12 13
*/
package MileStone5.FinalExam.Test2;



	// Java program to print all combination of size r in an array of size n
	import java.io.*;

	import java.util.*;
	public class possibleCombinations {

		/* arr[] ---> Input Array
		data[] ---> Temporary array to store current combination
		start & end ---> Starting and Ending indexes in arr[]
		index ---> Current index in data[]
		r ---> Size of a combination to be printed */
		static void combinationUtil(int arr[], int data[], int start,
									int end, int index, int r)
		{
			// Current combination is ready to be printed, print it
			if (index == r)
			{
				for (int j=0; j<r; j++)
					System.out.print(data[j]+" ");
				System.out.println("");
				return;
			}

			// replace index with all possible elements. The condition
			// "end-i+1 >= r-index" makes sure that including one element
			// at index will make a combination with remaining elements
			// at remaining positions
			for (int i=start; i<=end && end-i+1 >= r-index; i++)
			{
				data[index] = arr[i];
				combinationUtil(arr, data, i+1, end, index+1, r);
			}
		}

		// The main function that prints all combinations of size r
		// in arr[] of size n. This function mainly uses combinationUtil()
		static void printCombination(int arr[], int n, int r)
		{
			// A temporary array to store all combination one by one
			int data[]=new int[r];

			// Print all combination using temporary array 'data[]'
			combinationUtil(arr, data, 0, n-1, 0, r);
		}

		/*Driver function to check for above function*/
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			// int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
			int r = 12;
			// int n = arr.length;
			printCombination(arr, n, r);
		}
	}

