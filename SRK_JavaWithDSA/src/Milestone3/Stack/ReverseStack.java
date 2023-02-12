/*Reverse Stack
Send Feedback
You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.
For Example:
Alt txt

Input Format :
The first line of input contains an integer N, denoting the total number of elements in the stack.

The second line of input contains N integers separated by a single space, representing the order in which the elements are pushed into the stack.
Output Format:
The only line of output prints the order in which the stack elements are popped, all of them separated by a single space. 
Note:
You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input stack itself.
Constraints:
1 <= N <= 10^3
-2^31 <= data <= 2^31 - 1

Time Limit: 1sec 
Sample Input 1:
6
1 2 3 4 5 10
Note:
Here, 10 is at the top of the stack.
Sample Output 1:
1 2 3 4 5 10
Note:
Here, 1 is at the top of the stack.
Sample Input 2:
5
2 8 15 1 10
Sample Output 2:
2 8 15 1 10
*/
package Milestone3.Stack;

	import java.util.*;
	public class ReverseStack {
	    public static void transfer(Stack<Integer> s1, Stack<Integer> s2,int n){
	        // int n = s1.size();
	        for(int i = 0; i < n; i++)
	    {
	         
	        // Store the top element
	        // in a temporary variable
	        int temp = s1.peek();
	 
	        // Pop out of the stack
	        s1.pop();
	 
	        // Push it into s2
	        s2.push(temp);
	    }
	    }
		public static void reverseStack(Stack<Integer> s, Stack<Integer> s2) {
			//Your code goes here
	        // while(!extra.isEmpty()){
	        //     System.out.println(extra.pop());
	        // }
	        int n = s.size();
	        for(int i = 0; i < n; i++)
	    {
	         
	        // Store the top element
	        // of the given stack
	        int x = s.peek();
	 
	        // Pop that element
	        // out of the stack
	        s.pop();
	 
	        transfer(s, s2, n - i - 1);
	        s.push(x);
	        transfer(s2, s, n - i - 1);
	    }
		}
	}
