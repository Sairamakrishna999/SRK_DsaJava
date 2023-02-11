/*Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
*/
package Milestone2.Arrays2;

public class RotateArray {
  
    public static void reverse(int arr[],int start,int end)
    {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        if(arr.length==0){
            return;
        }
        if(arr.length!=0 && d>=arr.length){
            d=d%arr.length;
        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);
    }

}
