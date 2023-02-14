/*Return Permutations of a String
Send Feedback
Given a string, find and return all the possible permutations of the input string.
Note : The order of permutations are not important.
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba
*/
package MileStone5.Recursion3;

public class ReturnPermutationsString {

		
		public static String[] permutationOfString(String input){
			// Write your code here
	        if(input.length() == 0){
	            String y[] = {""};
	            return y;
	        }
	        
	        String [] ans = permutationOfString(input.substring(1));
	      //  char ch = input.charAt(0);
			String output[] = new String[ans.length*input.length()];
	        
	        int k=0;
	        for(int i=0;i<ans.length;i++){
	            
	            for(int j=0;j<=ans[i].length();j++){
	                output[k++] = ans[i].substring(0,j) + input.charAt(0) + ans[i].substring(j);
	            }
	        }
	        
	        return output;
		}
		
	}