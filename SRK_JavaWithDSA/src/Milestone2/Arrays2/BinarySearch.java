package Milestone2.Arrays2;

	import java.util.*;
	public class BinarySearch { 

	    public static int binarySearch(int[] arr, int x) {
	    	//Your code goes here
	        int start = 0;
	        int end = arr.length-1;
	        int mid = (start+end)/2;
	        while(start<=end){
	            if(x>arr[mid]){
	                start = mid+1;
	            }
	            else if(x<arr[mid]){
	                end = mid-1;
	            }
	            else{
	                mid = mid;
	                break;
	            }
	            mid=(start+end)/2;
	        }
	        if(start>end){
	            mid = -1;
	        }
	        return mid;
	    }

	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int arr[]=new int[N];
	        for(int i=0;i<N;i++){
	            arr[i]=sc.nextInt();
	        }
	        int k = sc.nextInt();
	        for(int i=1;i<=k;i++){
	            int x = sc.nextInt();
	            int result = binarySearch(arr,x);
	            System.out.println(result);
	        }
	    }
	}
