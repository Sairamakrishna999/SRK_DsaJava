/*Sample Input 1 :
1
1 2 3 3 3 3 4 4 4 5 5 7 -1
Sample Output 1 :
1 2 3 4 5 7 
Sample Input 2 :
2
10 20 30 40 50 -1
10 10 10 10 -1
Sample Output 2 :
10 20 30 40 50
10
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

public class EliminateDuplicates {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes 
        if(head==null){
            return null;
        }
        LinkedListNode<Integer> temp=head;
        while(temp.next!=null){
            if(temp.data.equals(temp.next.data)){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
	}

}
