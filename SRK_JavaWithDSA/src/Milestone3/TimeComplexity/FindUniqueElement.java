package Milestone3.TimeComplexity;

import java.util.Scanner;

public class FindUniqueElement {
	public static int findUnique(int arr[]) {
		int result =arr[0];
		for(int i=1;i<arr.length;i++) {
			result = result^arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first array");
		int N = sc.nextInt();
		int arr1[]=new int[N];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		int result = findUnique(arr1);
		System.out.println(result);
	}

}
