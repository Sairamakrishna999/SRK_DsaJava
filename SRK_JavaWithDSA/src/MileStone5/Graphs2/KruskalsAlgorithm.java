/*Code : Kruskal's Algorithm
Send Feedback
Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
Find and print the Minimum Spanning Tree (MST) using Kruskal's algorithm.
For printing MST follow the steps -
1. In one line, print an edge which is part of MST in the format - 
v1 v2 w
where, v1 and v2 are the vertices of the edge which is included in MST and whose weight is w. And v1  <= v2 i.e. print the smaller vertex first while printing an edge.
2. Print V-1 edges in above format in different lines.
Note : Order of different edges doesn't matter.
Input Format :
Line 1: Two Integers V and E (separated by space)
Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)
Output Format :
Print the MST, as described in the task.
Constraints :
2 <= V, E <= 10^5
Time Limit: 1 sec
Sample Input 1 :
4 4
0 1 3
0 3 5
1 2 1
2 3 8
Sample Output 1 :
1 2 1
0 1 3
0 3 5
*/
package MileStone5.Graphs2;



	import java.util.*;

	class Edge implements Comparable<Edge> {
		int vertice1;
		int vertice2;
		int weight;

		Edge(int vertice1, int vertice2, int weight) {
			this.vertice1 = vertice1;
			this.vertice2 = vertice2;
			this.weight = weight;
		}

		public int compareTo(Edge e) {
			return this.weight - e.weight;
		}
	}

	public class KruskalsAlgorithm {
		public static int findParent(int vertice, int parent[]) {
			if (vertice == parent[vertice]) {
				return vertice;
			}
			parent[vertice]= findParent(parent[vertice], parent);
			return parent[vertice];
		}

		public static Edge[] kruskalsAlgorithm(Edge[] edges, int n) {
			Arrays.sort(edges);
			int parent[] = new int[n];
			int rank[]=new int[n];
			Edge[] mst = new Edge[n - 1];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				rank[i]=0;
			}
			int count = 0;
			int i = 0;
			while (count != n - 1) {
				Edge currentVertice = edges[i++];
				int v1Parent = findParent(currentVertice.vertice1, parent);
				int v2Parent = findParent(currentVertice.vertice2, parent);
				if (v1Parent != v2Parent) {
					parent[v1Parent] = v2Parent;
					mst[count] =currentVertice;
					count++;
				} else {
					continue;
				}
				// i++;
			}
			return mst;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int V = sc.nextInt();
			int E = sc.nextInt();

			/*
			 * Write Your Code Here
			 * Complete the Rest of the Program
			 * You have to take input and print the output yourself
			 */
			Edge[] edges = new Edge[E];
			for (int i = 0; i < E; i++) {
				int vertice1 = sc.nextInt();
				int vertice2 = sc.nextInt();
				int weight = sc.nextInt();
				Edge obj = new Edge(vertice1, vertice2, weight);
				edges[i] = obj;
			}
			Edge[] finalMst = kruskalsAlgorithm(edges, V);
			for (int i = 0; i < finalMst.length; i++) {
				if (finalMst[i].vertice1 < finalMst[i].vertice2) {
					System.out.print(finalMst[i].vertice1 + " " + finalMst[i].vertice2 + " " + finalMst[i].weight);
				} else {
					System.out.print(finalMst[i].vertice2 + " " + finalMst[i].vertice1 + " " + finalMst[i].weight);
				}
				System.out.println();
			}
		}
	}