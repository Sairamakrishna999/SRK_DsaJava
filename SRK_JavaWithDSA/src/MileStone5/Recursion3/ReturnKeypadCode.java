/*Return Keypad Code
Send Feedback
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/
package MileStone5.Recursion3;

public class ReturnKeypadCode {


		// Return a string array that contains all the possible strings
		public static String[] keypad(int n){
			// Write your code here
			if(n==0){
				String output[]=new String[1];
				output[0]="";
				return output;
			}
			int lastDigit=n%10;
			String smallOuput[]=keypad(n/10);
			String temp = "";
			if(lastDigit==1){
				temp="";
			}
			else if(lastDigit == 2){
				temp="abc";
			}
			else if(lastDigit == 3){
				temp = "def";
			}
			else if(lastDigit == 4){
				temp = "ghi";
			}
			else if(lastDigit == 5){
				temp = "jkl";
			}
			else if(lastDigit == 6){
				temp = "mno";
			}
			else if(lastDigit == 7){
				temp = "pqrs";
			}
			else if(lastDigit == 8){
				temp = "tuv";
			}
			else if(lastDigit == 9){
				temp = "wxyz";
			}

			String output[]= new String[smallOuput.length*temp.length()];
			int k=0;
			for(int i=0;i<smallOuput.length;i++){
				for(int j=0;j<temp.length();j++){
					output[k++]=smallOuput[i]+temp.charAt(j);
				}

			}
			return output;
		}
		
	}
