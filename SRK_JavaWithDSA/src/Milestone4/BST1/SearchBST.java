/*Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1 :
true
Sample Input 2 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 2 :
false
*/
package Milestone4.BST1;

public class SearchBST {

		
//		  Binary Tree Node class
		 
class BinaryTreeNode<T> { 
		  T data;
		  BinaryTreeNode<T> left;
		  BinaryTreeNode<T> right;
		  
		   public BinaryTreeNode(T data) {
		   this.data = data;
}
}
		 


		public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
			if(root==null){
				return false;
			}
			if(root.data==k){
				return true;
			}
			if(k<root.data){
				return searchInBST(root.left, k);
			}
			return searchInBST(root.right, k);
		}
	}