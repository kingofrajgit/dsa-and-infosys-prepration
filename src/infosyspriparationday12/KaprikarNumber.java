package infosyspriparationday12;

import java.util.*;

public class KaprikarNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n*n;
		String s = String.valueOf(m);
		int size = s.length() /2;
		String[] tokens = s.split("(?<=\\G.{" + size + "})");
		int ans = 0;
		for(String str : tokens) {
			ans+=Integer.parseInt(str);
			System.out.println(str);
		}
		System.out.println((ans==n)?"yes":"no"+ ans);
	}

}
