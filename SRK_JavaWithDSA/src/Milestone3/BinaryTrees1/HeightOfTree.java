/*Sample Input 1:
10 20 30 40 50 -1 -1 -1 -1 -1 -1
Sample Output 1:
3
Sample Input 2:
3 -1 -1
Sample Output 2:
1
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

public class HeightOfTree {

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return 0;
        }
        int leftSide=height(root.left);
        int rightSide=height(root.right);
        return 1+Math.max(leftSide,rightSide);
	}

}