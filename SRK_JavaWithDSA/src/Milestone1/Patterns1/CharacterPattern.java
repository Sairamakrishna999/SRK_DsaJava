/*Code : Character Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
*/
package Milestone1.Patterns1;

	import java.util.*;
	public class CharacterPattern {


		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++)
	        {
	            char p = (char)('A'+i-1);
	            for(int j=i;j>0;j--)
	            {
	                System.out.print(p);
	                p=(char)(p+1);
	            }
	            System.out.println();
	        }

			
		}

	}

