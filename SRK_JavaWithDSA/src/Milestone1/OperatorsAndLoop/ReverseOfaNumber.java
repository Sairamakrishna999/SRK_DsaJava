/*Reverse of a number
Send Feedback
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891
*/
package Milestone1.OperatorsAndLoop;


	import java.util.*;
	public class ReverseOfaNumber {
		
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int remainder=0;
	        int k;
	        while(N>0)
	        {
	            k=N%10;
	            remainder = remainder*10+k;
	            N=N/10;
	        }
	        System.out.print(remainder);
		}
	}

