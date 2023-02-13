/*BST to LL
Send Feedback
Given a BST, convert it into a sorted linked list. You have to return the head of LL.
Input format:
The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
Output Format:
The first and only line of output prints the elements of sorted linked list.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1:
2 5 6 7 8 10
*/
package Milestone4.BST1;

class Pair{
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}
 class LinkedListNode<T> { T data;
 LinkedListNode<T> next;
  
 public LinkedListNode(T data) {
	 this.data = data;
	 }
 }
 /*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

public class BST_to_LList {

	
	
public static Pair helper(BinaryTreeNode<Integer> root){
    if(root==null){
        Pair result = new Pair();
        result.head=null;
        result.tail=null;
        return result;
    }
    Pair leftNode=helper(root.left);
    LinkedListNode<Integer> LLNode = new LinkedListNode<Integer>(root.data);
    Pair rightNode=helper(root.right);
    
    Pair result = new Pair();
    if(leftNode.head==null){
        result.head=LLNode;
    }
    else{
        result.head=leftNode.head;
        leftNode.tail.next=LLNode;
    }
    if(rightNode==null){
        result.tail=LLNode;
    }
    else{
        LLNode.next=rightNode.head;
        result.tail=rightNode.tail;
        
    }
    return result;
} 
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        Pair result=helper(root);
        return result.head;
	}
}