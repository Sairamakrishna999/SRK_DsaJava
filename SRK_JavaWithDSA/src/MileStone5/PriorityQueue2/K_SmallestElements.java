/*K Smallest Elements
Send Feedback
You are given with an integer k and an array of integers that contain numbers in random order. Write a program to find k smallest numbers from given array. You need to save them in an array and return it.
Time complexity should be O(n * logk) and space complexity should not be more than O(k).
Note: Order of elements in the output is not important.
Input Format :
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
The following line contains an integer, that denotes the value of k.
Output Format :
The first and only line of output print k smallest elements. The elements in the output are separated by a single space. 
Constraints:
Time Limit: 1 sec
Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
4
Sample Output 1 :
1 2 3 5 
*/
package MileStone5.PriorityQueue2;

	import java.util.ArrayList;

	public class K_SmallestElements {
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
				int temp =arr[maxIndex];
				arr[maxIndex]=arr[parentIndex];
				arr[parentIndex]=temp;
				parentIndex=maxIndex;
				leftChildIndex=2*parentIndex+1;
				rightChildIndex=2*parentIndex+2;

			}
		}
		public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
			// Write your code here
			ArrayList<Integer> output = new ArrayList<>();
			for(int i=k-1;i>=0;i--){
				Heapify(input,i,k);
			}
			for(int i=k;i<n;i++){
				if(input[0]>input[i]){
					int temp = input[0];
					input[0]=input[i];
					input[i]=temp;
					Heapify(input,0,k);
				}
			}
			for(int i=0;i<k;i++){
				output.add(input[i]);
			}
			return output;
		}
	}