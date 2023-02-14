/*Print Permutations of a String
Send Feedback
Given a string, find and print all the possible permutations of the input string.
Note : The order of permutations are not important. Just print them in different lines.
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

public class printPermutationsOf_String {


		public static void permutations(String input){
			// Write your code here
	        
	        print(input,"");

		}
	    
	    private static void print(String input,String output){
	        if(input.length() == 0){
	            System.out.println(output);
	            return;
	        }
	        
	        for(int i=0;i<input.length();i++){
	            String str = input.substring(0,i) + input.substring(i+1,input.length());    
	            print(str , output + input.charAt(i));
	        }
	        
	        // input = input.substring(1);
	        // print(input,output);
	        
	        
	    }
	    
	    
	}