/*
 * Sample Input :
abacd
a x
Sample Output :
xbxcd
*/
package Milestone3.Recursion2;

public class ReplaceCharUsingRecursion {
	public static String replaceCharacter(String input, char c1, char c2) {

		 if(input.length()==0){
			 return input;
		 }
		 String result;
		 if(input.charAt(0)==c1){
			 result=c2+replaceCharacter(input.substring(1),c1,c2);
		 }
		 else{
			 result=input.charAt(0)+replaceCharacter(input.substring(1),c1,c2);
		 }
		 return result;
	}
}
