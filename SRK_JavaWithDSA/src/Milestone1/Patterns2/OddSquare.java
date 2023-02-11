/*
 Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
*/

package Milestone1.Patterns2;
import java.util.*;
public class OddSquare {		
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=2*N;i+=2)
	        {
	            for(int j=i;j<=2*N;j+=2)
	            {
	                System.out.print(j);
	            }
	            for(int k=1;k<i;k+=2)
	            {
	                System.out.print(k);
	            }
	            System.out.println();
	        }
		}
	}

