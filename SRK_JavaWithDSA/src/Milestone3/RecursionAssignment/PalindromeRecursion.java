/*Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/
package Milestone3.RecursionAssignment;

public class PalindromeRecursion {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        String duplicate = input;
        int ei = duplicate.length()-1;
        return helper(input,duplicate,0,ei);

	}
    public static boolean helper(String input,String duplicate,int si,int ei){
        if(ei==-1){
            return true;
        }
        if(duplicate.charAt(ei)!=input.charAt(si)){
            return false;
        }
        boolean result=helper(input,duplicate,si+1,ei-1);
        return result;
    }
}
