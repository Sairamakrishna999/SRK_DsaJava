/*Sample Input 1 :
12345
Sample Output 1 :
15
Sample Input 2 :
9
Sample Output 2 :
9
*/
package Milestone3.RecursionAssignment;

public class SumOfDigits {
	public static int sumOfDigits(int input){
		// Write your code here
        return helper(input,0);
        }
    public static int helper(int input,int sum){
        if(input==0){
            return sum;
        }
        sum=sum+input%10;
        int result=helper(input/10,sum);
        return result;
    }
	}


