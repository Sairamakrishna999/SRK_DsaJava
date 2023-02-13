/*BST Class
Send Feedback
Implement the BST class which includes following functions -
1. insert -
Given an element, insert that element in the BST at the correct position. If element is equal to the data of the node, insert it in the left subtree.
2. search
Given an element, find if that is present in BST or not. Return true or false.
3. delete -
Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.
4. printTree (recursive) -
Print the BST in in the following format -
For printing a node with data N, you need to follow the exact format -
N:L:x,R:y
where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.
There is no space in between.
You need to print all nodes in the recursive format in different lines.

*/
package Milestone4.BST2;



	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	 /* 
	 * Main Method being used internally
	 *	public static void main(String[] args) throws IOException {
	 *		BinarySearchTree bst = new BinarySearchTree();
	 *		int choice, input;
	 *		int q = Integer.parseInt(br.readLine());
	 *		while (q-- > 0) {
	 *			st = new StringTokenizer(br.readLine());
	 *			choice = Integer.parseInt(st.nextToken());
	 *			switch (choice) {
	 *			case 1:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.insert(input);
	 *				break;
	 *				case 2:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.remove(input);
	 *				break;
	 *			case 3:
	 *				input = Integer.parseInt(st.nextToken());
	 *				System.out.println(bst.search(input));
	 *				break;
	 *			default:
	 *				bst.printTree();
	 *				break;
	 *			}
	 *		}
	 *	}
	 */

	public class BST_Class {
		BinaryTreeNode<Integer> root;
		public void insert(int data) {
			//Implement the insvoiert() function
			root = insert(root,data);
		}
		public BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int element){
			if(root==null){
				BinaryTreeNode<Integer> result = new BinaryTreeNode<>(element);
				return result;
			}
			if(element>root.data){
				root.right=insert(root.right,element);
			}
			if(element<=root.data){
				root.left = insert(root.left,element);
			}
			return root;
		}
		
		public void remove(int data) {
			//Implement the remove() function
			root = remove(root,data);
		}
		public BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root,int data){
			if(root==null){
				BinaryTreeNode<Integer> result = new BinaryTreeNode<>(data);
				return result;
			}
			if(data>root.data){
				BinaryTreeNode<Integer> rightRootHead = remove(root.right,data);
				root.right=rightRootHead;
				return root;
			}
			if(data<root.data){
				BinaryTreeNode<Integer> leftRootHead = remove(root.left,data);
				root.left = leftRootHead;
				return root;
			}
			if(root.right==null && root.left == null){
				return null;
			}
			if(root.right!=null && root.left==null){
				return root.right;
			}
			if(root.left!=null && root.right==null){
				return root.left;
			}
			int rightMin = minimum(root.right);
			BinaryTreeNode<Integer> deleteRightMin = remove(root.right,rightMin);
			root.data=rightMin;
			root.right=deleteRightMin;
			return root;
		}
		public int minimum(BinaryTreeNode<Integer> root){
			if(root==null){
				return Integer.MAX_VALUE;
			}
			int leftMin = minimum(root.left);
			int rightMin = minimum(root.right);
			return Math.min(root.data,Math.min(leftMin,rightMin));
		}
		
		public void printTree() {
			//Implement the printTree() function
			printTree(root);
		}
		public void printTree(BinaryTreeNode<Integer> root){
			if(root==null){
				return;
			}
			System.out.print(root.data+":");
			if(root.left!=null){
				System.out.print("L:"+root.left.data+",");
			}
			if(root.right!=null){
				System.out.print("R:"+root.right.data);
			}
			System.out.println();
			printTree(root.left);
			printTree(root.right);
		}
		
		public boolean search(int data) {
			//Implement the search() function
			return search(root,data);
		}
		public boolean search(BinaryTreeNode<Integer> root,int data){
			if(root==null){
				return false;
			}
			if(root.data==data){
				return true;
			}
			boolean leftSearch=search(root.left,data);
			boolean rightSearch=search(root.right,data);
			return leftSearch || rightSearch;
		}
		

	}