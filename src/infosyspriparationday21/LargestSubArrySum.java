package infosyspriparationday21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestSubArrySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int l = sc.nextInt();
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		int max = Integer.MIN_VALUE, res = 0, count = 0;
		for (int i = 0; i < l; i++) {
			for (int j = i; j < n; j++) {
				res = 0;
				for (int k = i; k <= j; k++) {
					res += arr[k];
				}
				list.add(res);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-l));
	}
	

}
