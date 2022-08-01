package infosys;

import java.util.*;

class Indices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 2, 5 };
		int len = a.length;
		int v = sc.nextInt();
		int n = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			list.add(a[i]);
		}
		if (!list.contains(v)) {
			System.out.println(list1);
		} else {
			Collections.sort(list);
			for (int i = 0; i < len - 1; i++) {
				n = Math.abs(list.get(i) - list.get(i + 1));
				list1.add(a[i]);
				if (n <= 0) {
					break;
				}

			}
			System.out.println(list1);
		}
	}
}
