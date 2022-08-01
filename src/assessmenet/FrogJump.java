package assessmenet;

import java.util.ArrayList;
import java.util.List;

public class FrogJump {

	public static void main(String[] args) {
		String s = "SeleCtioN";
		int n = 9;
		int k = 1;
		opration(s, n, k);
	}

	private static void opration(String s, int n, int k) {
		List<Character> list = new ArrayList<>();
		char c = 0;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (j == 0 || j ==k ) {
				if(j ==k) {
					j=0;
				}
				if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					c = (char) (s.charAt(i) - 32);
					list.add(c);
				}
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					c = (char) (s.charAt(i) + 32);
					list.add(c);
				}
				j++;
			}else {
				list.add(s.charAt(i));
				j++;
			}
		}
		for (char a : list) {
			System.out.print(a);
		}
	}

}
