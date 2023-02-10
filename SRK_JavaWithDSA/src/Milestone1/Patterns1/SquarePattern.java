/*  Code : Square Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444   */

package Milestone1.Patterns1;


import java.util.*;
public class SquarePattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>=0 && N<=50)
        {
            int i=1;
            while(i<=N)
            {
                int j=1;
                while(j<=N)
                {
                    System.out.print(N);
                    j++;
                }
                System.out.println();
                i++;
            }
        }
		
	}

}
