/*Diameter of a Tree
The diameter of a tree can be defined as the maximum distance between two leaf nodes.
Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes,
 including both the leaves.
 Sample Input 1:
2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1 
Sample Output 1:
9
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
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
class Pair{
	int diameter;
	int height;
	Pair(int height,int diameter){
		this.diameter=diameter;
		this.height=height;
	}
}
public class DiameterBinaryTree {

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		Pair result = helper(root);
		return result.diameter;

	}
	public static Pair helper(BinaryTreeNode<Integer> root){
		if(root==null){
			return new Pair(0,0);
		}
		Pair leftDiameter = helper(root.left);
		Pair rightDiameter = helper(root.right);
		int height = 1+Math.max(leftDiameter.height,rightDiameter.height);
		int diameter = 1+leftDiameter.height+rightDiameter.height;
		Pair result = new Pair(height,diameter);
		return result;
	}
	
}