/*Islands
Send Feedback
An island is a small piece of land surrounded by water . A group of islands is said to be connected if we can reach from any given island to any other island in the same group . Given V islands (numbered from 0 to V-1) and E connections or edges between islands. Can you count the number of connected groups of islands.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b. 
Output Format :
Print the count the number of connected groups of islands
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V-1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
5 8
0 1
0 4
1 2
2 0
2 4
3 0
3 2
4 3
Sample Output 1:
1 
*/
package MileStone5.Graphs1;

public class isLands {


		public static int numConnected(int[][] edges, int n) {
	        
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
			
			int count=0;
			boolean visited[]=new boolean[edges.length];
			for(int i=0;i<edges.length;i++){
				if(visited[i]==false){
					numConnected(edges,i,visited);
					++count;
				}
			}
			return count;
		}
		public static void numConnected(int edges[][],int n,boolean visited[]){
			visited[n]=true;
			for(int i=0;i<edges.length;i++){
				if(edges[n][i]==1 && visited[i]==false){
					visited[i]=true;
					 numConnected(edges,i,visited);
				}
			}
			// return 1;
		}


	}