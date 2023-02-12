/*Sample Input 1 :
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Input 2 :
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

public class BubbleSortLinkedList_Iterative {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
		//Your code goes here
			LinkedListNode<Integer> current = null;
			boolean status = false;
			do {
				// Start with first node    
				current = head;
				// Reset working status
				status = false;
				while (current != null && current.next != null)
				{
					if (current.data > current.next.data)
					{
						// Swap node values
						current.data = current.data + current.next.data;
						current.next.data = current.data - current.next.data;
						current.data = current.data - current.next.data;
						// When node value change    
						status = true;
					}
					// Visit to next node
					current = current.next;
				}
			} while (status);
        return head;
	}
}