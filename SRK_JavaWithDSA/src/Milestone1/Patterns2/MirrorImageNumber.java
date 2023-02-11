/*Code : Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
   1 
  12
 123
1234
The dots represent spaces.
*/
package Milestone1.Patterns2;

	import java.util.*;
	public class MirrorImageNumber {


		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++)
	        {
	            for(int space =1;space<=N-i;space++)
	            {
	                System.out.print(" ");
	                
	            }
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

			
		}

	}

