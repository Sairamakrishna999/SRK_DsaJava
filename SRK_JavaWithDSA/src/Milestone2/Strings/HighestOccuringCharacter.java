/*Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
*/
package Milestone2.Strings;

	import java.util.*;
	public class HighestOccuringCharacter {

		public static char highestOccuringChar(String str) {
			//Your code goes here
			HashMap<Character,Integer> map = new HashMap<>();
			for(int i=0;i<str.length();i++){
				if(map.containsKey(str.charAt(i))){
					map.put(str.charAt(i),map.get(str.charAt(i)+1));
				}
				else{
					map.put(str.charAt(i),1);
				}
			}
			int max = Integer.MIN_VALUE;
			char ch ='\0';
			for(Map.Entry<Character,Integer> obj : map.entrySet()){
				if(obj.getValue()>max){
					// max=obj.getKey();
					ch=obj.getKey();
				}
			}
			return ch;
		}

	}