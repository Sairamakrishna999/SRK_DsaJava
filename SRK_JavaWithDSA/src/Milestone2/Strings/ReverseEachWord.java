/*Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/
package Milestone2.Strings;

public class ReverseEachWord {

	public static String reverseEachWord(String str) {
		//Your code goes here
		String result = "";
		for(int i=0;i<str.length();i++){
			result=str.charAt(i)+result;
		}
		int end = str.length();
		String output="";
		int i=str.length()-1;
		while(i>=0){
			if(result.charAt(i)==' '){
				output=output+result.substring(i+1,end)+" ";
				end=i;
			}
			i--;
		}
		output=output+result.substring(i+1,end);
		return output;
	}

}