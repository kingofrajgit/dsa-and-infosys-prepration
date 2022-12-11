package infosyspriparationday13;

public class TriplestFunction {

	public static void main(String[] args) {
		int[] a = { 2, 5, 3, 1, 4, 9 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] < a[j] && a[j] < a[k]) {
						max = Math.max(max, fun(a[i], fun(a[j], a[k])));
					}
				}
			}
		}
		System.out.println(max);
	}

	private static int fun(int i, int j) {
		return i + j;
	}

}
