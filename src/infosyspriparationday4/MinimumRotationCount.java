package infosyspriparationday4;

import java.util.*;

public class MinimumRotationCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m =0;
		int[] a = { 15, 18, 2, 3, 6, 12 };
		for (int i = 1; i < a.length; i++) {
			if (a[0] > a[i]) {
				a[0]=a[i];
				m=i;
			}
		}
		System.out.println(m);
	}
}
