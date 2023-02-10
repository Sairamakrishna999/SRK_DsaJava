/*Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/
package Milestone1.Patterns1;


	import java.util.*;
	public class InterestingAlphabets {
		public static void main(String[] args) {
			//Your code goes here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++)
	        {
	            char p = (char)('A'+N-i);
	            for(int j=i;j>0;j--)
	            {
	                System.out.print(p);
	                p=(char)(p+1);
	                
	            }
	            System.out.println();
	        }
		}
	}
