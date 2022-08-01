package assessmenet;

public class VowelsCheck {

	public static void main(String[] args) {
		String s = "aetiaeliae";
		System.out.println(check(s));

	}

	private static int check(String s) {
		String rex = "aeiou";
		int len = s.length();
		int count = 0;
		int res = 0;
		int last = len % 3;
		for (int i = 0; i < len; i++) {
			String let = String.valueOf(s.charAt(i));
			if (rex.contains(let)) {
				count += 1;
			}
			if (((i + 1) % 3) == 0) {
				if (count == 3) {
					res += 1;
					count = 0;
				} else {
					count = 0;
				}
			}
			if (i == len - 1 && count == last) {
				res += 1;
			}
		}
		return res;
	}

}
