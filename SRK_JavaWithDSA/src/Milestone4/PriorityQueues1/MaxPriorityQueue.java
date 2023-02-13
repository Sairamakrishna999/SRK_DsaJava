/*Code : Max Priority Queue
Send Feedback
Implement the class for Max Priority Queue which includes following functions -
1. getSize -
Return the size of priority queue i.e. number of elements present in the priority queue.
2. isEmpty -
Check if priority queue is empty or not. Return true or false accordingly.
3. insert -
Given an element, insert that element in the priority queue at the correct position.
4. getMax -
Return the maximum element present in the priority queue without deleting. Return -Infinity if priority queue is empty.
5. removeMax -
Delete and return the maximum element present in the priority queue. Return -Infinity if priority queue is empty.
Note : main function is given for your reference which we are using internally to test the class.

*/
package Milestone4.PriorityQueues1;


	import java.util.ArrayList;
	/*************
	 * Following is the main function for your reference which we are using internally.

	 public static void main(String[] args) {
			PriorityQueue pq = new PriorityQueue();
			int choice = s.nextInt();
			while(choice != -1) {
				switch(choice) {
					case 1 : // insert
						int element = s.nextInt();
						pq.insert(element);
						break;
					case 2 : // getMax
						System.out.println(pq.getMax());
						break;
					case 3 : // removeMax
						System.out.println(pq.removeMax());
						break;
					case 4 : // size
						System.out.println(pq.getSize());
						break;
					case 5 : // isEmpty
						System.out.println(pq.isEmpty());
					default :
							return;
				}
				choice = s.nextInt();
			}
		}
	************/

	public class MaxPriorityQueue {
	    ArrayList<Integer> heap;
	    public MaxPriorityQueue(){
	        heap=new ArrayList<>();
	    }
	    int getSize(){
	        return heap.size();
	    }
	    boolean isEmpty(){
	        return heap.size()==0;
	    }
	    int getMax(){
	        if(isEmpty())
	            return Integer.MIN_VALUE;
	        return heap.get(0);
	    }
	    void insert(int element){
	        heap.add(element);
	        int childindex=heap.size()-1;
	        int parentindex=(childindex-1)/2;
	        //upheapify------
	        while(childindex>0){
	            if(heap.get(childindex)>heap.get(parentindex))
	            {
	                int temp=heap.get(parentindex);
	                heap.set(parentindex,heap.get(childindex));
	                heap.set(childindex,temp);
	                childindex=parentindex;
	                parentindex=(childindex-1)/2;
	            }
	            else
	                return;
	        }
	    }
	    int removeMax(){
	        if(isEmpty())
	            return Integer.MIN_VALUE;
	        int lchildindex=1;
	        int rchildindex=2;
	        int parentindex=0;
	        int maxindex=parentindex;
	        int temp=heap.get(0);
	        heap.set(0,heap.get(heap.size()-1));
	        heap.remove(heap.size()-1);
	        while(lchildindex<heap.size()){
	        if(heap.get(lchildindex)>heap.get(parentindex))
	            maxindex=lchildindex;
	        if(rchildindex<heap.size() && heap.get(rchildindex)>heap.get(maxindex))
	            maxindex=rchildindex;
	        if(maxindex==parentindex)
	            break;
	        else{
	            int temp1=heap.get(parentindex);
	            heap.set(parentindex,heap.get(maxindex));
	            heap.set(maxindex,temp1);
	            parentindex=maxindex;
	            lchildindex=2*parentindex +1;
	            rchildindex=2*parentindex +2;

	        }
	        }
	         return temp; 
	    }


	}

