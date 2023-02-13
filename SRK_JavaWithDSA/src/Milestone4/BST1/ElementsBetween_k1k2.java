/*Elements Between K1 and K2
Send Feedback
Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).
Print the elements in increasing order.
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
6 10
Sample Output 1:
6 7 8 10
input2
4 2 6 1 3 5 7 -1 -1 -1 -1 -1 -1 -1 -1
1 7
output2
1234567
*/
package Milestone4.BST1;

	public class ElementsBetween_k1k2 {

//		Binary Tree Node class 
		  
		  	class BinaryTreeNode<T> {
				T data;
				BinaryTreeNode<T> left;
				BinaryTreeNode<T> right;
				
				public BinaryTreeNode(T data) {
					this.data = data;
				}
			}
			
			
			public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
				if(root==null){
					return;
				}	
				if(k1<=root.data && k2>=root.data){
					elementsInRangeK1K2(root.left,k1,k2);
					System.out.print(root.data+" ");
					elementsInRangeK1K2(root.right,k1,k2);
				}
				if(k2<root.data){
					elementsInRangeK1K2(root.left,k1,k2);
				}
				if(k1>root.data){
					elementsInRangeK1K2(root.right,k1,k2);
				}
			}
			
			
		}