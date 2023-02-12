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
package Milestone3.TimeComplexity;

public class RotateArray {
  
    public static void rotate(int[] arr, int d) {
    	//Your code goes her
    	//Eg 12345  2
    	//Rotate complete array
        rotate(arr,0,arr.length);//-> 54321
        //rotate till len-d 
        rotate(arr,0,arr.length-d);//-> 34521
        //rotate from len-d till end 
        rotate(arr,arr.length-d,arr.length);//->34512
    }
    public static void rotate(int arr[],int start,int end){
        int temp;
        end=end-1;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
