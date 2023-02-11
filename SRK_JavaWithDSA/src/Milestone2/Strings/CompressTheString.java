/*Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Explanation for Sample Output 1:
In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is repeated 2 times and 'd', 's' and 'a' and occuring 1 time hence no compression for last 3 characters.
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
Explanation for Sample Output 2:
In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is occuring single time,
 'd' is repeating 2 times and 'e' is repeating 5times.*/
package Milestone2.Strings;

public class CompressTheString {
		public static String getCompressedString(String str) {
			// Write your code here.
	        
	        
	        
	        
	        
	       // char ch = (char) str.charAt(0);
	        
	        int count = 1;
	        
	        String str2=Character.toString(str.charAt(0));
	        
	        
	        for(int i = 1;i<str.length();i++){
	            	
	            	
				if(str.charAt(i) == str.charAt(i-1)){
	                
	                count++;
	                
	            }else{
	                if(count > 1) str2 += count;
	                count=1;
	                str2=str2+str.charAt(i);
	            }
	            	
	            

	        }
	        
	        	if(count > 1) str2 += count;
		
	        	return str2;
	        
	        
		}

	}
