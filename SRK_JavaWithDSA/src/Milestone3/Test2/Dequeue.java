/*Dequeue
Send Feedback
You need to implement a class for Dequeue i.e. for double ended queue. In this queue, elements can be inserted and deleted from both the ends.
You don't need to double the capacity.
You need to implement the following functions -
1. constructor
You need to create the appropriate constructor. Size for the queue passed is 10.
2. insertFront -
This function takes an element as input and insert the element at the front of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
3. insertRear -
This function takes an element as input and insert the element at the end of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
4. deleteFront -
This function removes an element from the front of queue. Print -1 if queue is empty.
5. deleteRear -
This function removes an element from the end of queue. Print -1 if queue is empty.
6. getFront -
Returns the element which is at front of the queue. Return -1 if queue is empty.
7. getRear -
Returns the element which is at end of the queue. Return -1 if queue is empty.
Input Format:
For C++ and Java, input is already managed for you. You just have to implement given functions.

For Python:
The choice codes and corresponding input for each choice are given in a new line. The input is terminated by integer -1. The following table elaborately describes the function, their choice codes and their corresponding input - 
Alt Text

Output Format:
For C++ and Java, output is already managed for you. You just have to implement given functions.

For Python: 
The output format for each function has been mentioned in the problem description itself. 
Sample Input 1:
5 1 49 1 64 2 99 5 6 -1
Sample Output 1:
-1
64
99
Explanation:
The first choice code corresponds to getFront. Since the queue is empty, hence the output is -1. 
The following input adds 49 at the top and the resultant queue becomes: 49.
The following input adds 64 at the top and the resultant queue becomes: 64 -> 49
The following input add 99 at the end and the resultant queue becomes: 64 -> 49 -> 99
The following input corresponds to getFront. Hence the output is 64.
The following input corresponds to getRear. Hence the output is 99.
*/
package Milestone3.Test2;
import java.util.Scanner;
public class Dequeue {
	    // Complete this class
	    static final int n = 10;
	    int size;
	    int rear;
	    int front;
	    int arr[];
	    Dequeue(int size){
	        this.size=size;
	        front=-1;
	        rear=0;
	        arr=new int[n];
	    }
	    boolean isFull()
	    {
	        return ((front == 0 && rear == size-1)||
	            front == rear+1);
	    }
	    boolean isEmpty ()
	    {
	        return (front == -1);
	    }
	    void insertFront(int key)
	    {
	        if (isFull())
	        {
	            System.out.println("-1");
	            return;
	        }
	        if (front == -1)
	        {
	            front = 0;
	            rear = 0;
	        }
	        else if (front == 0)
	            front = size - 1 ;
	  
	        else
	            front = front-1;
	        arr[front] = key ;
	    }
	    void insertRear(int key)
	    {
	        if (isFull())
	        {
	            System.out.println("-1");
	            return;
	        }
	  
	        // If queue is initially empty
	        if (front == -1)
	        {
	            front = 0;
	            rear = 0;
	        }
	  
	        // rear is at last position of queue
	        else if (rear == size-1)
	            rear = 0;
	  
	        // increment rear end by '1'
	        else
	            rear = rear+1;
	         
	        // insert current element into Deque
	        arr[rear] = key ;
	    }
	    void deleteFront()
	    {
	        // check whether Deque is empty or not
	        if (isEmpty())
	        {
	            System.out.println("-1");
	            return ;
	        }
	  
	        // Deque has only one element
	        if (front == rear)
	        {
	            front = -1;
	            rear = -1;
	        }
	        else
	            // back to initial position
	            if (front == size -1)
	                front = 0;
	  
	            else // increment front by '1' to remove current
	                // front value from Deque
	                front = front+1;
	    }
	    void deleteRear()
	    {
	        if (isEmpty())
	        {
	            System.out.println("-1");
	            return ;
	        }
	  
	        // Deque has only one element
	        if (front == rear)
	        {
	            front = -1;
	            rear = -1;
	        }
	        else if (rear == 0)
	            rear = size-1;
	        else
	            rear = rear-1;
	    }
	    int getFront()
	    {
	        // check whether Deque is empty or not
	        if (isEmpty())
	        {
	            return -1 ;
	        }
	        return arr[front];
	    }
	  
	    // function return rear element of Deque
	    int getRear()
	    {
	        // check whether Deque is empty or not
	        if(isEmpty() || rear < 0)
	        {
	            return -1 ;
	        }
	        return arr[rear];
	    }
	    public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			Dequeue dq = new Dequeue(10);

			while(true){
				int choice = s.nextInt(),input;
				switch (choice) {
				case 1:
					input = s.nextInt();
					dq.insertFront(input);
					break;
				case 2:
					input = s.nextInt();
					dq.insertRear(input);
					break;
				case 3:
					dq.deleteFront();
					break;
				case 4:
					dq.deleteRear();
					break;
				case 5:
					System.out.println(dq.getFront());
					break;
				case 6:
					System.out.println(dq.getRear());
					break;
				default:
					return ;
				}  
			}
		} 
	    
	}