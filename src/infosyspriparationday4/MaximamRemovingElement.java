//aaaabaaxccac
//baabcbbdcca
package infosyspriparationday4;

import java.util.*;

public class MaximamRemovingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		int count = 0, i = 0;
		while (i < n) {
			int c = 0, l = 0, k = 0;
			for (int j = i + 1; j < n; j++) {

				if (c > 1) {
					i = j - 3;
					break;
				}

				if (str.charAt(i) != str.charAt(j)) {
					l++;
					c++;
				} else {
					c = 0;
					k++;
				}

				if (k != 0 && j == n - 1) {
					i = n;
				}

			}
			if (l == 3) {
				l -= 2;
			}
			if (l == 1 || k == 0) {
				count++;
			}

			i++;
		}
		System.out.println(count);
	}

}
