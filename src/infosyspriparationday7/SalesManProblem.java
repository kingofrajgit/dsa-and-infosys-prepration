/*
 * 117.Travelling Salesman Problem 

Difficulty Level: Hard

Travelling Salesman Problem (TSP): 

Given a set of cities and the distance between every pair of cities, the problem is to find the shortest possible route that visits every city exactly once and returns to the starting point. Note the difference between Hamiltonian Cycle and TSP. The Hamiltonian cycle problem is to find if there exists a tour that visits every city exactly once. Here we know that Hamiltonian Tour exists (because the graph is complete) and in fact, many such tours exist, the problem is to find a minimum weight Hamiltonian Cycle. 

For example, consider the graph shown in the figure. A TSP tour in the graph is 1-2-4-3-1. The cost of the tour is 10+25+30+15 which is 80. The problem is a famous NP-hard problem. There is no polynomial-time know solution for this problem. The following are different solutions for the traveling salesman problem. 

Naive Solution: 

1) Consider city 1 as the starting and ending point.

2) Generate all (n-1)! Permutations of cities. 

3) Calculate the cost of every permutation and keep track of the minimum cost permutation. 

4) Return the permutation with minimum cost. 

Time Complexity: Θ(n!)

test case :
1 2 10
1 3 15
1 4 20
2 3 35
2 4 25
3 4 30

3
0 3 2
3 0 1
2 1 0
 */
package infosyspriparationday7;
	 
import java.util.*;

public class SalesManProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int node = sc.nextInt();
		int e = sc.nextInt();
		int[][] a = new int[node][node];
	
		for(int i =0;i<node;i++) {
			for(int j =0;j<node;j++) {
				a[i][i] = 0;
			}
		}
		for(int i =0;i<e;i++) {
			a[(sc.nextInt()-1)][(sc.nextInt()-1)] = sc.nextInt();
		}
//		for(int i =0;i<node;i++) {
//			for(int j =0;j<node;j++) {
//			
//				}
//		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<node;i++) {
			int min =0;
			for(int j =0;j<node;j++) {
				for(int k=i;k<node;k++) {
					if(a[j][k] != 0) {
						System.out.println(a[i][j]);
						min+=a[j][k];
						break;
					}
					
				}
			}
			list.add(min);
		}
		System.out.println(list);
	}

}
