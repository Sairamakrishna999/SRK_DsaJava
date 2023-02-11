package Milestone2.Arrays2;

public class SecondLargestInArray {
	    public static int secondLargestElement(int[] arr) {
	    	//Your code goes here
	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>first){
	                second=first;
	                first=arr[i];
	            }
	            else if(arr[i]>second && arr[i]!=first){
	                second=arr[i];
	            }
	        }
	        return second;
	    }

	}