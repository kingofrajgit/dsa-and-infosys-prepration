package infosyspriparationday11;

import java.util.*;

public class MotorBikeGame {
	int x;
	int y;
	int a;

	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 2;// sc.nextInt();
		int t = 1;// sc.nextInt();
		for (int i = 0; i < 4; i++) {
			list.add(new ArrayList<Integer>());
		}
		String l0 = "...0......";// sc.next();
		lanes(l0, 1);
		String l1 = "...00.....";// sc.next();
		lanes(l1, 2);
		String l2 = "...0..0...";// sc.next();
		lanes(l2, 3);
		String l3 = "...0......";// sc.next();
		lanes(l3, 4);
		// lanes
		for (ArrayList<Integer> i : list) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		Boolean b = true;

		while (b) {
			int s = sc.nextInt();
			int zero = 0;
			ArrayList<MotorBikeGame> input = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				MotorBikeGame m = new MotorBikeGame();
				m.x = sc.nextInt();
				m.y = sc.nextInt();
				m.a = sc.nextInt();
				input.add(m);
				if (m.a == 0) {
					zero = 1;
				}
			}
			int max = 0;
			for (MotorBikeGame m : input) {
				if (m.a != 0) {
					max = Math.max(max, trackFunc(s, m.x, m.y, m.a, zero));
				}
			}
			switch (max) {
			case 1:
				System.out.println("SPEED");
				break;
			case 2:
				System.out.println("JUMP");
				break;
			case 3:
				System.out.println("DOWN");
				break;
			case 4:
				System.out.println("WAIT");
				break;
			case 5:
				break;
			}
			System.out.println("do you want stop pleas enter false");
			b = sc.nextBoolean();

		}
	}

	private static int trackFunc(int s, int x, int y, int a, int zero) {
		if (list.get(y).get(x + s) == 0 && zero == 0) {
			return 2;

		} else if (list.get(y).get(x + s) == 0 && zero != 0) {
			return 3;
		} else if (list.get(y).get(x + s) != 0 && zero != 0) {
			return 4;

		}
//				}else if(list.get(y).get(x+s) != 0 && zero == 0 && ) {
//					
//				}
		else {
			return 1;

		}

	}

	private static void lanes(String l, int n) {
		char[] c = l.toCharArray();
		for (int i = n - 1; i < n; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '.') {
					list.get(i).add(1);
				} else {
					list.get(i).add(0);
				}
			}
		}
	}
}
