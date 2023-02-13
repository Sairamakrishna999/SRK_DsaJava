/*Sample Input 1:
2 35 10 2 3 5 2 -1 -1 -1 -1 -1 -1 -1 -1 
Sample Output 1:
2 1 2 0 2 1 2 
 Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
2 1 2 0 2 1 2 
*/
package Milestone3.BinaryTrees1;



/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class ReplaceNodeWithDepth {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
        helper(root,0);
	}
    public static void helper(BinaryTreeNode<Integer> root,int level){
        if(root==null){
            return;
        }
        root.data=level;
        helper(root.left,level+1);
        helper(root.right,level+1);
    }

}