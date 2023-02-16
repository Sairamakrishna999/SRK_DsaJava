/*Break Numbers
Given an integer n, break it into smaller numbers such that their summation is equal to n. Print all such combinations in different lines.
Note : [1, 2, 1] and [1,1, 2] are same, so print the particular sequence with increasing order. Order of different combinations doesn't matter.
Input format :
Integer n
Output format :
Print all possible combinations in different lines
Constraints :
1 <= n <= 100
Input :
4
Output :
1 1 1 1
1 1 2
1 3
2 2
4
*/
package MileStone5.FinalExam.Test2;





/*
    Time complexity : O(N^N)
    Space complexity : O(N)

    Where N is the given number.
*/

import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class BreakNumbers {
	static void printPartitions(int target, int maxValue, String suffix) {
    if (target == 0)
        System.out.println(suffix);
    else {
        if (maxValue > 1)
            printPartitions(target, maxValue-1, suffix);
        if (maxValue <= target)
            printPartitions(target-maxValue, maxValue, maxValue + " " + suffix);
    }
}
	public static void printCombination(int num){
		
		printPartitions(num,num,"");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		printCombination(num);
	}}