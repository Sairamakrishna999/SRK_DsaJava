/*Sample Input 1 :
1
3 4 5 2 6 1 9 -1
Sample Output 1 :
7
Sample Input 2 :
2
10 76 39 -3 2 9 -23 9 -1
-1
Sample Output 2 :
8
0
*/
package Milestone3.LinkedList1;
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
public class LengthOfLinkedList {
		public static int length(LinkedListNode<Integer> head){
			//Your code goes here
			int count=0;
			while(head!=null){
				count++;
				head=head.next;
			}
			return count;

		}
	}
