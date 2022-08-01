package infosys;

import java.util.Scanner;
import java.util.*;

public class BinnaryAdding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Getting input using
		String a = sc.next();
		String b = sc.next();

		// Initialize the values
		int m = (Integer.parseInt(a)), n = (Integer.parseInt(b));

		// check the two vales are zeero or not
		// wether the two inputs are zero the output will be zero
		// print the value is zero and stop it
		if (m == 0 && n == 0) {
			System.out.println(0);
		} // The two inputs are not_zero the next step will proceed
		else {
			if (m < n) {
				binarryAdding(n, m);
			} else {
				binarryAdding(m, n);
			}
		}
	}

	public static void binarryAdding(int m, int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		int c = 0, sum = 0;

		while (m != 0) {
			// adding binary values one by one
			// ex m=11,n=1
			sum = (m % 10 + n % 10 + c) % 2;// ((11%10=1)+(1%10=1)+0)%2 = 2%2=0
			arr.add(sum);
			c = (m % 10 + n % 10 + c) / 2;
			m = m / 10;
			n = n / 10;
		}
		arr.add(c);
		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.print(arr.get(i));
		}

	}

}
