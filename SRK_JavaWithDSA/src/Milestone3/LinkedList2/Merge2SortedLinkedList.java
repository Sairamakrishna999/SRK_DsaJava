/*Sample Input 1 :
1
2 5 8 12 -1
3 6 9 -1
Sample Output 1 :
2 3 5 6 8 9 12 
Sample Input 2 :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1
Sample Output 2 :
2 3 5 6 8 9 12 
10 10 20 30 40 40 50 60 60 60 80 90 100
*/
package Milestone3.LinkedList2;

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

public class Merge2SortedLinkedList {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        LinkedListNode<Integer> preHead  = new LinkedListNode<Integer>(0);
    LinkedListNode<Integer> tail = preHead;
    
    while(head1 != null && head2 != null) {
        if(head1.data > head2.data) {
            tail.next = head2;
            head2 = head2.next;
        } else {
            tail.next = head1;
            head1 = head1.next;
        }
        tail = tail.next;
    }
    
    if(head1 == null) {
        tail.next = head2;
    } else {
        tail.next = head1;
    }
    
    return preHead.next;
    }

}
