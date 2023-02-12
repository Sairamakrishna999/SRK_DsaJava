/*Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1
-1
Sample Output 2 :
false
true
Explanation for the Sample Input 2 :
For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.

For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.
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

public class PalindromeLinkedList {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head==null || head.next==null){
            return true;
        }
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        LinkedListNode<Integer> start=head;
        int i=(count-1)/2;
        while(i>=0){
            start=start.next;
            i--;
        }
       LinkedListNode<Integer> temp1=start;
       LinkedListNode<Integer> temp2;
       if(start.next==null){
           temp2=start;
       }
       else{
           start=start.next;
       temp1.next=null;
       temp2=start;
       while(start.next!=null){
           start=start.next;
           temp2.next=temp1;
           temp1=temp2;
           temp2=start;
       }
       temp2.next=temp1;
       temp1=temp2;
       }
       int j=count/2;
       while(j>0){
           if(!head.data.equals(temp1.data)){
               return false;
           }
           head=head.next;
           temp1=temp1.next;
           j--;
       }
       return true;
	}

}
