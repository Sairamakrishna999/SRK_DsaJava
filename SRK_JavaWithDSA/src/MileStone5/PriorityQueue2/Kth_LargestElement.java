/*Kth largest element
Send Feedback
Given an array A of random integers and an integer k, find and return the kth largest element in the array.
Note: Try to do this question in less than O(N * logN) time.
Input Format :
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
The following contains an integer, that denotes the value of k.
Output Format :
The first and only line of output contains the kth largest element
Constraints :
1 <= N, Ai, k <= 10^5
Time Limit: 1 sec
Sample Input 1 :
6
9 4 8 7 11 3
2
Sample Output 1 :
9
Sample Input 2 :
8
2 6 10 11 13 4 1 20
4
Sample Output 2 :
10
*/
package MileStone5.PriorityQueue2;

public class Kth_LargestElement {

		public static void Heapify(int arr[],int start,int end){
			int parentIndex = start;
			int leftChildIndex = 2*parentIndex+1;
			int rightChildIndex = 2*parentIndex+2;
			while(leftChildIndex<end){
				int maxIndex = parentIndex;
				if(arr[leftChildIndex]>arr[maxIndex]){
					maxIndex=leftChildIndex;
				}
				if(rightChildIndex<end && arr[rightChildIndex]>arr[maxIndex]){
					maxIndex=rightChildIndex;
				}
				if(maxIndex==parentIndex){
					break;
				}
				int temp = arr[maxIndex];
				arr[maxIndex]=arr[parentIndex];
				arr[parentIndex]=temp;
				parentIndex=maxIndex;
				leftChildIndex=2*parentIndex+1;
				rightChildIndex=2*parentIndex+2;
			}
		}
		public static int kthLargest(int n, int[] input, int k) {
			// Write your code here
			for(int p=0;p<k;p++){
			for(int i=n/2-1;i>=0;i--){
				Heapify(input,i,n);
			}
			int temp = input[0];
			input[0]=input[n-1];
			input[n-1]=temp;
			n--;
			}
			return input[input.length-1-(k-1)];
		}
	}