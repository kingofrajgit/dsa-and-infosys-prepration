package infosyspriparationday13;

import java.util.*;

public class NationalColour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll(" ","");
		char[] c = str.toCharArray();
		int[] a = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			a[i] = Character.getNumericValue(c[i]);

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					a[i] = a[i] + a[j] - (a[j] = a[i]);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
