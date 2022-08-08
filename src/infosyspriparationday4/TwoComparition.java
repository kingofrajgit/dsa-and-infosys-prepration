package infosyspriparationday4;

import java.util.*;

public class TwoComparition {

	public static int findDublicate(int[] a) {
		if (a[3] == a[4]) {
			return a[4];
		} else if (a[4] == a[5]) {
			return a[4];
		} else {
			return a[0];
		}
	}

	public static void main(String[] args) {
//		int[] a = new int[10];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
//			a[i] = sc.nextInt();
//		}
		int[] a = { 1, 1, 1, 1, 1, 5, 7, 10, 20, 30 };
		System.out.println(findDublicate(a));

	}
}
