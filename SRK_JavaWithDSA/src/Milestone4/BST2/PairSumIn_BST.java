/*Pair sum in a BST
Send Feedback
Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. You can use extra space of the order of O(log n).
Note:
1. Assume BST contains all unique elements.
2. In a pair, print the smaller element first.
Input Format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
The following line of input contains an integer, that denotes the value of S.
Output format:
You have to print each pair in a different line (pair elements separated by space). The order of different pairs, to be printed, does not matter.
Constraints:
Time Limit: 1 second   
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 1:
2 10
5 7
*/
package Milestone4.BST2;



	import java.util.Arrays;
	public class PairSumIn_BST {

	    /*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;

			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/

	    //         public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
	    //             // Write your code here
	    //           // final  BinaryTreeNode<Integer> a =root;
	    //             if(root==null)
	    //                 return;
	    //             if(root.data<sum)
	    //             {int diff=sum-root.data;
	    //             //         search for difference==========
	    //             boolean findNode=isNodePresent(a,diff);
	    //             if(findNode){
	    //                 if(root.data<diff)
	    //                     System.out.println(root.data+" "+diff);
	    //                 else
	    //                     System.out.println(diff+" "+root.data);   
	    //             }}
	    //             else{
	    //                 nodesSumToS(root.left,sum);
	    //                 nodesSumToS(root.right,sum);
	    //             }
	    //         }

	    //         public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
	    //             /* Your class should be named Solution
	    //     		 * Don't write main().
	    //     		 * Don't read input, it is passed as function argument.
	    //     		 * Return output and don't print it.
	    //     	 	 * Taking input and printing output is handled automatically.
	    //     		*/ 
	    //             if(root==null)
	    //                 return false;
	    //             boolean ans=false;
	    //             if(root.data.equals(x))
	    //                 return true;
	    //             ans=isNodePresent(root.left,x);
	    //             if(ans==true)
	    //                 return true;
	    //             ans=isNodePresent(root.right,x);
	    //             if (ans==true)
	    //                 return true;
	    //             return ans;}

	    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int sum) {
	        if(root==null)
	            return;
	        int[] arr=arrayInsertion(root);
	        Arrays.sort(arr);
	        int i=0;
	        int j=arr.length-1;
	        while(i<j){
	            if(arr[i]+arr[j]==sum){
	                System.out.println(arr[i]+" "+arr[j]);
	                i++;
	                j--;}
	            else if(arr[i]+arr[j]<sum)
	                i++;
	            else 
	                j--;

	        }
	    }
	    private static int[] arrayInsertion(BinaryTreeNode<Integer> root){

	        if(root==null){
	            int[] arr=new int[0];
	            return arr;}
	        int firstData=root.data;

	            int[] jrr= arrayInsertion(root.left);

	        int[] krr= arrayInsertion(root.right);
	        int[] finalArray=new int[1+jrr.length+krr.length];
	        int k=0;
	        finalArray[k]=firstData;
	        k++;
	        for(int i=0;i<jrr.length;i++)
	        {  finalArray[k]=jrr[i];
	         k++;
	        }
	        for(int i=0;i<krr.length;i++)
	        {
	            finalArray[k]=krr[i];
	            k++;
	        }
	        return finalArray;

	    }
	   
	}