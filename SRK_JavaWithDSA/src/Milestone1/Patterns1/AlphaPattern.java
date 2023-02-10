/*Code : Alpha Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
 */
package Milestone1.Patterns1;


	import java.util.*;
	public class AlphaPattern {

		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=65;i<N+65;i++)
	        {
	            for(int j=i;j>=65;j--)
	            {
	                char ch = (char)i;
	                System.out.print(ch);
	            }
	            System.out.println();
	        }

			
		}

	}