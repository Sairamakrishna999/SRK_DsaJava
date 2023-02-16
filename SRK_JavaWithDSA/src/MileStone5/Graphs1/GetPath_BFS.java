/*Get Path - BFS
Send Feedback
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
Find the path using BFS and print the shortest path available.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
4. Save the input graph in Adjacency Matrix.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
Print the path from v1 to v2 in reverse order.
Constraints :
2 <= V <= 1000
1 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= 2^31 - 1
0 <= v2 <= 2^31 - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
3 0 1
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
*/
package MileStone5.Graphs1;



	import java.util.*;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	public class GetPath_BFS {
		public static HashMap<Integer,Integer> getPath(int adjMatrix[][],int value1,int value2){
			HashMap<Integer,Integer> map = new HashMap<>();
			ArrayList<Integer> resultList = new ArrayList<>();
			boolean visited[]=new boolean[adjMatrix.length];
			if(value1==value2){
				map.put(value2,adjMatrix.length);
				return map;
			}
			visited[value1]=true;
			Queue<Integer> pendingNodes = new LinkedList<>();
			
			map.put(value1,adjMatrix.length);
			pendingNodes.add(value1);
			while(!pendingNodes.isEmpty()){
				int k = pendingNodes.remove();
				for(int i=0;i<adjMatrix.length;i++){
					if(adjMatrix[k][i]==1 && visited[i]==false){
						pendingNodes.add(i);
						map.put(i,k);
						visited[i]=true;
						if(i==value2){
							return map;
						}
					}
				}
			}
			return map;
		}
		public static void main(String[] args)  throws NumberFormatException, IOException{
	        /* Write Your Code Here
			 * Complete the Rest of the Program
			 * You have to take input and print the output yourself
			 */
			 Scanner sc = new Scanner(System.in);
			 int vertices = sc.nextInt();
			 int edges = sc.nextInt();
			 int adjMatrix[][]=new int[vertices][vertices];
			 for(int i=0;i<edges;i++){
				 int vertice1=sc.nextInt();
				 int vertice2=sc.nextInt();
				 adjMatrix[vertice1][vertice2]=1;
				 adjMatrix[vertice2][vertice1]=1;
			 }
			 int value1=sc.nextInt();
			 int value2=sc.nextInt();
			 
			 HashMap<Integer,Integer> map = getPath(adjMatrix,value1,value2);

			if(map!=null && map.containsKey(value2)){
				ArrayList<Integer> result = new ArrayList<>();
				// result.add(value2);
				int k = map.get(value2);
				while (k < adjMatrix.length) {
					result.add(k);
					k = map.get(k);
				}
				for (int i = 0; i < result.size(); i++) {
					System.out.print(result.get(i) + " ");
				}
			}
		}
	}