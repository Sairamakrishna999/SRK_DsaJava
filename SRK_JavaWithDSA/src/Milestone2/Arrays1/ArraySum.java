/*
 4
 9 9 8 7
 output 33
 */
package Milestone2.Arrays1;
import java.util.Scanner;
public class ArraySum {
	public static int sum(int[] arr,int N){
        if(N<=0){
            return 0;
        }
        return sum(arr,N-1)+arr[N-1];
        
    }
	public static int sum(int[] arr) {
		//Your code goes here
        int result = sum(arr,arr.length);
        return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(sum(arr));
	}
}