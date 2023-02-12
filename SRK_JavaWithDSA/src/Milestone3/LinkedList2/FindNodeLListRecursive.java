/*Sample Input 1 :
1
3 4 5 2 6 1 9 -1
100
Sample Output 1 :
-1
Sample Input 2 :
2
10 20010 30 400 600 -1
20010
100 200 300 400 9000 -34 -1
-34
Sample Output 2 :
1
5
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

public class FindNodeLListRecursive {


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        int count=0;
        while(head!=null){
            if(head.data==n){
                return count;
            }
            head=head.next;
                count++;
        }
        return -1;
	}

}
