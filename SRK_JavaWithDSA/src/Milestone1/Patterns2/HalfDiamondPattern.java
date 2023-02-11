/*Half Diamond Pattern
Send Feedback
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/
package Milestone1.Patterns2;

	import java.util.*;
	public class HalfDiamondPattern {
	    
	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        System.out.println("*");
	        for(int i=1;i<=N;i++)
	        {
	            System.out.print("*");
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print(j);
	            }
	            for(int k=i-1;k>0;k--)
	            {
	                System.out.print(k);
	            }
	            System.out.println("*");
	        }
	        for(int i=N-1;i>0;i--)
	        {
	            System.out.print("*");
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print(j);
	            }
	            for(int k=i-1;k>0;k--)
	            {
	                System.out.print(k);
	            }
	            System.out.println("*");
	        }
	        System.out.print("*");
	    }
	}
