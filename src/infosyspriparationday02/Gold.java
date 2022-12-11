package infosyspriparationday02;
import java.util.*;

public class Gold {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
			 int[][] mine = new int[n][m];
			 for(int i =0;i<n;i++) {
				 for(int j =0;j<n;j++) {
					 mine[i][j]=sc.nextInt();
				 }
			 }
				
			 	System.out.println(maxGold(mine,n,m));
			}

			private static int  maxGold(int[][] mine, int n, int m) {
				int max=0;
				for(int i=0;i<n;i++) {
					int Collected = collectGold(mine,i,0,n,m);
					max=Math.max(max, Collected);
				}
				return max;
			}

			private static int collectGold(int[][] mine, int l, int k, int n, int m) {
				
				if((l<0)||(l==n) || k==m) 
					return 0;
				
				int upRightEle =collectGold(mine,l-1,k+1,n,m); 
				int rightEle =collectGold(mine , l, k+1, n, m);
				int lowRightEle =collectGold(mine,l+1,k+1,n,m);
				return  mine[l][k]+Math.max(Math.max(upRightEle, lowRightEle),rightEle);
			}

		}