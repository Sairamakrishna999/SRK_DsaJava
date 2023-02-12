/* 
 You are given an array find index where leftside sum = rightSide sum
Input:
7
2 3 10 -10 4 2 9
output:
2
 */
package Milestone3.TimeComplexity;

import java.util.Scanner;

public class ArrayEquilibriumIndex {
	public static int findEquilibriumIndex(int arr1[]) {
		int rightSum=0;
		int leftSum=0;
		for(int i=0;i<arr1.length;i++) {
			rightSum=rightSum+arr1[i];
		}
		for(int i=0;i<arr1.length;i++) {
			rightSum=rightSum-arr1[i];
			if(rightSum==leftSum) {
				return i;
			}
			leftSum=leftSum+arr1[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int N = sc.nextInt();
		int arr1[]=new int[N];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		int result = findEquilibriumIndex(arr1);
		System.out.println(result);
	}

}
