/*
 * Arrange Numbers In Array
 Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
*/package Milestone2.Arrays1;

public class ArrangeNumbers {

    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        if(n%2!=0){
            arr[n/2]=n;
        }
        int k=0;
        int len=n;
        for(int i=0;i<n/2;i++){
            arr[i]=++k;
            arr[len-1]=++k;
            len--;
        }
    }
}