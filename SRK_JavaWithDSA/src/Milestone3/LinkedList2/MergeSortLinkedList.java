/*Sample Input 1 :
1
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Input 2 :
2
-1
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 
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

public class MergeSortLinkedList {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null){
            return head;
        }
        LinkedListNode<Integer> mid=midPoint(head);
        LinkedListNode<Integer> rightSide=head;
        LinkedListNode<Integer> leftSide=mid.next;
        mid.next=null;
        LinkedListNode<Integer> left=mergeSort(rightSide);
        LinkedListNode<Integer> right=mergeSort(leftSide);
        return sort(left,right);
	}
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head.next;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2){
        if(head1==null && head2==null){
            return head1;
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        LinkedListNode<Integer> tail;
        LinkedListNode<Integer> finalHead;
        if(head1.data>head2.data){
            tail=head2;
            finalHead=head2;
            head2=head2.next;
        }
        else{
            tail=head1;
            finalHead=head1;
            head1=head1.next;
        }
        while(head1!=null && head2!=null){
            if(head1.data>head2.data){
                tail.next=head2;
                tail=head2;
                head2=head2.next;
            }
            else{
                tail.next=head1;
                tail=head1;
                head1=head1.next;
            }
        }
        if(head1!=null){
            tail.next=head1;
        }
        else{
            tail.next=head2;
        }
        return finalHead;
    }

}