package Milestone2.Arrays2;

public class MergeTwoSortedArrays {


    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int i=0,j=0,k=0;
        int newArr[]=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
            newArr[k]=arr2[j];
                j++;
                k++;
            }
            else{
                newArr[k]=arr1[i];
                i++;
                k++;
            }
            
        }
        while(i<arr1.length){
            newArr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            newArr[k]=arr2[j];
            j++;
            k++;
        }
        return newArr;
    }

}
