/*Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0*/
package Milestone2.Arrays2;

public class SumOf2Arrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        int k= Math.max(arr1.length,arr2.length);
        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            k--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            j--;
            k--;
        }
        output[0]=carry;
    }

}
