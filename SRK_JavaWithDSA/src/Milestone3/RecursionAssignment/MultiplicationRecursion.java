/*
 Sample Input 1 :
3 
5
Sample Output 1 :
15
Sample Input 2 :
4 
0
Sample Output 2 :
0
*/
package Milestone3.RecursionAssignment;

public class MultiplicationRecursion {
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        return helper(m,n,0);
	}
    public static int helper(int m,int n,int sum){
        if(m==0){
            return sum;
        }
        sum=sum+n;
        int result=helper(m-1,n,sum);
        return result;
    }
}
