/*
 Sample Input 1:
abc
Sample Output 1:
a 
ab 
abc 
b 
bc 
c 
*/
package Milestone2.Strings;

	import java.util.*;
	public class SubStrings {

		public static void printSubstrings(String str) {
			//Your code goes here
	         for(int i=0;i<str.length();i++){
	            String st ="";
	            for(int j=i;j<str.length();j++){
	                String result = String.valueOf(str.charAt(j));
	                st = st+result;
	                System.out.println(st);
	            }
	        }
		}
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	       printSubstrings(str);
	    }

	}
