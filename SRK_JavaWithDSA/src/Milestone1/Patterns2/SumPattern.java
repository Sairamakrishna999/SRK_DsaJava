/*Sum Pattern
Send Feedback
Write a program to print triangle of user defined integers sum.

Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/
package Milestone1.Patterns2;

	import java.util.*;
	public class SumPattern {
		
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for(int i=1;i<=N;i++)
	        {
	        	int sum=0;
	        	for(int j=1;j<=i;j++)
	        	{
	        		
	        		System.out.print(j);
	        		if(j<i)
	        		{
	        			System.out.print("+");
	        		}
	        		sum+=j;
	        		//total=sum;
	        	}
	        	System.out.println("="+sum);
	        	
	        }
		}
	}

