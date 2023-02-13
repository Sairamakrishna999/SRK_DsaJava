/*Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
9    
Sample Input 2:
2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
6 7  
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

public class NodesWithoutSibling {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        // if((root.left==null && root.right!=null) || (root.right==null && root.left!=null)){
        //     System.out.print(root.data+" ");
        // }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data+" ");
        }
        if(root.left!=null && root.right==null){
            System.out.print(root.left.data+" ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
        
	}

}