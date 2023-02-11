/*
 Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/
package Milestone3.Recursion2;

public class MergeSort {
		public static void mergeSort(int[] input){
			// Write your code here
			if(input.length<=1){
	            return;
	        }
	        int[] a=new int[input.length/2];
	        int[] b=new int[input.length-a.length];
	        for(int i=0;i<a.length;i++){
	            a[i]=input[i];
	        }
	        for(int i=input.length/2;i<input.length;i++){
	            b[i-input.length/2]=input[i];
	        }
	        mergeSort(a);
	        mergeSort(b);
	        SortAndAdd(a,b,input);
		}
	    public static void SortAndAdd(int[] s1,int[] s2,int[] d){
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<s1.length && j<s2.length){
	            if(s1[i]>s2[j]){
	                d[k]=s2[j];
	                j++;
	                k++;
	            }
	            else{
	                d[k]=s1[i];
	                i++;
	                k++;
	            }
	            
	        }
	        if(i<s1.length){
	            while(i<s1.length){
	                d[k]=s1[i];
	                i++;
	                k++;
	            }
	        }
	        if(j<s2.length){
	            while(j<s2.length){
	                d[k]=s2[j];
	                j++;
	                k++;
	            }
	        }
	    }
	}
