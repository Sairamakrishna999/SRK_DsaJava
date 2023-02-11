/*Sample Input 1:
Coding Ninjas!
Sample Output 1:
2
Sample Input 2:
this is a sample string
Sample Output 2:
5*/
package Milestone2.Strings;

public class CountWords {

	public static int countWords(String str) {	
		//Your code goes here
		if(str.length()==0){
			return 0;
		}
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				count++;
			}
		}
		return count+1;
	}

}