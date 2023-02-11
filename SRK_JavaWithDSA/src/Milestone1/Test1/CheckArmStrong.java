/*Check Armstrong
Send Feedback
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
Input Format :
Integer n
Output Format :
true or false
Sample Input 1 :
1
Sample Output 1 :
true
Sample Input 2 :
103
Sample Output 2 :
false
*/
package Milestone1.Test1;

	import java.util.*;
	public class CheckArmStrong {
		public static int Armstrong(int n,int j){
			int count=0;
			while(j>0) {
				j=j/10;
				count++;
			}
	        int sum=0;
	        while(n>0){
	            int k=n%10;
	            n=n/10;
	            sum=(int)(sum+(Math.pow(k, count)));
	        }
	        return sum;
	    }
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int result=Armstrong(N,N);
	        
	        if(result==N) {
	        	System.out.println("true");
	        }
	        else {
	        	System.out.println("false");
	        }
		}
	}

