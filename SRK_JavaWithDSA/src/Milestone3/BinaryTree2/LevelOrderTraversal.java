/*Sample Input 1:
10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1 
Sample Output 1:
10 
20 30 
40 50 60 
Sample Input 2:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
8 
3 10 
1 6 14 
4 7 13 
*/
package Milestone3.BinaryTree2;


	import java.util.*;
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

	public class LevelOrderTraversal {

		public static void printLevelWise(BinaryTreeNode<Integer> root) {
			//Your code goes here
	        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
	        q.add(root);
	        q.add(null);
	        while(!q.isEmpty()){
	            if(q.size()==1){
	                return;
	            }
	            BinaryTreeNode<Integer> first=q.poll();
	            if(first==null){
	                System.out.println();
	                q.add(null);
	                continue;
	            }
	            System.out.print(first.data+" ");
	            if(first.left!=null && first.right!=null){
	                q.add(first.left);
	                q.add(first.right);
	            }
	            else if(first.left!=null && first.right==null){
	                q.add(first.left);
	            }
	            else if(first.left==null && first.right!=null){
	                q.add(first.right);
	            }
	        }
	        
		}
		
	}