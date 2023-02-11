/*Sample Input 1:
3 3
1 2 3
4 5 6
7 8 9
Sample Output 1 :
1 2 3
1 2 3
1 2 3
4 5 6
4 5 6
7 8 9
*/
package Milestone2.Test2;

	public class print2DArray {
		public static void print2DArray(int input[][]) {
			// Write your code here
	        if(input.length==0){
	            return;
	        }
	        
	        for(int i=0;i<input.length;i++){
	            int n = input.length;
	            while((n-i)>0){
	                for(int j=0;j<input[0].length;j++){
	                    System.out.print(input[i][j]+" ");
	                }
	                System.out.println();
	                n--;
	            }
	        }

		}
	}
