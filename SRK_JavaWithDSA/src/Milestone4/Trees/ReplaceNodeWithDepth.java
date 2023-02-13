/*Replace node with depth
Send Feedback
In a given Generic Tree, replace each node with its depth value. You need to just update the data of each node, no need to return or print anything.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 : (Level wise, each level in new line)
0 
1 1 1 
2 2
*/
package Milestone4.Trees;


	import java.util.*;
	public class ReplaceNodeWithDepth {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;

			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/
		
		public static void replaceWithDepthValue(TreeNode<Integer> root){

			// Write your code here
			if(root==null){
	            return;
	        }
	        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
	        q.add(root);
	        q.add(null);
	        int count=0;
	        while(q.size()!=1){
	            TreeNode<Integer> first = q.poll();
	            if(first==null){
	                count++;
	                q.add(null);
	            }
	            else{
	                first.data=count;
	                for(int i=0;i<first.children.size();i++){
	                    q.add(first.children.get(i));
	                }
	            }
	        }
		}
		
		
	}
