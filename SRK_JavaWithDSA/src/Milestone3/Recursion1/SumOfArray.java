/*Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
*/
package Milestone3.Recursion1;

public class SumOfArray {	    
		public static int sum(int input[]) {

	        if(input.length==0){
	            return 0;
	        }
	        int smallArray[]= new int[input.length-1];
	        for(int i=0;i<input.length-1;i++){
	            smallArray[i]=input[i];
	        }
	        
	        return input[input.length-1]+sum(smallArray);
		}
	}
