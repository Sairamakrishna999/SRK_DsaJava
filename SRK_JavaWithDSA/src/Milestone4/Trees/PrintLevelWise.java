/*Print Tree Level-wise
Send Feedback
Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in differnet lines.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Level wise print
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
10
20 30 40 
40 50
*/
package Milestone4.Trees;


	import java.util.*;
	public class PrintLevelWise {

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
		
		
		
		public static void printLevelWise(TreeNode<Integer> root){
			/* Your class should be named Solution 
	 		 * Don't write main(). 
			 * Don't read input, it is passed as function argument. 
			 * Print output and don't return it. 
			 * Taking input is handled automatically. 
			 */
	        if(root==null){
	            return;
	        }
	        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
	        q.add(root);
	        q.add(null);
	        
	        while(!(q.isEmpty()) && q.size()!=1){
	            TreeNode<Integer> first = q.poll();
	            if(first==null){
	                q.add(null);
	                System.out.println();
	            }
	            else{
	                System.out.print(first.data+" ");
	                for(int i=0;i<first.children.size();i++){
	                    q.add(first.children.get(i));
	                }
	            }
	        }

		}
			
	}
