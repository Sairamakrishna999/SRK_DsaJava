/*Sample Input 1:
1
6
5 6 1 2 3 4
Sample Output 1:
2*/
package Milestone2.Arrays2;

public class CheckArrayRotation {
	    public static int arrayRotateCheck(int[] arr){
	        int x = 0;
	        for(int i = 0 ; i < arr.length - 1 ; i++){
	            if(arr[i] > arr[i + 1])
	                x = i + 1;
	        }
	        return x;
	        }  

	}
