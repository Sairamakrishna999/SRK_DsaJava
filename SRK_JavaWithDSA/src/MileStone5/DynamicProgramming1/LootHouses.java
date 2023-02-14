/*Loot Houses
Send Feedback
A thief wants to loot houses. He knows the amount of money in each house. 
He cannot loot two consecutive houses. Find the maximum amount of money he can loot.
Input format :
The first line of input contains an integer value of 'n'. It is the total number of houses.

The second line of input contains 'n' integer values separated by a single space denoting the amount of money each house has.
Output format :
Print the the maximum money that can be looted.
Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1 :
6
5 5 10 100 10 5
Sample Output 1 :
110
Sample Input 2 :
6
10 2 30 20 3 50
Sample Output 2 :
90
Explanation of Sample Output 2 :
Looting first, third, and the last houses([10 + 30 + 50]) will result in the maximum loot,
 and all the other possible combinations would result in less than 90.*/
package MileStone5.DynamicProgramming1;

public class LootHouses {



		public static int maxMoneyLooted(int[] houses) {
			//Your code goes here
			int n = houses.length;
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i]=-1;
			}
			return maxMoneyLooted(houses,n-1,arr);
		}
		public static int maxMoneyLooted(int houses[],int n,int arr[]){
			if(n<0){
				return 0;
			}
			if(n==0){
				return houses[0];
			}
			if(arr[n]!=-1){
				return arr[n];
			}
			
			int result1 = houses[n]+maxMoneyLooted(houses,n-2,arr);
			int result2 = maxMoneyLooted(houses,n-1,arr);
			arr[n]=Math.max(result1,result2);
			return arr[n];
		}
	}