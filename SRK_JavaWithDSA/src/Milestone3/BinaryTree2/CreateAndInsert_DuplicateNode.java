/*
 Sample Input 1:
10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1
Sample Output 1:
10 
10 30 
20 30 60 
20 50 60 
40 50 
40 
Sample Input 2:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 2:
8 
8 10 
5 10 
5 6 
2 6 7 
2 7
*/
package Milestone3.BinaryTree2;

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

public class CreateAndInsert_DuplicateNode {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        int duplicateData=root.data;
        BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<>(duplicateData);
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        
        duplicate.left=root.left;
        root.left=duplicate;
        
        
	}
	
}