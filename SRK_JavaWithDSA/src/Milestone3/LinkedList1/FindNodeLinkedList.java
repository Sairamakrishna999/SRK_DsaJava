/*Sample Input 1 :
2
3 4 5 2 6 1 9 -1
5
10 20 30 40 50 60 70 -1
6
Sample Output 1 :
2
-1
 Explanation for Sample Output 1:
In test case 1, 'N' = 5 appears at position 2 (0-based indexing) in the given linked list.

In test case 2, we can see that 'N' = 6 is not present in the given linked list.
Sample Input 2 :
2
1 -1
2
3 4 5 2 6 1 9 -1
6
Sample Output 2 :
-1
4
 Explanation for Sample Output 2:
In test case 1, we can see that 'N' = 2 is not present in the given linked list.

In test case 2, 'N' = 6 appears at position 4 (0-based indexing) in the given linked list.
*/
package Milestone3.LinkedList1;

	/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class FindNodeLinkedList {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        LinkedListNode<Integer> temp = head;
        if(temp==null){
            return -1;
        }
        int count=0;
        while(temp.next!=null){
            if(temp.data==n){
                return count;
            }
            count++;
            temp=temp.next;
        }
        return -1;
	}
}
