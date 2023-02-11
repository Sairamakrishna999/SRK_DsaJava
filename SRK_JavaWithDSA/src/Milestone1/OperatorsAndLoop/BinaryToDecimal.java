/*
 Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7*/
package Milestone1.OperatorsAndLoop;

import java.util.*;
public class BinaryToDecimal {
		
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc =new Scanner(System.in);
	        int N = sc.nextInt();
	        int sum=0;
	        int i=0;
	        while(N>0)
	        {
	            
	            if(N%10==1)
	            {
	                sum=(int)(sum+Math.pow(2,i));
	            }
	            N=N/10;
	            i++;
	        }
	        System.out.print(sum);
		}
	}
