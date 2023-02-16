/*BFS
Send Feedback
Given an undirected and disconnected graph G(V, E), print its BFS traversal.
Note:
1. Here you need to consider that you need to print BFS path starting from vertex 0 only. 
2. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
3. E is the number of edges present in graph G.
4. Take graph input in the adjacency matrix.
5. Handle for Disconnected Graphs as well
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains space separated two integers, that denote that there exists an edge between vertex a and b.
Output Format :
Print the BFS Traversal, as described in the task.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
0 1 3 2
*/
package MileStone5.Graphs1;



	import java.util.*;
	import java.util.Queue;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;

	public class BFS {
		public static void Helper(int adjMatrix[][],int startingVertex,boolean visited[]){
			if(adjMatrix.length==0){
				return;
			}
			Queue<Integer> pendingNodes = new LinkedList<>();
			pendingNodes.add(startingVertex);
			visited[startingVertex]=true;
			while(!pendingNodes.isEmpty()){
				int k = pendingNodes.poll();
				System.out.print(k+" ");
				for(int i=0;i<adjMatrix.length;i++){
					if(adjMatrix[k][i]==1 && visited[i]==false){
						pendingNodes.add(i);
						visited[i]=true;
					}
				}
			}
		}
		public static void printBFS(int adjMatrix[][]){
			boolean visited[]=new boolean[adjMatrix.length];
			for(int i=0;i<adjMatrix.length;i++){
				if(visited[i]==false){
					Helper(adjMatrix,i,visited);
				}
			}
		}
		public static void main(String[] args) throws NumberFormatException, IOException {
	        
	        /* Write Your Code Here
			 * Complete the Rest of the Program
			 * You have to take input and print the output yourself
			 */
			 Scanner sc = new Scanner(System.in);
			 int vertices = sc.nextInt();
			 int edges = sc.nextInt();
			 int adjMatrix[][]=new int[vertices][vertices];
			 for(int i=0;i<edges;i++){
				 int vertice1 = sc.nextInt();
				 int vertice2 = sc.nextInt();
				 adjMatrix[vertice1][vertice2]=1;
				 adjMatrix[vertice2][vertice1]=1;
			 }
			 printBFS(adjMatrix);
		}

	}