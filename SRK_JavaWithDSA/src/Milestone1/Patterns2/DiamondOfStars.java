/*Code : Diamond of stars
Send Feedback
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.
*/
package Milestone1.Patterns2;

	import java.util.*;
	public class DiamondOfStars {
	    
	    public static void main(String[] args) {
	        // Write your code here
	     Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        if(N%2!=0)
	        {
	            int p=N/2+1;
	            int q=N/2;
	            for(int i=1;i<=p;i++)
	            {
	                for(int space=1;space<=p-i;space++)
	                {
	                    System.out.print(" ");
	                }
	                for(int j=i;j>0;j--)
	                {
	                    System.out.print("*");
	                }
	                for(int k=1;k<=i-1;k++)
	                {
	                    System.out.print("*");
	                }
	                System.out.println();
	            }
	            for(int i=q;i>0;i--)
	            {
	                System.out.print(" ");
	                for(int space=1; space<=q-i;space++)
	                {
	                    System.out.print(" ");
	                }
	                for(int j=i;j>0;j--)
	                {
	                    System.out.print("*");
	                }
	                for(int k=i-1;k>0;k--)
	                {
	                    System.out.print("*");
	                }
	                System.out.println();
	            }
	            
	            
	        }
	    }
	}
