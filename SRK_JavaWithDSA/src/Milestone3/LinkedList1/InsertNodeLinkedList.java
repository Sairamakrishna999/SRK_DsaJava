/*Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 100
Sample Output 1 :
3 4 5 100 2 6 1 9
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0 20
10 98 7 66 8 -1
5 99
Sample Output 2 :
20 3 4 5 2 6 1 9
10 98 7 66 8 99 
*/
package Milestone3.LinkedList1;
/*

Following is the Node class already written for the Linked List

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
    	this.data = data;
	}
}

*/
public class InsertNodeLinkedList {

		public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
			//Your code goes here
			LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
			if(pos==0){
				
				newNode.next=head;
				head=newNode;
				return head;
			}
			// LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
			while(pos-1>=0){
				head=head.next;
				pos--;
			}
			newNode.next=head.next;
			head.next=newNode;
			return head;
		}
	}
