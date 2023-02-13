/*Sample Input 1:
1 4 2 3 -1 -1 -1
2
Sample Output 1:
2
Explanation for Sample Input 1:
Out of the four nodes of the given binary tree, [3, 4] are the node data that are greater than X = 2.
Sample Input 2:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
5
Sample Output 2:
3
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

public class NodesGreaterThan_X {
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
        int count=0;
        if(root==null){
            return 0;
        }
        if(root.data>x){
            count++;
        }
        if(root.left!=null){
        count=count+countNodesGreaterThanX(root.left,x);
        }if(root.right!=null){
        
        count=count+countNodesGreaterThanX(root.right,x);
        }
        return count;
	}

}