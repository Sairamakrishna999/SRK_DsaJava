/*Level wise linkedlist
Send Feedback
Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output format :
Each level linked list is printed in new line (elements are separated by space).
Constraints:
Time Limit: 1 second
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
5 
6 10 
2 3 
9
*/
package Milestone4.BST2;



	import java.util.ArrayList;
	import java.util.*;

		/*
		 * BinaryTreeNode class
		 * 
		 * class BinaryTreeNode<T> 
		 * { 
		 * 		T data; 
		 * 		BinaryTreeNode<T> left; 
		 * 		BinaryTreeNode<T> right;
		 *		public BinaryTreeNode(T data) 
		 *		{
		 *  		this.data = data; 
		 *  	} 
		 *  }
		 */
		
//		 LinkedListNode Class
		  class LinkedListNode<T> 
		  { 
		  		T data; 
		  		LinkedListNode<T> next;
		  		public LinkedListNode(T data) 	
		  		{
		   		this.data = data; 
		   	} 
		   }
		 
	public class LevelWise_LinkedList {
		public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
			// Write your code here
	        if(root==null){
	            return null;
	        }
	        LinkedListNode<Integer> head = null;
	        LinkedListNode<Integer> tail = null;
	        Queue<BinaryTreeNode<Integer>> 	q = new LinkedList<BinaryTreeNode<Integer>>();
	        q.add(root);
	        q.add(null);
	        ArrayList<LinkedListNode<Integer>> result = new ArrayList<LinkedListNode<Integer>>();
	        while(!q.isEmpty() && q.size()!=1){
	            BinaryTreeNode<Integer> first = q.poll();
	            if(first==null){
	                
	                
	                head = null;
	                tail = null;
	                q.add(null);
	            }
	            else{
	                LinkedListNode<Integer> current = new LinkedListNode<Integer>(first.data);
	                if(head==null){
	                    head = current;
	                    tail=current;
	                    result.add(head);
	                }
	                else{
	                    tail.next=current;
	                    tail = tail.next;
	                }
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
	        return result;
		}

	}