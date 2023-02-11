/*Parallelogram Pattern
Send Feedback
Write a program to print parallelogram pattern for the given N number of rows.
For N = 5
*****
 *****
  *****
   *****
    *****
The dots represent spaces.
*/
package Milestone1.Patterns2;

	import java.util.*;
	public class paralellogramPattern {
		
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++)
	        {
	            for(int space=i;space>1;space--)
	            {
	                System.out.print(" ");
	            }
	            for(int k=N;k>0;k--)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		}
	}
