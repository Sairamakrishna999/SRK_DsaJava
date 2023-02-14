/*LCS - Problem
Send Feedback
Given two strings, 'S' and 'T' with lengths 'M' and 'N', find the length of the 'Longest Common Subsequence'.
For a string 'str'(per se) of length K, the subsequences are the strings containing characters in the same relative order as they are present in 'str,' but not necessarily contiguous. Subsequences contain all the strings of length varying from 0 to K.
Example :
Subsequences of string "abc" are:  ""(empty string), a, b, c, ab, bc, ac, abc.
Input format :
The first line of input contains the string 'S' of length 'M'.

The second line of the input contains the string 'T' of length 'N'.
Output format :
Return the length of the Longest Common Subsequence.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
adebc
dcadb
Sample Output 1 :
3
Explanation of the Sample Output 1 :
Both the strings contain a common subsequence 'adb', which is the longest common subsequence with length 3. 
Sample Input 2 :
ab
defg
Sample Output 2 :
0
Explanation of the Sample Output 2 :
The only subsequence that is common to both the given strings is an empty string("") of length 0.
*/
package MileStone5.DynamicProgramming2;

public class LCS {


	public static int lcs(String s, String t) {
		//Your code goes here
		int m = s.length();
		int n = t.length();
		int arr[][]=new int[m+1][n+1];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=-1;
			}
		}
		return lcs(s,t,arr,0,0);
    }
	public static int lcs(String s,String t,int arr[][],int i,int j){
		if(i==s.length() || j==t.length()){
			return 0;
		}
		int answer;
		if(s.charAt(i)==t.charAt(j)){
			int smallAns;
			if(arr[i+1][j+1]==-1){
				smallAns = lcs(s,t,arr,i+1,j+1);
				arr[i+1][j+1]=smallAns;
			}
			else{
				smallAns=arr[i+1][j+1];
			}
			answer=smallAns+1;
		}
		else{
			int result1,result2;
			if(arr[i+1][j]==-1){
				result1=lcs(s,t,arr,i+1,j);
				arr[i+1][j]=result1;
			}
			else{
				result1 = arr[i+1][j];
			}
			if(arr[i][j+1]==-1){
				result2  = lcs(s,t,arr,i,j+1);
				arr[i][j+1]=result2;
			}
			else{
				result2 = arr[i][j+1];
			}
			answer = Math.max(result1,result2);
		}
		return answer;
	}
}
