/*Code : Find Height
Send Feedback
Given a generic tree, find and return the height of given tree.
Input Format:
The first line of input contains data of the nodes of the tree in level order form. The order is: data for root node, number of children to root node, data of each of child nodes and so on and so forth for each node. The data of the nodes of the tree is separated by space.  
Output Format :
The first and only line of output prints the height of the given generic tree.
Constraints:
Time Limit: 1 sec
Sample Input 1:
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1:
3
*/
package Milestone4.Trees;


	import java.util.*;
	public class Height_Tree {

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

		public static int getHeight(TreeNode<Integer> root){
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
			 * Taking input and printing output is handled automatically.
			 */
	        if(root==null){
	            return 0;
	        }
	        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
	        q.add(root);
	        q.add(null);
	        int count=1;
	        while(q.size()!=1){
	            TreeNode<Integer> first = q.poll();
	            if(first==null){
	                q.add(null);
	                count++;
	            }
	            else{
	                for(int i=0;i<first.children.size();i++){
	                    q.add(first.children.get(i));
	                }
	            }
	        }
	        return count;
		}

	}