/*All connected components
Send Feedback
Given an undirected graph G(V,E), find and print all the connected components of the given graph G.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
3. You need to take input in main and create a function which should return all the connected components. And then print them in the main, not inside function.
Print different components in new line. And each component should be printed in increasing order (separated by space). Order of different components doesn't matter.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two space separated integers, that denote that there exists an edge between vertex a and b.
Output Format :
Print different components in new line. And each component should be printed in increasing order of vertices (separated by space). Order of different components doesn't matter.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Sample Input 1:
4 2
0 1
2 3
Sample Output 1:
0 1 
2 3 
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
0 1 3 
2
*/
package MileStone5.Graphs1;


	import java.util.LinkedList;
	import java.util.Queue;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	import java.util.*;

	public class allConnectedComponents {
	    
	    public static void help(int edges[][],boolean visited[],ArrayList<Integer> arr,int start){  
	        //here we are using DFS, that is recursion
	        visited[start]=true;
	        arr.add(start);
	        int n=edges.length;   
	          for(int j=0;j<n;j++){
	              if(edges[start][j]==1&&!visited[j]){
	                 help(edges,visited,arr,j); 
	              }
	          }
	    }
	     public static void helpp(int edges[][]){
	        boolean visited[]=new boolean[edges.length];  
	        for(int i=0;i<edges.length;i++){
	          if(!visited[i]){
	              // this array list is creating again and again
	             ArrayList<Integer> arrans= new ArrayList<Integer>();
	             help(edges,visited,arrans,i); //here we get a coonected graph startting from i
	             Collections.sort(arrans); //here we are sorting the values in the arraylist by using collections
	             for(int j=0;j<arrans.size();j++)
	                System.out.print(arrans.get(j)+" ");    //after 1 connected graph is printed , we will give a nw line
	            System.out.println();
	          }
	        }
	    }

		public static void main(String[] args) throws NumberFormatException, IOException {
	        
	     	Scanner s = new Scanner(System.in);
			int n = s.nextInt();
	        // total number of edges e
			int e = s.nextInt();
	        int edges[][]=new int[n][n];
	        for(int i=0;i<e;i++){
	            int fv=s.nextInt();
	            int sv=s.nextInt();
	            edges[fv][sv]=1;
	            edges[sv][fv]=1;
	        }
	        helpp(edges);
		}
	}