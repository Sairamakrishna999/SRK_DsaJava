/*Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
*/
package Milestone2.Strings;

public class ReverseStringWordWise {
		public static String reverseWordWise(String input) {
			// Write your code here
			int end = input.length();
			String result = "";
			int i = input.length()-1;
			while(i>=0){
				if(input.charAt(i)==' '){
					result = result+input.substring(i+1,end)+" ";
					end=i;
				}
				i--;
			}
			result = result +input.substring(i+1,end);
			return result;
		}
	}
