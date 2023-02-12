/*Sample Input 1 :
1 
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
10 20 30 40 50 60 -1
7
Sample Output 2 :
4 5 2 6 1 9
10 20 30 40 50 60
*/
package Milestone3.LinkedList1;


	/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class DeleteNodeLinkedList {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        if(head==null){
            return null;
        }
        // LinkedListNode<Integer> temp=head;
        if(pos==0){
            head=head.next;
           // temp.next=null;
            return head;
        }
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(count<(pos-1) && temp!=null){
            temp=temp.next;
            count++;
        }
        if(temp==null||temp.next==null){
            return head;
        }
//         if(temp!=null){
//             temp.next=temp.next.next;
//         }
        temp.next=temp.next.next;
        return head;
	}
}

