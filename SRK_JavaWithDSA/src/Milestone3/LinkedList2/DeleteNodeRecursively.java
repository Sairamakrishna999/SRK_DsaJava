/*
 Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9
Sample Input 2 :
2
30 -1
0
10 20 30 50 60 -1
4
Sample Output 2 :
10 20 30 50 
*/
package Milestone3.LinkedList2;



    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }



public class DeleteNodeRecursively {
    

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(head==null){
            return null;
        }
        if(pos==0){
            return head.next;
        }
        else{
            LinkedListNode<Integer> smallHead=deleteNodeRec(head.next,pos-1);
            head.next=smallHead;
            return head;
            
        }
	}

}