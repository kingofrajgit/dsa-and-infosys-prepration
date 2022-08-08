/*1. Sum of dependencies in a graph   -   Given a directed graph with V nodes and E edges. If there is an edge from u to v then u depends on v. Find out the sum of dependencies for every node. Duplicate edges should be counted as separate edges.

Example 1:

Input:
V=4
E=4
Edges={ {0,2},{0,3},{1,3},{2,3} }


Output:
4
Explanation:
For the graph in diagram, A depends
on C and D i.e. 2, B depends on D i.e.
1, C depends on D i.e. 1
and D depends on none.
Hence answer -> 0 + 1 + 1 + 2 = 4

Example 2:

Input:
V=4
E=3
Edges={ {0,3},{0,2},{0,1} }
Output:
3
Explanation:
The sum of dependencies=3+0+0+0=3.


Your Task:
You don't need to read input or print anything.Your task is to complete the function sumOfDependencies() which takes the adj (Adjacency list) and V (Number of nodes)as input parameters and returns the total sum of dependencies of all nodes.


Expected Time Complexity:O(V)
Expected Auxillary Space:O(1)


Constraints:
1<=V,E<=150

0<= Edges[i][0],Edges[i][1] <= V-1
*/

package infosyspriparationday5;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the node size :");
		int n = sc.nextInt();
		
		System.out.println("Enter the edge size :");
		int e = sc.nextInt();

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i = 0 ;i < e ; i++) {
			int u = sc.nextInt();// u - node
			int v = sc.nextInt();// v-node
			addEdg(adj,u,v);
		}
	
		print(adj);
		System.out.println();
		System.out.println("nodes"+" "+ " counts");
		int count =0;
		for(int i = 0;i<n;i++) {
			int c =0;
			for(int j =0;j<n;j++) {
				for(int l : adj.get(j)) {
					if(i==l) {
					c++;
					}
				}
			}
			System.out.println("node ->"+i+" "+"count ->"+c);
			count += c;
		}
		System.out.println(count);
	}
	private static void print(ArrayList<ArrayList<Integer>> adj) {
		for(int i = 0;i<adj.size();i++) {
			for(int e : adj.get(i)) {
				System.out.println("node-->"+" "+ i +" "+"edge-->"+e);
			}
		}
	}

	private static void addEdg(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);	
	}

}
