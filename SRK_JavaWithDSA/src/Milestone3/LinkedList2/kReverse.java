/*
 kReverse
Send Feedback
Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
 'k' is a positive integer and is less than or equal to the length of the linked list.
  If the number of nodes is not a multiple of 'k,'
  then left-out nodes, in the end, should be reversed as well.
  Sample Input 1 :
1
1 2 3 4 5 6 7 8 9 10 -1
4
Sample Output 1 :
4 3 2 1 8 7 6 5 10 9
Sample Input 2 :
2
1 2 3 4 5 -1
0
10 20 30 40 -1
4
Sample Output 2 :
1 2 3 4 5 
40 30 20 10 
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

public class kReverse {

public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
	//Your code goes here
    if(head == null )
      return null;
    if(k==0){
        return head;
    }
    LinkedListNode<Integer> current = head;
    LinkedListNode<Integer> next = null;
    LinkedListNode<Integer> prev = null;

    int count = 0;

    /* Reverse first k nodes of linked list */
    while (count < k && current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        count++;
    }

    /* next is now a pointer to (k+1)th node
       Recursively call for the list starting from
       current. And make rest of the list as next of
       first node */
    if (next != null)
        head.next = kReverse(next, k);

    // prev is now head of input list
    return prev;
}

}
