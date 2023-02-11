/*
Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a seperate line.
 Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648",
 where -2147483648 or -2^31 is the smallest value for the range of Integer.
1
4 4
6 9 8 5 
9 2 4 1 
8 3 9 3 
8 7 8 6 
output:
0 31
*/
package Milestone2.TwoDimentionalArrays;

	import java.util.*;
	public class LargestRowOrSum {

		public static void findLargest(int mat[][]){
			//Your code goes here
	        if(mat.length==0){
	            System.out.print("row "+mat.length+" "+Integer.MIN_VALUE);
	        }
	        else{
	            int sum=0,total1=0,total2=0,c_index=0,r_index=0,GrandTotal=0;
	        for(int i=0;i<mat.length;i++){
	                for(int j=0;j<mat[i].length;j++){
	                    sum=sum+mat[i][j];
	                }
	            if(total1<sum){
	                total1=sum;
	                r_index = i;
	            }
	            sum=0;
	            }
	        sum=0;
	        int col = mat[0].length;
	        
	        // for(int i=0;i<mat.length;i++){
	        //     for(int j=0;j<mat.length;j++){
	        for(int i=0;i<col;i++){
	            
	            for(int j=0;j<mat.length;j++){
	                sum=sum+mat[j][i];
	            }
	            if(total2<sum){
	                total2=sum;
	                c_index=i;
	            }
	            sum=0;
	        }
	        if(total1>=total2){
	            GrandTotal=total1;
	            System.out.println("row "+r_index+" "+GrandTotal);
	        }
	        else{
	            GrandTotal = total2;
	            System.out.println("column "+c_index+" "+GrandTotal);

	        }
	        
	        }
		}
//	     public static int[][] takeInput(){
	         
	        
//	     }
	    public static void main(String args[]){
	       Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int arr[][]= new int[N][N];
	        for(int k=1;k<=N;k++){
	            int row=sc.nextInt();
	            int column=sc.nextInt();
	            arr=new int[row][column];
	            for(int i=0;i<row;i++){
	                for(int j=0;j<column;j++){
	                    arr[i][j]=sc.nextInt();
	                }
	            }
	            findLargest(arr);
	        }
	    }
	}
