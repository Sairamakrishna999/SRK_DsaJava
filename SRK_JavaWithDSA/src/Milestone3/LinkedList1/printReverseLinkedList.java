/*Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
5 4 3 2 1
Sample Input 2 :
2
1 2 3 -1
10 20 30 40 50 -1
Sample Output 2 :
3 2 1
50 40 30 20 10
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

public class printReverseLinkedList {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        printReverse(root.next);
        System.out.print(root.data+" ");
	}

}
