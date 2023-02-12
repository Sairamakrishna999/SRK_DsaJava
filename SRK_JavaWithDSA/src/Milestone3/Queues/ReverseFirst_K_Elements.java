/*Sample Input 1:
5 3
1 2 3 4 5
Sample Output 1:
3 2 1 4 5
Sample Input 2:
7 7
3 4 2 5 6 7 8
Sample Output 2:
8 7 6 5 2 4 3
*/
package Milestone3.Queues;

	import java.util.LinkedList;
	import java.util.Queue;

	public class ReverseFirst_K_Elements {
		
	    public static void reverse(Queue<Integer> input){
	        
	        //BASE CASE
	        if(input.size()==0 || input.size()==1)
	            return;
	        
	        int x=input.poll();
	        
	        reverse(input);
	        input.add(x);
	        
	    }
	    
		public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
			//Your code goes here
	        if(input.size() <= 1) {
	            return input;
	        }
	        
	        Queue<Integer> q1 = new LinkedList<Integer>();
	       // int size = input.size();
	        
	        for(int i=0; i< k; i++) {
	            q1.add(input.poll());
	        }
	        
	        // while(!q1.isEmpty()) {
	        //     int size2 = q1.size();
	        //     for(int i=0; i< size2 - 1; i++) {
	        //         q1.add(q1.poll());
	        //     }
	        //     input.add(q1.poll());
	        // }
	        
	        reverse(q1);
	        
	        while(!input.isEmpty()){
	            q1.add(input.poll());
	        }
	        
	       // Queue<Integer> temp=;
	        input=q1;
	        
	        
//	         for(int i=0; i< size - k; i++) {
//	             input.add(input.poll());
//	         }
	        
	        return input;
		}
	}
