/*Sample Input 1:
1
6
9 3 6 12 4 32
Sample Output 1 :
3 9 12 6 32 4
Sample Input 2:
2
9
9 3 6 12 4 32 5 11 19
4
1 2 3 4
Sample Output 2 :
3 9 12 6 32 4 11 5 19 
2 1 4 3 
*/
package Milestone2.Arrays1;

import java.util.Scanner;

public class SwapAlternative {    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int len = arr.length;
        if(len%2!=0){
            len=len-1;
        }
        for(int i=0;i<len;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		swapAlternate(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
