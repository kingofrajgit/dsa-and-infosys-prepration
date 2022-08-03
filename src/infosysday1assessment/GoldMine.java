package infosysday1assessment;

import java.util.Scanner;

public class GoldMine {
	public static int res=0;

	public static void main(String[] args) {
//		int[][] mine = { { 1, 3, 3 }, { 2, 1, 4 }, { 0, 6, 4 } };
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
			 int[][] mine = new int[n][m];
			 for(int i =0;i<n;i++) {
				 for(int j =0;j<n;j++) {
					 mine[i][j]=sc.nextInt();
				 }
			 }
		
		func(mine, 0, 0, n);
		System.out.println(res);
	}
	private static int func(int[][] mine, int i, int j, int l) {
		
		if (l == j && i <l) {
			i = i + 1;
			j = 0;
			int ans = 0;
		}
		int ans = 0;
		
		if (j < l && i < l) {
			ans = func(mine, i, j+1 , l);
		}
		if (j < l  && i<l) {
			System.out.println(i+" -"+j+"-"+ans);
			ans= Math.max(ans, mine[j][i]);
			
		}
		if(j==0) {
			res+=ans;
			System.out.println("res:"+res);
			return 0;
		}
		return ans;
	}

}

