package infosyspriparationday18;

import java.util.*;

public class ReArrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.replaceAll("[,\\s\\[\\]]", "");
		int n = str.length();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Character.getNumericValue(str.charAt(i));
		}
		Arrays.sort(a);
		int mid = a.length / 2;
		int l = mid - 1;
		if (a.length % 2 != 0) {
			System.out.print(a[mid] + " ");
			mid += 1;
		}
		for (int i = mid; i < n; i++) {
			System.out.print(a[i] + " " + a[l] + " ");
			l--;
		}
	}

}
