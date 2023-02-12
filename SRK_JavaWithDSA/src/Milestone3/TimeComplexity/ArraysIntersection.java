package Milestone3.TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntersection {
	public static void printIntersection(int arr1[],int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n = arr1.length;
		int m = arr2.length;
		int i=0;int j=0;
		while(i<n && j<m) {
			if(arr1[i]==arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first array");
		int N = sc.nextInt();
		int arr1[]=new int[N];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the length of second array");
		int N1 =sc.nextInt();
		int arr2[]=new int[N1];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		printIntersection(arr1,arr2);
	}
}
