/*Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
 Sample Output 1:
8:L:3,R:10
3:L:1,R:6
10:L:-1,R:14
1:L:-1,R:-1
6:L:4,R:7
14:L:13,R:-1
4:L:-1,R:-1
7:L:-1,R:-1
13:L:-1,R:-1
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
 Sample Output 2:
1:L:2,R:3
2:L:4,R:5
3:L:6,R:7
4:L:-1,R:-1
5:L:-1,R:-1
6:L:-1,R:-1
7:L:-1,R:-1
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

	public class PrintLevelWise {

		public static void printLevelWise(BinaryTreeNode<Integer> root) {
			//Your code goes here
	        if(root==null){
	            return;
	        }
	        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();
	        pendingNodes.add(root);
	        pendingNodes.add(null);
	        while(pendingNodes.size()!=1){
	            BinaryTreeNode<Integer> presentNode = pendingNodes.poll();
	            if(presentNode==null){
	                // System.out.println();
	                pendingNodes.add(null);
	            }
	            else{
	                System.out.print(presentNode.data+":L:");
	            
	                if(presentNode.left!=null){
	                    System.out.print(presentNode.left.data+",R:");
	                    pendingNodes.add(presentNode.left);
	                }
	                else{
	                    System.out.print(-1+",R:");
	                }
	                if(presentNode.right!=null){
	                    System.out.print(presentNode.right.data);
	                    System.out.println();
	                    pendingNodes.add(presentNode.right);
	                }
	                else{
	                System.out.print("-1");
	                System.out.println();
	                }
	        }
	        }
		}
		
	}
