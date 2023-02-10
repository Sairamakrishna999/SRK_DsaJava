/*Code : Triangular Star Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :

*/


package Milestone1.Patterns1;

import java.util.*;
	public class TriangularSquarePattern {


		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
			
		}

	}
