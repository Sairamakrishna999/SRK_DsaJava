/*Pair Sum to 0
Send Feedback
Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
Note: Array A can contain duplicate elements as well.
Input format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output format :
The first and only line of output contains the count of pair of elements in the array which sum up to 0. 
Constraints :
0 <= N <= 10^4
Time Limit: 1 sec
Sample Input 1:
5
2 1 -2 2 3
Sample Output 1:
2
*/
package Milestone4.HashMap;



	import java.util.*;

	public class PairSumTo_0 {
		public static int PairSum(int[] input, int size) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        if(size<=1){
	            return 0;
	        }
	        int count=0;
	        for(int i:input){
	            if(map.containsKey(i)){
	                map.put(i,map.get(i)+1);
	            }
	            else{
	                map.put(i,1);
	            }
	        }
	        for(int i=0;i<input.length;i++){
	            if(map.containsKey(0)){
	                int n=map.get(0);
	                count=count+((n)*(n-1))/2;
	                map.remove(0);
	            }
	            if((map.containsKey(i) && map.containsKey(-i)) &&(!map.containsKey(0))){
	                count=count+map.get(i)*map.get(-i);
	            }
	        }
	        return count;
		}
	}