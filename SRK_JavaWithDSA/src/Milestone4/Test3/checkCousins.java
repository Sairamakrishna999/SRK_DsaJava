/*Check cousins
Send Feedback
Given the binary Tree and two nodes say ‘p’ and ‘q’. Determine whether the two nodes are cousins of each other or not. Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and have different parents.
Do it in O(n).
Input format :
Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
Line 2 : integer value of p 
Line 3 : Integer value of q
Output format :
true or false
Constraints :
1 <= N <= 10^5
Sample Input :
5 6 10 2 3 4 -1 -1 -1 -1 9 -1 -1 -1 -1
2
4
Sample Output :
true

*/
package Milestone4.Test3;



	import java.util.ArrayList;
	import java.util.*;
//	Binary Tree Node class
	 
	 class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 
	public class checkCousins {

		

		public static boolean isCousin(BinaryTreeNode<Integer> root, int x, int y) {

	        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
	        if(root == null) return false;
	        queue.add(root);
	        int depthY = -1;
	        int depthX = -2;
	        int level = 0;
	        while(!queue.isEmpty()){
	            int size = queue.size();
	            for(int i = 0 ; i < size ; i++){
	                BinaryTreeNode<Integer> node = queue.remove();
	                if(node.left != null && node.right != null){
	                    if(node.left.data == x && node.right.data == y) return false;
	                    if(node.left.data == y && node.right.data == x) return false;
	                }
	                if(node.data == x) depthX = level;
	                if(node.data == y) depthY = level;
	                if(node.left != null) queue.add(node.left);
	                if(node.right != null) queue.add(node.right);
	            }
	            level++;
	        }
	        return depthX == depthY;
		}
	}
