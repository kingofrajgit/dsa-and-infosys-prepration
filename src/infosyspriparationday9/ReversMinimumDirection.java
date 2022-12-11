
package infosyspriparationday9;
import java.util.*;
public class ReversMinimumDirection {
	int s ;
	int d ;
	 public ReversMinimumDirection(int s, int d) {
		 this.s=s;
		 this.d=d;
	 }
	 
	static ArrayList<Integer> path1 = new ArrayList<>();
	static ArrayList<Integer> path2 = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int dest = 6;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		ArrayList<ArrayList<Integer>> directGraph = new ArrayList<>();
		ArrayList<ReversMinimumDirection> list = new ArrayList<>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<>());
			directGraph.add(new ArrayList<>());
		}
		boolean[] b = new boolean[e];
		for(int j =0;j<e;j++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			ReversMinimumDirection obj = new ReversMinimumDirection(n1,n2);
			list.add(obj);
			directGraph.get(n1).add(n2);
			b[j] = false;
		}
//		for(int i =0;i<n;i++) {
//			
//			for(int j : directGraph.get(i)) {
//				if(i>j) {
//					adj.get(j).add(i);
//				}else {
//					adj.get(i).add(j);
//				}
//			}
//		}
//		for(ArrayList<Integer> l : adj) {
//		System.out.println(l);
//		}
//		fun(adj,dest,0);
//		System.out.println(path1);
//		check( directGraph);
		ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
		ArrayList<ArrayList<ReversMinimumDirection>> dpaths = new ArrayList<>();
		
		int i =0;
		int c=0;
		int min =0; 
		while(i<7) {
			if(c==0) {
				 min =0;
				 c = 0;
			}else {
				min+=1;
			}
			int l =0;
			ArrayList<Integer> path = new ArrayList<Integer>();
			ArrayList<ReversMinimumDirection> dpath = new ArrayList<>();
			path.add(0);
			
			for(ReversMinimumDirection obj : list) {
				int k =0;
				
				if(min == obj.s && b[l]==false) {
					path.add(obj.d);
					min = obj.d; 
					b[l]=true;
					i++;
					dpath.add(obj);
				}
				else if(min == obj.d && b[l]==false) {
					path.add(obj.s);
					dpath.add(obj);
					min = obj.s;
					b[l]=true;
					i++;
				}else {
					c++;
				}
				if(k==1) {
					break;
				}
				l++;
			}
			paths.add(path);
			dpaths.add(dpath);
		}
		int size = paths.size();
	for(int j =0;j<size;j++ )
	{
		for(ReversMinimumDirection l : dpaths.get(j)) {
			System.out.println(l.s+" "+l.d);
		}
	}
	}


	private static void check(ArrayList<ArrayList<Integer>> directGraph) {
		int l =0;
		int count =0;
		for(int i =0;i<directGraph.size();i++) {
			int k =0;
			for(int j : directGraph.get(i)) {
				
				if(i==path1.get(l) && j==path1.get(l+1)) {
					
				}else {
					count ++;
				}
				if(j==6) {
					k =1;
					break;
				}
				
			}
			if(k!=0) {
				break;
			}
		}
		System.out.println(count);
		
	}

	private static void fun(ArrayList<ArrayList<Integer>> adj, int dest, int s) {

			fun1(adj,dest,s);
		
	}

	private static void fun1(ArrayList<ArrayList<Integer>> adj, int dest, int s2) {
		path1.add(s2);
		for(int i : adj.get(s2)) {
			fun1(adj,dest,i);
		}
	}



}
