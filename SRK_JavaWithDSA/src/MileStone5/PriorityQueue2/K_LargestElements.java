/*K Largest Elements
Send Feedback
You are given with an integer k and an array of integers that contain numbers in random order. Write a program to find k largest numbers from given array. You need to save them in an array and return it.
Time complexity should be O(nlogk) and space complexity should be not more than O(k).
Order of elements in the output is not important.
Input Format :
Line 1 : Size of array (n)
Line 2 : Array elements (separated by space)
Line 3 : Integer k
Output Format :
k largest elements
Sample Input :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
4
Sample Output :
12
16
20
25
*/
package MileStone5.PriorityQueue2;



	import java.util.ArrayList;

	public class K_LargestElements {
		public static void Heapify(int arr[],int start,int end){
			int parentIndex = start;
			int leftChildIndex = 2*parentIndex+1;
			int rightChildIndex = 2*parentIndex+2;
			while(leftChildIndex<end){
				int minIndex = parentIndex;
				if(arr[leftChildIndex]<arr[minIndex]){
					minIndex=leftChildIndex;
				}
				if(rightChildIndex<end && arr[rightChildIndex]<arr[minIndex]){
					minIndex=rightChildIndex;
				}
				if(minIndex==parentIndex){
					break;
				}
				int temp = arr[minIndex];
				arr[minIndex]=arr[parentIndex];
				arr[parentIndex]=temp;
				parentIndex=minIndex;
				leftChildIndex=2*parentIndex+1;
				rightChildIndex=2*parentIndex+2;
			}
		}
		public static ArrayList<Integer> kLargest(int input[], int k) {
			/* Your class should be named Solution
			* Don't write main().
			* Don't read input, it is passed as function argument.
			* Return output and don't print it.
			* Taking input and printing output is handled automatically.
			*/
			for(int i=k-1;i>=0;i--){
				Heapify(input,i,k);
			}
			for(int i=k;i<input.length;i++){
				if(input[0]<input[i]){
					int temp = input[0];
					input[0]=input[i];
					input[i]=temp;
					Heapify(input,0,k);
				}
			}
			ArrayList<Integer> output = new ArrayList<>();
			for(int i=0;i<k;i++){
				output.add(input[i]);
			}
			return output;
		}
	}