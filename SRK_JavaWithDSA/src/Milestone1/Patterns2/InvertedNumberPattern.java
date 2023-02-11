/*Code : Inverted Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
*/
package Milestone1.Patterns2;


	import java.util.*;
	public class InvertedNumberPattern {


		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=N;i>0;i--)
	        {
	            for(int j=i;j>0;j--)
	            {
	                System.out.print(i);
	            }
	            System.out.println();
	            
	        }
			
		}

	}
