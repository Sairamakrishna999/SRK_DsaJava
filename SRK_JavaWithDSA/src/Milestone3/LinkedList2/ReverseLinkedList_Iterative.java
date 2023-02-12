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
50 40 30 20 10 
*/
package Milestone3.LinkedList2;

	/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class ReverseLinkedList_Iterative {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(head==null || head.next==null){
            return head;
        }
        LinkedListNode<Integer> temp1=head;
        head=head.next;
        temp1.next=null;
        LinkedListNode<Integer> temp2=head;
        while(head.next!=null){
            head=head.next;
            temp2.next=temp1;
            temp1=temp2;
            temp2=head;
        }
        temp2.next=temp1;
        temp1=temp2;
        return temp1;
	}
}
