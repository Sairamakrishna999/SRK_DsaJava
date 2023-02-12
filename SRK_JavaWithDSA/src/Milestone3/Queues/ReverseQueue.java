/*Sample Input 1:
1
6
1 2 3 4 5 10
Note:
Here, 1 is at the front and 10 is at the rear of the queue.
Sample Output 1:
10 5 4 3 2 1
Sample Input 2:
2
5
2 8 15 1 10
3
10 20 30
Sample Output 2:
10 1 15 8 2 
30 20 10 
*/
package Milestone3.Queues;



	import java.util.LinkedList;
	import java.util.Queue;

	public class ReverseQueue {

		public static void reverseQueue(Queue<Integer> input) {
			//Your code goes here
	        if(input.isEmpty()){
	            return;
	        }
	        int k = input.poll();
	        reverseQueue(input);
	        input.add(k);
		}

	}