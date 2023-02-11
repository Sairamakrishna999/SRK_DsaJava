/*Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
*/
package Milestone3.Recursion2;

public class removeX {
	// Return the changed string
	public static String removeX(String input){
		// Write your code here
		String result;
		if(input.length()==0){
			return input;
		}
		if(input.charAt(0)=='x'){
			result= removeX(input.substring(1));
		}
		else{
			result=input.charAt(0)+removeX(input.substring(1));
		}
		return result;
	}
}
