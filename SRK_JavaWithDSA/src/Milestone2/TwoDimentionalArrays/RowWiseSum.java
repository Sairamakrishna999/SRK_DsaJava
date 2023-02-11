/*Sample Input 1:
1
4 2 
1 2 
3 4 
5 6 
7 8
Sample Output 1:
3 7 11 15 
Sample Input 2:
2
2 5 
4 5 3 2 6 
7 5 3 8 9
4 4
1 2 3 4
9 8 7 6
3 4 5 6
-1 1 -10 5
Sample Output 2:
20 32 
10 30 18 -5 
*/
package Milestone2.TwoDimentionalArrays;

	import java.util.*;
	public class RowWiseSum {

		public static void rowWiseSum(int[][] mat) {
			//Your code goes herem=0;
	        int sum=0;
	        for(int r[]: mat){
	            for(int c:r){
	                sum=sum+c;
	            }
	            System.out.print(sum+" ");
	            sum=0;
	        }
		}
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++){
	            int row= sc.nextInt();
	            int column= sc.nextInt();
	            int arr[][]= new int[row][column];
	            rowWiseSum(arr);
	        }
	    }
	}