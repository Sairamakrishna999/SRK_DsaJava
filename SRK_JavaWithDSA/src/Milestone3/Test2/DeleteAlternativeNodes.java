/*Sample Input 1:
1 2 3 4 5 -1
Sample Output 1:
1 3 5
Explanation of Sample Input 1:
2, 4 are alternate nodes so we need to delete them 
Sample Input 2:
10 20 30 40 50 60 70 -1
Sample Output 2:
10 30 50 70 
*/
package Milestone3.Test2;
class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

	public class DeleteAlternativeNodes {

	    public static void deleteAlternateNodes(Node<Integer> head) {
	        //Your code goes here
	        if(head==null || head.next==null){
	            return;
	        }
	        Node<Integer> temp=head;
	        Node<Integer> temp1=temp;
	        while(temp!=null){
	            temp.next=temp.next.next;
	            temp=temp.next;
	        }
	    }
	}