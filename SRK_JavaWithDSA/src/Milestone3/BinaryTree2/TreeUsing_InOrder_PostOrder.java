/*Sample Input 1:
7
4 5 2 6 7 3 1 
4 2 5 1 6 3 7 
Sample Output 1:
1 
2 3 
4 5 6 7 
Sample Input 2:
6
2 9 3 6 10 5 
2 6 3 9 5 10 
Sample Output 2:
5 
6 10 
2 3 
9 
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

public class TreeUsing_InOrder_PostOrder {
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int siPost,int eiPost,int siIn,int eiIn){
        if(siIn>eiIn){
            return null;
        }
        int rootData=postOrder[eiPost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex=-1;
        for(int i=siIn;i<=eiIn;i++){
            if(rootData==inOrder[i]){
                rootIndex=i;
                break;
            }
        }
        int siLeftPost=siPost;
        
        int siLeftIn=siIn;
        int eiLeftIn=rootIndex-1;
        int siRightIn=rootIndex+1;
        int eiRightIn=eiIn;
        int leftLength=eiLeftIn-siLeftIn+1;
        int rightLength=eiRightIn-siRightIn+1;
        
        int eiLeftPost=siLeftPost+leftLength-1;
        int siRightPost=eiLeftPost+1;
        int eiRightPost=siLeftPost+leftLength+rightLength-1;
        BinaryTreeNode<Integer> leftTree=buildTree(postOrder,inOrder,siLeftPost,eiLeftPost,siLeftIn,eiLeftIn);
        BinaryTreeNode<Integer> rightTree=buildTree(postOrder,inOrder,siRightPost,eiRightPost,siRightIn,eiRightIn);
        root.left=leftTree;
        root.right=rightTree;
        return root;
    }
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> root = buildTree(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
        return root;
	}

}