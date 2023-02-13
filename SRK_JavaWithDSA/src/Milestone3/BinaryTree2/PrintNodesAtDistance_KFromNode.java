/*
 Print nodes at distance k from node
Send Feedback
You are given a Binary Tree of type integer, a target node, and an integer value K.
Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
3 1
Sample Output 1:
9
6
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
3 3
Sample Output 2:
4
5
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

public class PrintNodesAtDistance_KFromNode {
    public static void printNodesAtDepthK(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return;
        }
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            
        }
        printNodesAtDepthK(root.right,k-1);
        printNodesAtDepthK(root.left,k-1);
    }
    public static int helper(BinaryTreeNode<Integer> root, int node, int k){
        if(root==null){
            return -1;
            
        }
        if(root.data==node){
            printNodesAtDepthK(root,k);
            return 0;
        }
        int leftDistance=helper(root.left,node,k);
        if(leftDistance!=-1){
            if(leftDistance+1==k){
                System.out.println(root.data);
            }
            else{
                printNodesAtDepthK(root.right,k-leftDistance-2);
            }
            return leftDistance+1;
        }
        int rightDistance=helper(root.right,node,k);
        if(rightDistance!=-1){
            if(rightDistance+1==k){
                System.out.println(root.data);
            }
            else{
                printNodesAtDepthK(root.left,k-rightDistance-2);
            }
            return rightDistance+1;
        }
        return -1;
        
    }
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
        int result = helper(root,node,k);
        return;
	}

}