/*
Sample Input 1 :
abcdcba
Sample Output 1 :
true 
Sample Input 2:
coding
Sample Output 2:
false
*/
package Milestone2.Strings;

	import java.util.*;
	public class StringPalindrome {

		public static boolean isPalindrome(String str) {

	        String newStr = "";
	        for(int i=0;i<str.length();i++){
	            newStr=str.charAt(i)+newStr;
	        }
	        return newStr.equals(str);
		}
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        isPalindrome(str);
	    }
	}
