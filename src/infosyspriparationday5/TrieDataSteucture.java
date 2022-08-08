package infosyspriparationday5;

import java.util.*;

public class TrieDataSteucture {
	
	public static char chr ;

	public TrieDataSteucture( char l ) {
		this.chr = l;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		ArrayList<ArrayList<TrieDataSteucture>> adj = new ArrayList<>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<TrieDataSteucture>());
		}
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j =0;j<s.length();j++) {
				int b = check(adj,s.charAt(j),i);
			}
		}
		
		print(adj);
	}

	private static void print(ArrayList<ArrayList<TrieDataSteucture>> adj) {
		for(ArrayList<TrieDataSteucture> list : adj) {
			for(TrieDataSteucture trie : list) {
				System.out.println(trie.chr);
			}
		}
		
	}

	private static int check(ArrayList<ArrayList<TrieDataSteucture>> adj,char c,int i) {
		
		for(int j =0;j<=i;j++) {
			ArrayList<TrieDataSteucture> list = adj.get(j);
			
			if(!list.isEmpty()) {
				int k =0;
				
				for( TrieDataSteucture b : list) {
					System.out.println(b.chr);
					if(b.chr == c) {
						adj.get(i).add(b);
						k++;
						break;
					}
				}
				if(k==0) {
					adj.get(i).add(new TrieDataSteucture(c));
				}
			}
			else {
				adj.get(i).add(new TrieDataSteucture(c));
				break;
			}
			System.out.println(adj+" "+c);
		}
		return i;
	}

}
