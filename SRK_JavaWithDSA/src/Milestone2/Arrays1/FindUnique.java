/*Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
*/
package Milestone2.Arrays1;

public class FindUnique{  
    
    public static int findUnique(int[] arr){
		//Your code goes here
        int k =0;
        for(int i=0;i<arr.length;i++){
            k=k^arr[i];
        }
        return k;
    }
}
