/*Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
2
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
9 8 4 0 7 8 -1
3
Sample Output 2 :
3
0
*/
package Milestone3.LinkedList1;
//class LinkedListNode<T> {
//	T data;
//	LinkedListNode<T> next;
//
//	public LinkedListNode(T data) {
//		this.data = data;
//	}
//}
public class Print_ith_node {
		public static void printIthNode(LinkedListNode<Integer> head, int i){
			//Your code goes here
			if(head==null){
				return;
			}
			while(i>0){
				head =head.next;
				i--;
			}
			System.out.println(head.data);
		}
	}
