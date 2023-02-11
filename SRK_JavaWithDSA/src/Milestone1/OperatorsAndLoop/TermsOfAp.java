/*Terms of AP
Send Feedback
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
*/
package Milestone1.OperatorsAndLoop;
import java.util.*;
public class TermsOfAp {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            int k = (3*i+2);
            if(k%4==0)
            {
                N++;
                continue;
            }
            System.out.print(k+" ");
        }
	}
}
