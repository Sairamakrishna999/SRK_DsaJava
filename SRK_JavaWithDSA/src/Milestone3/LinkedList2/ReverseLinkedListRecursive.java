/*Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
Sample Output 1 :
8 7 6 5 4 3 2 1
Sample Input 2 :
2
10 -1
10 20 30 40 50 -1
Sample Output 2 :
10 
50 40 30 20 10*/
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

public class ReverseLinkedListRecursive {

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null){
            return head;
        }
        LinkedListNode<Integer> result= reverseLinkedListRec(head.next);
        head.next.next=head;
        head.next=null;
        return result;
	}

}
