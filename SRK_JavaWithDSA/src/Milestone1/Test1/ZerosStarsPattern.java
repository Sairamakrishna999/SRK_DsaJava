/*Zeros and Stars Pattern
Send Feedback
Print the following pattern
Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
*00*00*
0*0*0*0
00***00
Sample Input 2 :
5
Sample Output 2 :
*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000
*/
package Milestone1.Test1;

	import java.util.*;
	public class ZerosStarsPattern {

		public static void main(String[] args) {

			/*  Read input as specified in the question.
	    		 * Print output as specified in the question.
	    		 */
	        Scanner sc =new Scanner(System.in);
	        int N =sc.nextInt();
	        for(int i=1;i<=N;i++){
	            for(int j=1;j<=2*N+1;j++){
	                if(j==N+1){
	                    System.out.print("*");
	                    continue;
	                }
	                if(j==i) {
	                	System.out.print("*");
	                	continue;
	                }
	                if(j==(2*N+1-i+1)) {
	                	System.out.print("*");
	                	continue;
	                }
	                System.out.print("0");
	            }
	            System.out.println();
	        }
			
		}	


	}

