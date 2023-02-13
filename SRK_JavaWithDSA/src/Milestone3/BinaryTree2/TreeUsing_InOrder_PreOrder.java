/*Sample Input 1:
7
1 2 4 5 3 6 7 
4 2 5 1 6 3 7 
Sample Output 1:
1 
2 3 
4 5 6 7 
Sample Input 2:
6
5 6 2 3 9 10 
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

public class TreeUsing_InOrder_PreOrder {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        return Helper(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	}
    public static BinaryTreeNode<Integer> Helper(int[] preOrder,int[] inOrder,int siPre,int eiPre,int siIn,int eiIn){
        if(siPre>eiPre){
            return null;
        }
        int rootData=preOrder[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex=-1;
        for(int i=siIn;i<=eiIn;i++){
            if(rootData==inOrder[i]){
                rootIndex=i;
                break;
            }
        }
        int siLeftPre=siPre+1;
        
        
        int eiRightPre=eiPre;
        int siLeftIn=siIn;
        int eiLeftIn=rootIndex-1;
        int eiLeftPre=siLeftPre+eiLeftIn-siLeftIn;
        int siRightPre=eiLeftPre+1;
        int siRightIn=rootIndex+1;
        int eiRightIn=eiIn;
        
        
        
        BinaryTreeNode<Integer> rootLeft = Helper(preOrder,inOrder,siLeftPre,eiLeftPre,siLeftIn,eiLeftIn);
        BinaryTreeNode<Integer> rootRight = Helper(preOrder,inOrder,siRightPre,eiRightPre,siRightIn,eiRightIn);
        root.left=rootLeft;
        root.right=rootRight;
        return root;
    }

}