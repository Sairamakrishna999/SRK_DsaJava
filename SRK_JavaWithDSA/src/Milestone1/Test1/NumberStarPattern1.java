/*Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321*/
package Milestone1.Test1;

	import java.util.*;
	public class NumberStarPattern1 {

		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++){
	            for(int j=N;j>0;j--){
	                if(j==i){
	                    System.out.print("*");
	                    continue;
	                }
	                System.out.print(j);
	            }
	            System.out.println();
	        }

		}
	}

