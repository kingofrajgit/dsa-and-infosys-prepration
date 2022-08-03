package infosyspriprationday2;

import java.util.*;

public class LangestPalindrom {

	public static ArrayList<String> sList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] s = str.toCharArray();
		findSubString(str.length(), s);
		str = "";
		for (String str1 : sList) {
			if (str.length() < str1.length()) {
				str = str1;
			}
		}
		System.out.println("longest subString length :" + str.length() + str);
		sc.close();

	}

	private static void findSubString(int size, char[] s) {
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				ArrayList<Character> list = new ArrayList<>();
				for (int k = i; k <= j; k++) {
					list.add(s[k]);
				}
				palindrom(list);
			}

		}
	}

	private static int palindrom(ArrayList<Character> list) {
		if (list.size() == 1) {
			sList.add(list.toString().replaceAll("[,\\s\\[\\]]", ""));
			return 0;
		}
		int m = list.size() / 2;
		int j = list.size() - 1;
		for (int i = 0; i < m; i++) {
			System.out.println(list);
			if (list.get(i) != list.get(j)) {
				return 0;
			}
			j--;
		}
		sList.add(list.toString().replaceAll("[,\\s\\[\\]]", ""));
		return 0;

	}

}
