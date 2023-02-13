/*Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
1 14
Sample Input 2:
10 20 60 -1 -1 3 50 -1 -1 -1 -1 
Sample Output 2:
3 60
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





//	Representation of the Pair Class

	class PairTree<T, U> {
		T minimum;
		U maximum;

		public PairTree(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}



public class MinimumAndMaximumBTree {
    static int Min=Integer.MAX_VALUE;
    static int Max=Integer.MIN_VALUE;
	public static PairTree<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
        	PairTree<Integer,Integer> p = new PairTree<>(0,0);
            return p;
        }
        if(root.data>Max){
            Max=root.data;
        }
        if(root.data<Min){
            Min=root.data;
        }
        PairTree<Integer,Integer> leftSide=getMinAndMax(root.left);
        PairTree<Integer,Integer> rightSide=getMinAndMax(root.right);
        PairTree<Integer,Integer> p = new PairTree<>(Min,Max);
        return p;
	}
	
}