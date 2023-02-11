/*
 Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/
package Milestone3.Recursion2;

public class RemoveDuplicatesRecursion {
		public static String removeConsecutiveDuplicates(String s) {
			// Write your code here
			if(s.length()<=1){
				return s;
			}
			String result;
			if(s.charAt(0)==s.charAt(1)){
				result=removeConsecutiveDuplicates(s.substring(1));
			}
			else{
				result=s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
			}
			return result;
		}

	}