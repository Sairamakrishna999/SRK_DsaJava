/*Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.
*/
package Milestone1.Patterns2;

	import java.util.Scanner;

	public class TriangleOfNumbers {

		public static void main(String[] args) {
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++)
	        {
	            for(int space=1;space<=N-i;space++)
	            {
	                System.out.print(" ");
	            }
	            for(int num=i;num<=(2*i-1);num++)
	            {
	                System.out.print(num);
	                
	            }
	            for(int p=(2*i-2);p>=i;p--)
	            {
	                System.out.print(p);
	            }
	            System.out.println();
	        }
		}
	}

