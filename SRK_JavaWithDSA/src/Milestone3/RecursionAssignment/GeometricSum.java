/*
 Geometric Sum
Send Feedback
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
Input format :
Integer k
Output format :
Geometric sum (upto 5 decimal places)
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
Sample Output 1 :
1.87500
Sample Input 2 :
4
Sample Output 2 :
1.93750
Explanation for Sample Input 1:
1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500
*/
package Milestone3.RecursionAssignment;

public class GeometricSum {
	public static double findGeometricSum(int k){
		// Write your code here
        return helper(k,0);
	}
    public static double helper(int k,double sum){
        if(k==-1){
            return sum;
        }
        sum=sum+(1/(Math.pow(2,k)));
        double result=helper(k-1,sum);
        return result;
    }
}
