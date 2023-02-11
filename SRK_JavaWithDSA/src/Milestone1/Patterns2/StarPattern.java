/*Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.
*/
package Milestone1.Patterns2;

import java.util.*;
public class StarPattern {


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
            for(int star=(2*i-1);star>0;star--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}

