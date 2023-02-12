/*Next Number
Send Feedback
Given a large number represented in the form of a linked list.
 Write code to increment the number by 1 in-place(i.e. without using extra space).
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 
*/

package Milestone3.Test2;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
public class Nextnumber {
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    static LinkedListNode<Integer> newNode(int data)
    {
        LinkedListNode<Integer> new_node = new LinkedListNode<Integer>(data);
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
    public static LinkedListNode<Integer> helper(LinkedListNode<Integer> head){
        LinkedListNode<Integer> result=head;
        LinkedListNode<Integer> temp=null;
        LinkedListNode<Integer> prev=null;
        int carry=1,sum;
        while(head!=null){
            sum=carry+head.data;
            carry = (sum>=10)? 1 : 0;
            sum=sum%10;
            head.data=sum;
            temp=head;
            head=head.next;
        }
        if(carry>0){
            temp.next= newNode(carry);
        }
        return result;
    }
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        head=reverse(head);
        head=helper(head);
        return reverse(head);
	}


}

