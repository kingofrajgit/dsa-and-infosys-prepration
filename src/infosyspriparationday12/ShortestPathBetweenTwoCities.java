package infosyspriparationday12;

import java.util.*;

public class ShortestPathBetweenTwoCities {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] a = new int[n+1][n+1];
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=n; j++) {
				a[i][j] = 0;
			}
		}
		for (int i = 0; i <m; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int w = sc.nextInt();
			a[n1][n2] = w;
			a[n2][n1] = w;
			adj.get(n1).add(n2);
		}
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		int i = 0;
		while (i < q) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			i++;
			int count = 0;
			
//			for(int j = s; j < d; j++) {
//				for(int k=0;k<=d;k++) {
//					
//					count+=a[s][k];
//	
//				}
//			}
			int max = Math.max(a[s][d],fun(adj, a, s, s+1)); 
			System.out.println(count);
//			System.out.println(func(adj, a, s, d));
		}
	}

	private static int fun(ArrayList<ArrayList<Integer>> adj, int[][] a, int s, int i) {
		if() {
			
		}
		int c = 
		return 0;
	}

//	private static int func(ArrayList<ArrayList<Integer>> adj, int[][] a, int s, int d) {
//		int c = 0;
//		if (adj.get(s).size() != 0) {
//			for (int i = 0; i < adj.get(s).size(); i++) {
//				if (d != adj.get(s).get(i)) {
//					c += a[s][i];
//					func(adj, a, i, d);
//				} else {
//					return c;
//				}
//			}
//
//		}
//		else {
//			c = -1;
//		}
//		return c;
//
//	}

}
