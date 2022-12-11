package infosyspriparationday12;
import java.util.*;

public class GaseStation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input strings
		String str1 = sc.nextLine(); 
		String str2 = sc.nextLine();
		
		char[] g = str1.toCharArray();
		char[] c = str2.toCharArray();
		
		int[] gase = new int[g.length];
		int[] cost = new int[c.length];
		int[] a = new int[g.length];
		
		if(g.length == c.length && g.length!=0 && c.length !=0) {
			for(int i =0;i<g.length;i++) {
				gase[i]=Character.getNumericValue(g[i]);
				a[i] = gase[i];
				cost[i]=Character.getNumericValue(c[i]);
			}
			
			for(int i =0;i<g.length;i++) {
				for(int j =0;j<g.length;j++) {
					if(cost[i]<cost[j]) {
						cost[i] = cost[j]+cost[i]-(cost[j]=cost[i]);
						gase[i] = gase[j]+gase[i]-(gase[j]=gase[i]);
					}
				}
			}
			int ans = gase[0];
			for(int i =1;i<g.length;i++) {
				ans =  ans - cost[i-1] + gase[i];	
			}
			
			if(cost[g.length-1] <= ans) {
				for(int i =0;i<g.length;i++) {
					if(a[i]==ans) {
						System.out.println(i-1);
					}
				}
			}else {
				System.out.println(-1);
			}
		}else {
			System.out.println(-1);
		}
	} 

}
