/*
 Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3
*/
package Milestone3.TimeComplexity;

	import java.util.*;
	public class DuplicateInArray {

		public static int findDuplicate(int[] arr) {
			//Your code goes here
	        Arrays.sort(arr);
	        return helper(arr,0);
		}
	    public static int helper(int arr[],int si){
	        if(arr.length==0){
	            return -1;
	        }
	        if(arr[si]==arr[si+1]){
	            return arr[si];
	        }
	        int result=helper(arr,si+1);
	        return result;
	    }
	}
