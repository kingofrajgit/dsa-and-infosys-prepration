/**
 * Question no 4 : 
Find minimum number of coins that make a given value
Given a value V, if we want to make a change for V cents, and we have an infinite supply of each of C = { C1, C2, .., Cm} valued coins, what is the minimum number of coins to make the change? If it’s not possible to make a change, print -1.
Input: coins[] = {25, 10, 5}, V = 30 Output: Minimum 2 coins required We can use one coin of 25 cents and one of 5 cents
Input: coins[] = {9, 6, 5, 1}, V = 11 Output: Minimum 2 coins required We can use one coin of 6 cents and 1 coin of 5 cents
This problem is a variation of the problem discussed Coin Change Problem. Here instead of finding the total number of possible solutions, we need to find the solution with the minimum number of coins.
The minimum number of coins for a value V can be computed using the below recursive formula.
If V == 0, then 0 coins required.
If V > 0
minCoins(coins[0..m-1], V) = min {1 + minCoins(V-coin[i])}
where i varies from 0 to m-1
and coin[i] <= V
Below is a recursive solution based on the above recursive formula.

 */

package infosyspriprationday3;

import java.util.*;

public class MinimumCoins {
	public static int c =0;
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] a = { 25, 10, 5 };
		int[] a =  {9, 6, 5, 1};
		Arrays.sort(a);
		int v = sc.nextInt();
		int size = a.length;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			int c =0;
			for (int j = i; j <= i; j++) {
					c+=a[j];
			}
			fun(a,c,i+1,v);
		}
		System.out.println(c);
	}

	public static int fun(int[] a, int n, int m, int v) {
		if (a.length>m && (n + a[m]) == v) {
			c+=2;
		}else {
			if(a.length>m) {
			fun(a,n,m+1,v);
			}else {
				return 0;
			}
		}
		return 0;
	}

}
