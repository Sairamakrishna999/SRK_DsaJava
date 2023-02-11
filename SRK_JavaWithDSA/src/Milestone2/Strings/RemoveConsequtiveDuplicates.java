/*Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
*/
package Milestone2.Strings;

public class RemoveConsequtiveDuplicates {


	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		if(str.length()<=1){
			return str;
		}
		String result="";
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				continue;

			}
			else{
				result=result+str.charAt(i);
			}
		}
		result=result+str.charAt(str.length()-1);
		return result;
	}

}
