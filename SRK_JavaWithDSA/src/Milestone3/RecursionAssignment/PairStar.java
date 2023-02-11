/*
 Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a
*/package Milestone3.RecursionAssignment;

public class PairStar {
	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		String result = "";
		return addStars(s,0,result);
	}
	public static String addStars(String s, int si,String result){
		if(si==s.length()-1){
			return result+s.charAt(si);
		}
		if(s.charAt(si)==s.charAt(si+1)){
			result=result+s.charAt(si)+"*";
		}
		else{
			result=result+s.charAt(si);
		}
		String finalOutput= addStars(s,si+1,result);
		return finalOutput;
	}
}
