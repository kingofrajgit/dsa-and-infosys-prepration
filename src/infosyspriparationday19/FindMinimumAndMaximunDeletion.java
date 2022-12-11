package infosyspriparationday19;

import java.util.*;

public class FindMinimumAndMaximunDeletion {
	static int count = 0;  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArr = str.split(",");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			list.add(Integer.parseInt(strArr[i]));
		}
		int min = list.indexOf(Collections.min(list));
		int mid = list.size() / 2;
		if (min < mid) {
			leftEndRemove(list, min);
		} else {
			rightEndRemove(list, min);
		}
		System.out.println("After minimum element is removing"+" "+list);
		if (!list.isEmpty()) {
			int max = list.indexOf(Collections.max(list));
			mid = list.size() / 2;
			if (max < mid) {
				leftEndRemove(list, max);
			} else {
				rightEndRemove(list, max);
			}
			System.out.println("After maximum element is removing"+" "+list);
		}
		System.out.println(strArr.length - list.size());

	}

	private static void rightEndRemove(ArrayList<Integer> list, int ele) {
		for (int i = list.size() - 1; i >= ele; i--) {
			list.remove(list.size() - 1);
		}
	}

	private static void leftEndRemove(ArrayList<Integer> list, int ele) {

		for (int i = 0; i <= ele; i++) {
			list.remove(0);
		}
	}
}
