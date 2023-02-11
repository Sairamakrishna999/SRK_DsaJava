/*Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
*/
package Milestone2.Strings;

public class RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String result="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=ch){
				result=result+str.charAt(i);
			}
		}
		return result;
	}

}
