/*Does s contain t ?
Send Feedback
Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
Input Format :
Line 1 : String s
Line 2 : String t
Output Format :
true or false
Sample Input 1 :
abchjsgsuohhdhyrikkknddg
coding
Sample Output 1 :
true
Sample Input 2 :
abcde
aeb
Sample Output 2 :
false
*/
package Milestone3.Test1;

import java.util.Scanner;

public class Does_S_contain_T {
	public static boolean checkScontainsT(String s,String t) {
		return checkScontainsT(s,t,0,0);
	}
	public static boolean checkScontainsT(String s,String t,int si,int ti) {
		if(ti==t.length()) {
			return true;
		}
		if(si==s.length()) {
			return false;
		}
		if(s.charAt(si)==t.charAt(ti)) {
			si++;
			ti++;
		}
		else {
			si++;
		}
		return checkScontainsT(s,t,si,ti);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean result = checkScontainsT(s,t);
		System.out.println(result);
	}
}
