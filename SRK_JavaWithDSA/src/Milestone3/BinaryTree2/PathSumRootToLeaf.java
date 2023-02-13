/*Sample Input 1:
2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
13
 Sample Output 1:
2 3 4 4 
2 3 8
Sample Input 2:
5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
13
 Sample Output 2:
5 6 2
5 7 1
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

public class PathSumRootToLeaf {
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String str){
        if(root==null){
            return;
        }
        // if(k<=0 && (root.left!=null || root.right!=null)){
        //     str=str+root.data;
        //     return;
        // }
        if(k==root.data && (root.left==null && root.right==null)){
            System.out.println(str+root.data);
            return;
        }
        k=k-root.data;
        str=str+root.data+" ";
        rootToLeafPathsSumToK(root.left,k,str);
        
        rootToLeafPathsSumToK(root.right,k,str);
        
    }
        
    
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        String str ="";
        rootToLeafPathsSumToK(root,k,str);
        
        
	}

}