/*Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
Sample Input 2 :
1
10 6 77 90 61 67 100 -1
4
Sample Output 2 :
90 61 67 100 10 6 77 
 Explanation to Sample Input 2 :
We have been required to move the last 4 nodes to the front of the list.
 Here, "90->61->67->100" is the list which represents the last 4 nodes.
 When we move this list to the front then the remaining part of the initial list which is,
 "10->6->77" is attached after 100. Hence, the new list formed with an updated head pointing to 90.*/package Milestone3.LinkedList1;


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

public class AppendLastNtoEnd {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		// Your code goes here
        if(head==null || n==0){
            return head;
        }
        int count=1;
        LinkedListNode<Integer> tail=head;
        while(tail.next!=null){
            count++;
            tail=tail.next;
        }
        
        // System.out.println(count);
        LinkedListNode<Integer> temp=head;
        while(count-1>=n){
            tail.next=temp;
            head=head.next;
            temp.next=null;
            tail=tail.next;
            temp=head;
            count--;
        }
        
        
        // System.out.println(head.data);
        return head;
	}
    

}