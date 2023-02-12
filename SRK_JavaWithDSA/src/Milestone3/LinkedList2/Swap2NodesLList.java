/*Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9 
 Sample Input 2 :
2
10 20 30 40 -1
1 2
70 80 90 25 65 85 90 -1
0 6
 Sample Output 2 :
10 30 20 40 
90 80 90 25 65 85 70 
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

public class Swap2NodesLList {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(i>j){
        i=i+j;
        j=i-j;
        i=i-j;
        }
        if(i==0){
        if(j==1){
            // node *cur=head->next;
            LinkedListNode<Integer> cur = head.next;
            // head->next=cur->next;
            head.next=cur.next;
            // cur->next=head;
            cur.next=head;
            return cur;
        }
        // node *pt=head;
            LinkedListNode<Integer> pt = head;
        for(int c=1;c<j;c++)
            pt=pt.next;
        
        // node *temp=head->next;
            LinkedListNode<Integer> temp = head.next;
        // node *cur=pt->next;
            LinkedListNode<Integer> cur = pt.next;
        
        // head->next=cur->next;
            head.next=cur.next;
        // pt->next=head;
            pt.next=head;
        // cur->next=temp;
            cur.next=temp;
        return cur;
        }
        if(j-i==1){
        // node * pt=head;
            LinkedListNode<Integer> pt = head;
        for(int c=1;c<i;c++)
            // pt=pt->next;
            pt=pt.next;
        
        // node* cur=pt->next;
            LinkedListNode<Integer> cur = pt.next;
        // node* cur1=cur->next;
            LinkedListNode<Integer> cur1=cur.next;
        
        // cur->next=cur1->next;
            cur.next=cur1.next;
        // pt->next=cur1;
            pt.next=cur1;
        // cur1->next=cur;
            cur1.next=cur;
        return head;
        }
        // node* pt1=head;
        LinkedListNode<Integer> pt1=head;
    // node *pt2=head;
        LinkedListNode<Integer> pt2=head;
    
    for(int c=1;c<i;c++)
        // pt1=pt1->next;
        pt1=pt1.next;
    
    for(int c=1;c<j;c++)
        // pt2=pt2->next;
        pt2=pt2.next;
    
    // node *cur1=pt1->next;
        LinkedListNode<Integer> cur1=pt1.next;
    // node *cur2=pt2->next;
        LinkedListNode<Integer> cur2=pt2.next;
    
    // node *temp=cur1->next;
        LinkedListNode<Integer> temp=cur1.next;
    
    // cur1->next=cur2->next;
        cur1.next=cur2.next;
    // pt2->next=cur1;
        pt2.next=cur1;
    // pt1->next=cur2;
        pt1.next=cur2;
    // cur2->next=temp;
        cur2.next=temp;
    
    return head;
	}

}
