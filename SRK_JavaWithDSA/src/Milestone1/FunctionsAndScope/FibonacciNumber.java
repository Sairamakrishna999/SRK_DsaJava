/*
 Fibonacci Number
Send Feedback
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/
package Milestone1.FunctionsAndScope;

public class FibonacciNumber {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
        int p=1,q=1,sum=0;
        while(sum<=n-2){
            sum=p+q;
            if(sum==n){
                return true;
            }
            p=q;q=sum;
        }
        return false;

	}
	

}

