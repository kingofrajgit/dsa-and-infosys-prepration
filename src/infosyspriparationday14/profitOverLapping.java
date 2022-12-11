package infosyspriparationday14;

import java.util.Scanner;

public class profitOverLapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//15,34,67,78,90
		String sTime = sc.next();
		String eTime = sc.next();
		String profit =  sc.next();
		String[] s1 = sTime.split(",");
		String[] e1 = eTime.split(",");
		String[] p1 = profit.split(",");
		System.out.println(totalProfit(s1,e1,p1,s1.length));
		

	}

	private static int totalProfit(String[] s1, String[] e1, String[] p1,int n) {
		if(n != e1.length && e1.length > p1.length ) {
			return 0;
		}
		int[] s = new int[s1.length];
		int[] e = new int[e1.length];
		int[] p = new int[p1.length];
		for(int i=0;i<n;i++) {
			s[i] = Integer.parseInt(s1[i]);
			e[i] = Integer.parseInt(e1[i]);
			p[i] = Integer.parseInt(p1[i]);

		}
		int max =0;
		for(int i =0;i<n-2;i++) {
			if(s[i])
		}
		
		return null;
	}

}
