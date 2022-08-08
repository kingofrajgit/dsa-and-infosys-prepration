package infosyspriparationday6;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i == 2 || i == 3) {
				print(i);
				continue;
			}
			if (i % 2 != 0 && i % 3 != 0) {
				print(i);
			}
		}
	}

	private static void print(int i) {
		System.out.println(i);

	}

}
