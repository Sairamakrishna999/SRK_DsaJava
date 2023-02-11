package Milestone2.Arrays2;

public class PushZerosToEnd {

	    public static void pushZerosAtEnd(int[] arr) {
	    	//Your code goes here
	        int nonZeroCount=0;
	        int zeroCount=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]!=0){
	                nonZeroCount++;
	            }
	        }
	    }

	}
