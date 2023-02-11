/*Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
*/
package Milestone3.Recursion2;

public class QuickSort {
		public static void quickSort(int[] input) {
			helper(input,0,input.length-1);
		}
	    public static void helper(int arr[],int si,int ei){
	        if(si>=ei){
	            return;
	        }
	        int pivotIndex=partition(arr,si,ei);
	        helper(arr,si,pivotIndex-1);
	        helper(arr,pivotIndex+1,ei);
	    }
	    public static int partition(int arr[],int si,int ei){
	        int pivotElement=arr[si];
	        int count=0;
	        for(int i=si;i<=ei;i++){
	            if(arr[i]<pivotElement){
	                count++;
	            }
	        }
	        int temp=arr[si+count];
	        arr[si+count]=arr[si];
	        arr[si]=temp;
	        int i=si;
	        int j=ei;
	        while(i<j){
	            if(arr[i]<pivotElement){
	                i++;
	            }
	            else if(arr[j]>=pivotElement){
	                j--;
	            }
	            else{
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	                i++;
	                j--;
	            }
	        }
	        return si+count;
	    }
	}