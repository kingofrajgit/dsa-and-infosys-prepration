package infosyspriparationday4;

import java.util.*;

public class TopologicalSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//no of test cases
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] count=new int[n];
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i = 0 ;i < m ; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			addEdg(adj,u,v);
		}
		System.out.println("befor topological sorting:");
		print(adj);
		System.out.println("after topological sorting:");
		topologicalSorting(adj,count);

	}

	private static void topologicalSorting(ArrayList<ArrayList<Integer>> adj,int[] count) {
		int l =1,k =1;
//		while(k < adj.size()) {
//			int  c=0;
//		for(int i =l;i<adj.size();i++) {
//				for(int v : adj.get(i)) {
//					if(v==l) {
//						c++;
//					}
//				}
//				
//		}
//		if( c == 0 && l<adj.size()) {
//			System.out.println("node --> "+l);
//			l=adj.get(l).get(0);
//			System.out.println(l);
//			k++;
//		}else {
//			l++;
//		}
//		}
		
		while(l < adj.size()) {
			count[l-1]=0;
		for(int i =1;i<adj.size();i++) {
				for(int v : adj.get(i)) {
					if(v==l) {
						count[l-1]+=1;
					}
				}
		}
		l++;
		}
		for(int m : count)
			System.out.println(m);
		
	}

	private static void print(ArrayList<ArrayList<Integer>> adj) {
		for(int i = 1;i<adj.size();i++) {
			for(int e : adj.get(i)) {
				System.out.println("node-->"+" "+ i +" "+"edge-->"+e);
			}
		}
	}

	private static void addEdg(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);	
	}

}
